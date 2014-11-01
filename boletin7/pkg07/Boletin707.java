//Write by Seijas
package boletin7.pkg07;

import javax.swing.JOptionPane;

public class Boletin707 {

    public static void main(String[] args) {
        double lado;
        double base, altura;
        double radio;

        
        //opcion duadrado
        Cuadrado obx1 = new Cuadrado();
        lado = obx1.setLado();
        obx1.calcularArea(lado);
        
        //Opcion triangulo
        Triangulo obx2 = new Triangulo();
        base = obx2.setBase();
        altura = obx2.setAltura();
        obx2.calcularArea(base, altura);
        
        //opcion circulo
        Circulo obx3 = new Circulo();
        radio = obx3.setRadio();
        obx3.calcularArea(radio);
        
    }
}
//Created by Seijas
//To my Fans ;)