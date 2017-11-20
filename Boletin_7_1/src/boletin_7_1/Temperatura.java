/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_1;

/**
 *
 * @author mfrancomartinez
 */
public class Temperatura {
    double temperaturafahrenheit;
    double temperaturacelsius;
    
    double celsiusAFahrenheit (double tem){
        temperaturafahrenheit = (9*tem)/5+32;        
        System.out.println("La temperatura en fahrenheit es: "+temperaturafahrenheit);
        return temperaturafahrenheit;
    }
    double fahrenheitACelsius(double temp){
        temperaturacelsius = 1.8*temp+32;
        System.out.println("La temperatura en celsius es: "+temperaturacelsius);
        return temperaturacelsius;
    }
}
