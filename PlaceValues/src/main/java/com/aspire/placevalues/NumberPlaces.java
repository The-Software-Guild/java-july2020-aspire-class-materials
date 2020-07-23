/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.placevalues;



/**
 *
 * @author agalloway
 */
public class NumberPlaces {
    
    private int numThousands;
    private int numHundreds;
    private int numTens;
    private int numOnes;
    
    public NumberPlaces(int value) {
       while(value > Places.THOUSANDS.value()) {
           numThousands++;
           value -= Places.THOUSANDS.value();
       }
       while(value > Places.HUNDREDS.value()) {
           numHundreds++;
           value -= Places.HUNDREDS.value();
       }
       while(value > Places.TENS.value()) {
           numTens++;
           value -= Places.TENS.value();
       }
       while(value >= Places.ONES.value()) {
           numOnes++;
           value -= Places.ONES.value();
       }
    }

    public int getNumThousands() {
        return numThousands;
    }

    public int getNumHundreds() {
        return numHundreds;
    }

    public int getNumTens() {
        return numTens;
    }

    public int getNumOnes() {
        return numOnes;
    }

    @Override
    public String toString() {
        return "NumberPlaces{" + "numThousands=" + numThousands + ", numHundreds=" + numHundreds + ", numTens=" + numTens + ", numOnes=" + numOnes + '}';
    }
    
    
    
}
