/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author joaquin
 */
public class EJ01Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese el nombre: ");
        String nom = Lector.leerString();
        System.out.print("Ingrese el dni: ");
        int dni = Lector.leerInt();
        System.out.print("Ingrese la edad: ");
        int edad = Lector.leerInt();
        Persona per = new Persona(nom,dni,edad);
        System.out.println(per.toString());
    }
    
}
