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
public enum Places {
    ONES(1),
    TENS(10),
    HUNDREDS(100),
    THOUSANDS(1000);
    
    private final int value;
    
    Places(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
}
