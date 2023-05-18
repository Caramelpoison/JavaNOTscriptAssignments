package com.blackjack;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        boolean endRound = false;
        System.out.println("Welcome to Blackjack!");

        // Create the playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        // Create hands for the player and the dealer - hands are created from methods that are made in the deck class
        Deck playerHand = new Deck();
        Deck dealerHand = new Deck();

        double playerMoney = 1000.00;
        Scanner userInput = new Scanner(System.in);

        // Game loop
        while (playerMoney > 0) {
            System.out.println("You have $" + playerMoney + ", how much money are you willing to bet?");
            double playerBet = userInput.nextDouble();
            if (playerBet > playerMoney) {
                System.out.println("You bet more than you have.");
                break;
            }

            playerHand.draw(playingDeck);
            playerHand.draw(playingDeck);
            dealerHand.draw(playingDeck);
            dealerHand.draw(playingDeck);

            while (true) {
                System.out.println("Your hand: " + playerHand.toString());
                System.out.println("Your hand is equal to " + playerHand.cardsValue());

                System.out.println("Dealer's hand: " + dealerHand.getCard(0).toString() + " and a hidden card");
                System.out.println("Would you like to Hit? (Y/N)");
                String choice = userInput.next();

                if (choice.equalsIgnoreCase("Y")) {
                    playerHand.draw(playingDeck);
                    System.out.println("You draw a: " + playerHand.getCard(playerHand.deckSize() - 1).toString());
                    if (playerHand.cardsValue() > 21) {
                        System.out.println("You busted!! Your card amount is at " + playerHand.cardsValue());
                        playerMoney -= playerBet;
                        endRound = true;
                        break;
                    }
                } else if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }

            System.out.println("Dealer's cards: " + dealerHand.toString());

            if (playerHand.cardsValue() <= 21 && !endRound) {
                while (dealerHand.cardsValue() < 17) {
                    dealerHand.draw(playingDeck);
                    System.out.println("Dealer draws: " + dealerHand.getCard(dealerHand.deckSize() - 1).toString());
                }

                System.out.println("Dealer's hand is valued at: " + dealerHand.cardsValue());

                if (dealerHand.cardsValue() > 21) {
                    System.out.println("Dealer busts!! You win!!");
                    playerMoney += playerBet;
                    endRound = true;
                } else if (playerHand.cardsValue() == dealerHand.cardsValue()) {
                    System.out.println("It's a tie!!");
                    endRound = true;
                } else if (playerHand.cardsValue() > dealerHand.cardsValue()) {
                    System.out.println("You win!!");
                    playerMoney += playerBet;
                    endRound = true;
                } else {
                    System.out.println("Dealer wins!! Better luck next time.");
                    playerMoney -= playerBet;
                    endRound = true;
                }
            }

            playerHand.moveAllToDeck(playingDeck);
            dealerHand.moveAllToDeck(playingDeck);

            System.out.println("End of round");
            endRound = false;
        }

        System.out.println("You've lost all your money. Better luck next time.");
    }
}
