package com.udemy;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,11));
    }

    public static boolean isOdd(int number){

        if (number < 0){
            return false;
        }

        else {
            return number % 2 != 0;
        }
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
            else{
                sum = -1;
            }
        }
        return sum;
    }
}