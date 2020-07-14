/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.factorizorplus;

import java.util.Scanner;

/**
 *
 * @author agalloway
 */
public class FactorizorPlus {

    public static void main(String[] args) {
        
        FactorizedNumber num = new FactorizedNumber(getNumber());
        displayFactors(num);
        

    }

    private static int getNumber() {
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
                number = 0;
            }
        } while (number == 0);
        return number;
    }
    
    private static void displayFactors(FactorizedNumber factored) {
        
        System.out.println(factored.toString());
        
    }
}
