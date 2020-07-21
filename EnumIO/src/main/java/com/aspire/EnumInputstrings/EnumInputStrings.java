/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.EnumInputstrings;

import java.util.Scanner;

/**
 *
 * @author agalloway
 */
public class EnumInputStrings {
    public enum Days {MONDAY, TUESDAY, NODAY}
    
    public static void main(String[] args) {
        System.out.println("Enter a day");
        Scanner sc=new Scanner(System.in);
        String strday = sc.nextLine().toUpperCase();
        Days day;
        try {
           day = Days.valueOf(strday);
        } catch (Exception e) {
            day = Days.NODAY;
        }
        
        switch (day){
            case MONDAY:
                System.out.println("You chose Monday");
                break;
            case TUESDAY:
                System.out.println("You chose Tuesday");
                break;
            default:
                System.out.println("Not one of my days");
        }
    }
    
}
