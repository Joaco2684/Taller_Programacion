/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;
import PaqueteLectura.Lector;

public class Ej05Restaurante{
        
    public static void main(String[] args) {
        int[][] clientes = new int[5][4]; //Clientes:0..4  Reviews: 0..3
        for (int i=0; i<5; i++) {
            System.out.println("CLIENTE " + (i+1));
            System.out.print("Atencion Cliente: ");
            clientes[i][0] = Lector.leerInt();
            System.out.print("Calidad comida: ");
            clientes[i][1] = Lector.leerInt();
            System.out.print("Precio: ");
            clientes[i][2] = Lector.leerInt();
            System.out.print("Ambiente: ");
            clientes[i][3] = Lector.leerInt();
        }
        
        //Imprimo lista clientes con sus reviews
        for (int i=0; i<5; i++) {
            System.out.print("CLIENTE:"+(i+1)+ " || ");
            for (int j=0;j<4;j++) {
                System.out.print(" " + j + ": " + clientes[i][j] + " | ");
            }
            System.out.println(" ");
        }
        
        
        double[] cant = new double[4]; //array contador de promedios
        for (int j=0;j<4; j++){
            cant[j] = 0;
        }
        
        for (int i=0; i<5; i++ ) {
            for (int j=0; j<4; j++) {
                cant[j] += clientes[i][j]; //Almaceno total de cada tipo de review
            }
        }
        
        for (int j=0;j<4; j++){
            cant[j] = cant[j] / 5; //Saco el pormedio de cada uno
        }
        
        //Impirmo promedio de cada review
        for (int j=0;j<4; j++){
            System.out.print(j + ": " + cant[j] + " | ");
        }
        
        
        
        
    }
    
}
