/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.placevalues;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author agalloway
 */
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number to count place values:");
            int number = sc.nextInt();
            sc.nextLine();
            NumberPlaces np = new NumberPlaces(number);
            System.out.println("The places count for " + number + " are " + np);
            System.out.println("Enter Q to quit, anything else to go again");
        } while (!sc.nextLine().equalsIgnoreCase("Q"));
        
        BigDecimalValueEnum var = BigDecimalValueEnum.QUARTER;
        BigDecimal val = BigDecimalValueEnum.NICKEL.value();
        
    }
    
}
