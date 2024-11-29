package com.udemy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (!isAlien){
            System.out.println("It is not an alien");
        }
        int topScore = 90;
        if (topScore == 100){ // = assigns the value, which we are not doing. == is equals to, a condition
            System.out.println("You got the high score!");
        }
        else if (topScore >= 70 && topScore < 100) {
            System.out.println("Close to 100 for high score");
        }
        else if (topScore < 70) {
            System.out.println("Not close to 100");
        }

        boolean isCar = false;
        if (!isCar){ // ! = NOT, for false
            System.out.println("This is not supposed to happen");
        }

        //TERNARY OPERATOR
        //(condition) ? (if true, do this) : (otherwise, do this)
        String makeOfCar = "Volkswagon";
        boolean isDomestic = makeOfCar == "Volkswagon" ? false : true;

        if(!isDomestic) {
            System.out.println("This car is domestic to the country");
        }

        String s = (!isDomestic) ? ("This car is not domestic") : ("This car is domestic");
        System.out.println(s);


        // Operator Challenge
        double num1 = 20;
        double num2 = 80;
        double numCalc = (num1 + num2) * 100;
        System.out.println(numCalc);

        double numRemain = numCalc % 40;
        System.out.println(numRemain);

        boolean numBool = (numRemain == 0) ? (true) : (false);
        System.out.println(numBool);

        String numRemainder = (!numBool) ? ("Got some remainders") : ("NO remainders!!");
        System.out.println(numRemainder);

//        if (!numBool){
//            System.out.println("Got some remainder");
//        }
//        else {
//            System.out.println("NO remainders!!");
//        }

    }
}