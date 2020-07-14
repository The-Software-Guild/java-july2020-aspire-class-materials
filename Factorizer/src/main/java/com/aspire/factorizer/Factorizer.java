/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.factorizer;

import java.util.Scanner;

/**
 *
 * @author agalloway
 */
public class Factorizer {

    public static void main(String[] args) {
        int numToFactor;
        int[] factors;
        numToFactor = getNumber();
        factors = getFactors(numToFactor);
        displayFactors(factors);

    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        //add code here to prompt for user data
        do {

            System.out.println("Enter a positive number larger than 1 to calculate the factors");
            String input = sc.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(input + " is not a whole numeric value");
            }
            if (number < 2) {
                number=0;
            }
        } while (number == 0);
        return number;
    }

    private static int[] getFactors(int numToFactor) {
        int[] factors = new int[numToFactor];
        int count = 1;
        factors[0] = 1;
        for (int i = 2; i <= numToFactor / 2; i++) {
            if (numToFactor % i == 0) {
                factors[count] = i;
                count++;
            }

        }
        //add one to count for the factored number
        count++;
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = factors[i];
        }
        result[result.length - 1] = numToFactor;
        return result;
    }

    private static void displayFactors(int[] factors) {
        int number = factors[factors.length - 1];

        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(""); //end of line character from array
        System.out.println(number + " has " + factors.length + " factors.");

        if (isPrime(factors)) {
            System.out.println(number + " is a prime number");
            System.out.println(number + " is a not a perfect number");
        } else {
            System.out.println(number + " is a not a prime number");
            if (isPerfect(factors)) {
                System.out.println(number + " is a perfect number");
            } else {
                System.out.println(number + " is a not a perfect number");
            }
        }
    }

    private static boolean isPrime(int[] factors) {
        return factors.length == 2;
    }

    private static boolean isPerfect(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum == factors[factors.length - 1];
    }
}
