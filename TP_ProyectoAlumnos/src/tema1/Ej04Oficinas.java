/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;
import PaqueteLectura.Lector;

public class Ej04Oficinas {

   
    public static void main(String[] args) {
        int[][] edificio = new int[8][4]; //Piso: 0..7 Oficinas: 0..3
        
        for (int i=0; i<8; i++) {
            for (int j=0;j<4;j++) {
                edificio[i][j] = 0;
            }
        }
        
        System.out.print("Ingrese un nro de piso(1..8): ");
        int piso = Lector.leerInt();
        int ofi;
        while (piso != 9) {
            System.out.print("Ingrese el nro de oficina(1..4):");
            ofi = Lector.leerInt();
            edificio[piso-1][ofi-1] += 1;
            System.out.print("Ingrese un nro de piso(1..8): ");
            piso = Lector.leerInt();
        }
        
        for (int i=0; i<8; i++) {
            System.out.print("Piso:"+(i+1)+ " || ");
            for (int j=0;j<4;j++) {
                System.out.print("Ofi:" + (j+1) + " Personas:" + edificio[i][j] + " | ");
            }
            System.out.println(" ");
        }
        
    }
    
}
