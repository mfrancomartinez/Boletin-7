/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_2;

/**
 *
 * @author mfrancomartinez
 */
public class Coche {
    private int velocidade;
    Coche(){
        velocidade = 0;
    }
    int getvelocidade(){
        System.out.println("La velocidad actual es: "+velocidade);
        return velocidade;
    }
    void acelerar (int cantidade){
        velocidade = velocidade + cantidade;
        System.out.println("La nueva velocidad tras la aceleración es: "+velocidade);
    }
    void frena (int menos){
        velocidade = velocidade - menos;
        System.out.println("La nueva velocidad tras el freno es: "+velocidade);
    }
}
