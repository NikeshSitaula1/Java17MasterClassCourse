package com.udemy;

public class Main {
    public static void main(String[] args) {

        int number = 5;
        int countEven = 0;
        int countOdd = 0;

        while(number <= 20){


            if (isEvenNumber(number)){
                System.out.println(number);
                countEven++;
            }
            else{
                countOdd++;
            }
            number++;

            if(countEven == 5){
                break;
            }
        }
        System.out.println("even numbers Total: " + countEven);
        System.out.println("odd numbers Total: " + countOdd);
    }

    public static boolean isEvenNumber(int x){
        return x % 2 == 0;
    }
}

