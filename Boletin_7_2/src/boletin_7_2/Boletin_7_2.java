/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_2;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Coche obx = new Coche();
        System.out.println("Inserta el valor con el que desea incrementar la velocidad:");
        obx.acelerar(sc.nextInt());
        System.out.println("Inserta el valor con el que desea reducir la velocidad:");
        obx.frena(sc.nextInt());
        obx.getvelocidade();


    }
    
}
