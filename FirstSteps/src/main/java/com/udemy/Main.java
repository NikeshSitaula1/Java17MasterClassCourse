package com.udemy;

public class Main {
//public = access modifier, allows us to define which parts of our code someone can see. opposite: private

    public static void main(String[] args) {
        // void: indicates that the method won't return any information

        // WHOLE NUMBERS
        int myNum = 10_000; // underscore works like a comma.
        long myLongValue = 100L; // need l or L for long, as 100 by default is an int. Java defaults whole numbers into an int
        long myMaxValue = 2_147_483_647_234L; //without L, it would have given an error, as int max is 2,147,483,647

        byte myMinByteValue = -128;

        byte myByteValue = (byte) (myMinByteValue / 2); // without casting, it will default as int, and as such will give an error

        // Primitive number data types and its range
        System.out.println("Byte value range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE ); // 8bits
        System.out.println("Short value range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE ); // 16 bits
        System.out.println("Integer value range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE ); // 32 bits
        System.out.println("Long value range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE ); // 64 bits
        System.out.println(Integer.SIZE); // shows its 32 bits

        // primitive type challenge
        byte byteValue = 24;
        short shortValue = 130;
        int intValue = 1000;
        long longValue = 50_000 + (10 * (byteValue + shortValue + intValue));
        System.out.println("Long value is: " + longValue);


        // FLOATING POINT NUMBERS
        // Default decimal number is a double and NOT float
        // Floating Data types and its range
        System.out.println("Float value range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE); // 32 bits capital Float is a wrapper class
        System.out.println("Double value range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE); // 64 bits

        // floating number challenge
        double myPounds = 110;
        double poundToKilogram = 0.45359237;
        double myKilograms = myPounds * poundToKilogram;
        System.out.println("kilogram converter of " + myPounds + " lbs= " + myKilograms + "kg");

        // UNICODE
        // website for Unicode: symbl.cc
        char myUnicode = '\u2122';// when adding Unicode, do not add +, eg: Unicode number was U+2122
        char myDecimalCode = 8482; // html code, can only work in char
        System.out.println("" + myUnicode + myDecimalCode); // "" makes the char into a string and now can be added.


        String myString = "10";
        int myInt = 10;
        myString = myString + myInt;
        System.out.println(myString); // automatically concatenates int into string and gives output = 1010
        // Strings are immutable, immutable: you can change string after its created. StringBuilder is mutable, can be changed

        // Compound Assignment challenge
        double result = 10;
        result -= 5.5; // result =  (data type of result) (result - 5.5)
        System.out.println(result);



    }
}