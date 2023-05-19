public class Main {
    public static void main(String[] args) {
    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        //going to check if the cigars are within bounds and it is the weekend  with OR conditions
        if ((cigars <= 60 && cigars >= 40) && isWeekend == false) {
            return true; //Its going to return false if these conditions are met
        }else if (cigars >= 40 && isWeekend == true) { // taking the upper bound away if it is the weekend
            return true; // if it is not the weekend and the cigar count are within bounds then it will just return true.
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        if(you <= 2 || date <= 2){ //starting from bottom up where we can catch any 2's first
            return 0;
        }else if (you >= 8 || date >= 8){ //Now making that any 8's will return a 2
            return 2;
        }
        return 1; // then anything else will get a 1 for a maybe table
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer == true){//First lets check if it is summer
            if (temp >=60 &&temp <= 100 ) // if so then we set the upper limit to 100
            {
                return true;
            }
        }else if (isSummer == false) {// if it is not summer then we set the upper limit to 90
            if (temp >= 60 && temp <= 90) {
                return true;
            }
        }
        return false; //Return false
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        //Easier to start backwards on this
        if ((isBirthday == false && speed >= 81) || (isBirthday == true && speed >= 86)){// this should account for the highest limit and with the birthday bonus as well
            return 2;
        }else if((isBirthday == false && (speed <= 80 && speed >= 61)))//check for the false birthday first with the regular bounds
        {
            return 1;
        }
        else if((isBirthday == true && (speed <= 85 && speed >= 66))) // now for the bonus bounds
        {
            return 1;
        }else if (isBirthday == true && (speed <= 65)) // lastly the bonus upper bound for not getting a ticket
            return 0;
        else{ //lastly for anything else that happens the driver gets a 0
            return 0;
        }
    }

    public int sortaSum(int a, int b) {
        int sum = a +b; // grab the sum from the 2 ints
        if(sum >= 10 && sum <= 19){// anything in these bounds are returning 20
            return 20;
        }
        return sum; //anything outside the bounds gives the actual sum
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation == true) {//Lets check if we are on vacation

            if ((day >= 1) && day <= 5) {// set the bounds between for the days week days of vacation
                return "10:00";
            }else if ((day == 0) || day >= 6){ //This is for the weekend
                return "off";
            }
        } else if (vacation ==false) { //Now for the non vacation days
            if ((day >= 1 ) && day <= 5) {// set the bounds between for the days week days of vacation
                return "7:00";
            }
        }
        return "10:00";


    }

    public boolean love6(int a, int b) {
        //create the opperations for the sum and difference
        int sum = a + b;
        int diff = Math.abs(a - b); //Math.abs allows us to take teh absolute value of the difference
        if (a == 6 || b == 6){ //If any of the numbers are 6 then we are going to return true
            return true;
        }
        if (sum == 6 || diff == 6){//once the operations are done if the result is 6 then true
            return true;
        }else {//output false for anything else
            return false;
        }


    }

    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode ==  true){ //checking to see if outsideMode is on
            if(n >=  10 || n <= 1){ //if so then we need to check the outer bounds of 1-10
                return true;
            }
        }else if (outsideMode == false) {// no to do the opposite of outside mode
            if(n <=  10 && n >= 1){
                return true;
            }
        }
        return  false;
    }

}