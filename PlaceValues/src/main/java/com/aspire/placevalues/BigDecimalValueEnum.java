/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.placevalues;

import java.math.BigDecimal;

/**
 *
 * @author agalloway
 */
public enum BigDecimalValueEnum {
    QUARTER(new BigDecimal("0.25")),
    NICKEL(new BigDecimal("0.05"));
    
    private final BigDecimal value;
    
    BigDecimalValueEnum(BigDecimal value) {
        this.value = value;
    }
    
    public BigDecimal value() {
        return value;
    }
    
   
    
}
