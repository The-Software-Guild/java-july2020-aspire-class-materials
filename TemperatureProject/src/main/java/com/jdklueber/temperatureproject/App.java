/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdklueber.temperatureproject;

import java.util.Scanner;

/**
 *
 * @author jason
 */
public class App {
    public static void main(String[] args) {
        do {
            double inputTemp = getTemperatureInput();
            String scale = getTempScale(); //C of F
            double convertedTemp = convertTemp(inputTemp, scale);
            printConversionReport(inputTemp, scale, convertedTemp);
        } while(keepGoing());
    }

    private static double getTemperatureInput() {
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a temperature to convert: ");
        String input = scanner.nextLine();
        result = Double.valueOf(input);
        
        return result;
    }

    private static String getTempScale() {
        String result = "";
                
        boolean goodInput = false;
        Scanner scanner = new Scanner(System.in);
        
        while(!goodInput) {        
            System.out.println("C or F?");
            String input = scanner.nextLine();
            if (!input.equals("C") && !input.equals("F")) {
                System.out.println("Input must be C or F.");
            } else {
                result = input;
                goodInput = true;
            }
        }        
        
        
        return result;
    }

    private static double convertTemp(double inputTemp, String scale) {
        double result = 0.0;
        
        switch(scale) {
            case "C":
                result = convertCtoF(inputTemp);
                break;
            case "F":
                result = convertFtoC(inputTemp);
                break;
        }
        
        return result;
    }

    private static void printConversionReport(double inputTemp, String scale, double convertedTemp) {
        String oppositeScale = "";
        
        switch(scale) {
            case "C":
                oppositeScale = "F";
                break;
            case "F":
                oppositeScale = "C";
                break;
        }
        
        System.out.println(convertedTemp + oppositeScale);
    }

    private static double convertCtoF(double inputTemp) {
        //(0°C × 9/5) + 32 
        return inputTemp * (9.0/5.0) + 32;
    }

    private static double convertFtoC(double inputTemp) {
        //(28°F − 32) × 5/9
        return (inputTemp - 32) * (5.0/9.0);
    }

    private static boolean keepGoing() {
        boolean result = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Keep going? (y/N): ");
        String input = scanner.nextLine();
        
        if (input.equalsIgnoreCase("Y")) {
            result = true;
        }
        
        return result;
    }
}
