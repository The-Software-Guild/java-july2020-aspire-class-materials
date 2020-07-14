/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.factorizorplus;

/**
 *
 * @author agalloway
 */
public class FactorizedNumber {

    @Override
    public String toString() {

        String formattedOutput;

        formattedOutput = "The factors of " + number + " are: \n";
        for (int i = 0; i < factors.length; i++) {
            formattedOutput += factors[i] + " ";
        }
        formattedOutput += "\n";
        formattedOutput += number + " has " + factors.length + " factors.\n";

        if (isPrime()) {
            formattedOutput += number + " is a prime number\n";
            formattedOutput += number + " is a not a perfect number\n";

        } else {
            formattedOutput += number + " is a not a prime number\n";
            if (isPerfect()) {
                formattedOutput += number + " is a perfect number\n";
            } else {
                formattedOutput += number + " is a not a perfect number\n";
            }
        }

        return formattedOutput;
        //return "FactorizedNumber{" + "number=" + number + ", factors=" + factors + ", isPrime=" + isPrime + ", isPerfect=" + isPerfect + '}';
    }

    private final int number;
    private final int[] factors;
    private final boolean isPrime;
    private final boolean isPerfect;

    public FactorizedNumber(int providedNumber) {
        number = providedNumber;
        int[] tempFactors = new int[number];
        int count = 1;
        tempFactors[0] = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                tempFactors[count] = i;
                count++;
            }

        }
        //add one to count for the factored number
        count++;
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = tempFactors[i];
        }
        result[result.length - 1] = number;
        factors = result;

        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        isPerfect = (sum == factors[factors.length - 1]);

        isPrime = (factors.length == 2);

    }

    public int getNumber() {
        return number;
    }

    public int[] getFactors() {
        return factors;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public boolean isPerfect() {
        return isPerfect;
    }

}
