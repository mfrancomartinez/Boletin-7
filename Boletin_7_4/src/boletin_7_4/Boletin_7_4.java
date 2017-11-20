/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_4;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    ContaBancaria obx = new ContaBancaria();
    System.out.println("Inserte el número de cuenta: ");
    obx.setnumConta(sc.nextLine());
    obx.getnumConta();
    System.out.println("Inserte el nombre del titular: ");
    obx.settitular(sc.nextLine());
    obx.gettitular();
    System.out.println("Inserte la cantidad de saldo: ");
    obx.setsaldo(sc.nextFloat());
    obx.getsaldo();
    System.out.println("Inserte la cantidad que desea ingresar: ");
    obx.ingresar(sc.nextFloat());
    System.out.println("Inserte la cantidad que desea retirar: ");
    obx.retirar(sc.nextFloat());
    obx.arruinar();
    obx.toString();
    System.out.println(obx.toString());
    }
    
}
