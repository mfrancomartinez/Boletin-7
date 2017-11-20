/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_3;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Rebaixas obx = new Rebaixas();
    System.out.println("Inserte el precio, y el precio rebajado respectivamente:");
    obx.calculaPorcentaxe(sc.nextDouble(),sc.nextDouble());
    }
    
}
