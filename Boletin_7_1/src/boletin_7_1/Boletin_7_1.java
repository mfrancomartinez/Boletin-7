/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_1;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      Temperatura obx = new Temperatura();
      System.out.println("Inserte temperatura en celsius: ");
      obx.celsiusAFahrenheit(sc.nextDouble());
      System.out.println("Inserte temperatura en fahrenheit: ");
      obx.fahrenheitACelsius(sc.nextDouble());
    }
    
}
