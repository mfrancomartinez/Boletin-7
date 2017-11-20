/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_4;

/**
 *
 * @author mfrancomartinez
 */
public class ContaBancaria {
    public String numConta;
    public String titular;
    public Float saldo;
    ContaBancaria(){
        
    }
       public ContaBancaria(String numConta, String titular, Float saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void setnumConta(String nConta){
        numConta = nConta;
    }     
    public void settitular(String tit){
        titular = tit;
    }
    public void setsaldo(Float sal){
        saldo = sal;
    }
    public String getnumConta(){
        return numConta;
    }
    public String gettitular(){
        return titular;
    }
    public float getsaldo(){
        return saldo;
    }
    public void ingresar (float cantidade){
        saldo = saldo + cantidade;
        System.out.println("La nueva cantidad de saldo es: "+saldo);
    }
    public void retirar (float cant){
        if (saldo<cant){
           System.out.println("Saldo insuficiente");
        }
        else{
             saldo = saldo - cant;
            System.out.println("El saldo restante es: "+saldo);
        }
    }
    public void arruinar (){
        numConta = null;
        titular = null;
        saldo = null;
        System.out.println("La cuenta ha sido reseteada.");
    }    

    @Override
    public String toString() {
        return "ContaBancaria{" + "numConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo + '}';
    }

    
}
