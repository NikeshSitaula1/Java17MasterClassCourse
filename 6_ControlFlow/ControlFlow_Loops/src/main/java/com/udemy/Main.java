package com.udemy;

public class Main {
    public static void main(String[] args) {

        // Prime Number challenge - #62
        int count = 0;
        for (int i = 10; i <= 50 && count < 3; i++){
            if(PrimeNumbersLoop.isPrime(i)){
                System.out.println("number " + i +  " is prime number");
                count++;
            }
        }

        // Sum of 3 and 5 challenge - #63
        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i ++){

            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("These are number divisible by 3 and 5: " + i);
                sum += i;
                counter++;

            }
            if (counter == 5){
                break;
            }
        }
        System.out.println("Sum =" + sum);
    }
}