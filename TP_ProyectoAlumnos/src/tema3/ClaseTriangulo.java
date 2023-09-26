/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import PaqueteLectura.Lector;

/**
 *
 * @author joaquin
 */
public class ClaseTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese la medida del lado 1:");
        double a = Lector.leerDouble();
        System.out.print("Ingrese la medida del lado 2:");
        double b = Lector.leerDouble();
        System.out.print("Ingrese la medida del lado 3:");
        double c = Lector.leerDouble();
        System.out.print("Ingrese el color de relleno:");
        String colorRelleno = Lector.leerString();
        System.out.print("Ingrese el color de las lineas:");
        String colorLineas = Lector.leerString();
    
        Triangulo t = new Triangulo(a, b, c, colorRelleno, colorLineas);
        System.out.println("El perimetro del triangulo es: " + t.calcularPerimetro());
        System.out.println("El area del triangulo es: " + t.calcularArea());
    }
    
}
