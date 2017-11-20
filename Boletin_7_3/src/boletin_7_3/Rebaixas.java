/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_3;

/**
 *
 * @author mfrancomartinez
 */
public class Rebaixas {
    public double porcentaxe;
    public double calculaPorcentaxe (double prezo, double prezorebaixado){
      porcentaxe = (prezorebaixado/prezo)*100;
      System.out.println("El porcentaje es:"+porcentaxe);
      return porcentaxe;
    }
}
