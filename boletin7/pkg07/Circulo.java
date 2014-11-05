//Write by Seijas
package boletin7.pkg07;

import javax.swing.JOptionPane;

public class Circulo {
    double PI = 3.14159;
    double radio;
    
    //Constructores
    public Circulo(){
        radio = 0;
    }
    public Circulo(double radio){
        this.radio = radio;
    }
    
    //introducion datos
    public double setRadio(){
        String resposta = JOptionPane.showInputDialog(null, "Introduce el radio del circulo a calcular");
        double valor = Double.valueOf(resposta);
        return valor;
    }
    
    //calcular area
    public void calcularArea(double radio){
        JOptionPane.showMessageDialog(null, "El area del circulo de radio " + radio + " son " + (PI*radio*radio) + "m^2");
    }
}
//Created by the best programer (Seijas)
//To my lovers <3