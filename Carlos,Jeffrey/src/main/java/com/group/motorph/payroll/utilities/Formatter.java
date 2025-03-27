/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.motorph.payroll.utilities;

/**
 *
 * @author 
 * Carlos, Jeffrey
 * 
 * 
 * 
 * 
 * 
 */

public class Formatter {
    
    /**
     * Formats a decimal value to two decimal places for display purposes.
     *
     * @param value The decimal value to format
     * @return A formatted string with two decimal places
     */
    public static String formatDecimal(double value) {
        return String.format("%.2f", value);
    }
    
}
