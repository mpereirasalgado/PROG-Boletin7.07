//Write by Seijas
package boletin7.pkg07;

import javax.swing.JOptionPane;

public class Boletin707 {

    public static void main(String[] args) {
        double lado, base, altura, radio;
        
        String respuesta = JOptionPane.showInputDialog("Selecione el tipo de area a calcular: \n1 Cuadrado \n2 Triangulo \n3 Circulo");
        int opcion = Integer.parseInt(respuesta);
        
        switch (opcion){
            
            case 1:
                Cuadrado obx1 = new Cuadrado();
                lado = obx1.setLado();
                obx1.calcularArea(lado);
                break;
                
                
            case 2:
                Triangulo obx2 = new Triangulo();
                base = obx2.setBase();
                altura = obx2.setAltura();
                obx2.calcularArea(base, altura);
                break;
             
                
            case 3:
                Circulo obx3 = new Circulo();
                radio = obx3.setRadio();
                obx3.calcularArea(radio);  
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
        }
    }
}
//Created by Seijas
//To my Fans ;)