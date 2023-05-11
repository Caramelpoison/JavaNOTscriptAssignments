public class Main {
    public static void main(String[] args) {

        BankAccount accountP = new BankAccount("Billy", 500);
        BankAccount account1 = new BankAccount("Larry", 5000);
        BankAccount account2 = new BankAccount("Mary", 300);

        accountP.deposit(100);
        accountP.bankStatement();

        System.out.println("############### Bank Transfer Part ###############");

        account1.bankTransfer(account1, account2, 100);

        System.out.println("############### Product Part ###############");

        Product product1 = new Product("Hector Shirts", 25.0, 5);

        product1.printProduct(product1);

        product1.totalCost(product1, 2);


    }



}