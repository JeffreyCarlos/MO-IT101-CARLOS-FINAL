/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sss_contributiontable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SSS_ContributionTable {
    public static double calculateSSSContribution(double compensation){
        if (compensation < 3000) return 120.00;
        else if (compensation < 3000) return 140.00;
        else if (compensation < 3500) return 160.00;
        else if (compensation < 4000) return 180.00;
        else if (compensation < 4500) return 200.00;
        else if (compensation < 5000) return 220.00;
        else if (compensation < 5500) return 240.00;
        else if (compensation < 6000) return 260.00;
        else if (compensation < 6500) return 280.00;
        else if (compensation < 7000) return 300.00;
        else if (compensation < 7500) return 320.00;
        else if (compensation < 8000) return 340.00;
        else if (compensation < 8500) return 360.00;
        else if (compensation < 9000) return 380.00;
        else if (compensation < 9500) return 400.00;
        else if (compensation < 10000) return 420.00;
        else return 440;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the compensation: ");
        double compensation = scanner.nextDouble();
        
        double contribution = calculateSSSContribution(compensation);
        
       System.out.println("Your SSS contribution is: " + contribution);
       scanner.close();
    }
}
