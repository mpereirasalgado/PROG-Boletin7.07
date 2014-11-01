//Write by Seijas
package boletin7.pkg07;

import javax.swing.JOptionPane;

public class Cuadrado {
    double lado;
    
    //constructores
    public Cuadrado(){
        lado = 0;
    }
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    //calcular area
    public void calcularArea(double lado){
        JOptionPane.showMessageDialog(null, "El area del cuadrado de lado " + lado + " es de " + (Math.pow(lado, 2)) + "m^2");
    }
}
//Created by Seijas
//To my Fans and lovers <3