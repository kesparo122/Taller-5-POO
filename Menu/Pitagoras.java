/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomenus;

/**
 *
 * @author santi
 */
public class Pitagoras {
    public static double CalcularHipotenusa(double a, double b){
        double hipotenusa;
        hipotenusa= Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        return hipotenusa;
    }
}
