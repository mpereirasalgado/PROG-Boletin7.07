//Write by Seijas
package boletin7.pkg07;

import javax.swing.JOptionPane;

public class Triangulo {
    double base, altura;
    
    //constructores
    public Triangulo(){
        base = altura = 0;
    }
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //calcular area
    public void calcularArea(double base, double altura){
        JOptionPane.showMessageDialog(null, "El area del triangulo de base " + base + " y altura " + altura + " es de " + ((base*altura)/2) + "m^2");
    }
}
//Create by Seijas
//only to my lovers <3