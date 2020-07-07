package com.aspire.windowmaster;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agalloway
 */
public class WindowMaster {
    public static void main(String[] args) {
        // variables for the dimensions
        float height;
        float width;
        
        // string variables for input
        String stringHeight;
        String stringWidth;
        
        // calculation variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner myScanner = new Scanner(System.in);
        //get user input
        System.out.println("Please enter Window height:");
        stringHeight = myScanner.nextLine();
        
        System.out.println("Please enter Window width:");
        stringWidth = myScanner.nextLine();
        
        // convert string to float
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // calculate area
        areaOfWindow = height * width; 
        
        //calculate the perimeter
        perimeterOfWindow = 2 *(height + width);
        // perim = 2*height + 2*width
        
        // calculate cost of the window
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        System.out.println(" Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
    
}
