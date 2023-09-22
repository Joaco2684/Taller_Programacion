/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author joaquin
 */
public class EJ02VectorPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Persona[] personas = new Persona[15];
        int cont = 0;
        
        int edad = GeneradorAleatorio.generarInt(90);
        while (cont < 15 && edad!=0) {
            String nom = GeneradorAleatorio.generarString(4);
            int dni = GeneradorAleatorio.generarInt(46269490);
            personas[cont] = new Persona(nom,dni,edad);
            cont += 1;
            edad = GeneradorAleatorio.generarInt(90);
        }
        
        for (int i=0; i<cont; i++) {
            System.out.println("Persona " + i + " | " + personas[i].toString());
        }
        
        int cantMayor = 0;
        int minDni = 999999999;
        int posMin = 0;
        
        for (int i=0; i<cont; i++) {
            if (personas[i].getEdad() > 65) {
                cantMayor++;
            }
            if (personas[i].getDNI() < minDni) {
                System.out.println("LLEGUE");
                minDni = personas[i].getDNI();
                posMin = i;
            }
                
        }
        
        System.out.println("Hay " + cantMayor + " personas con edad mayor a 65");
        System.out.println(personas[posMin].toString());
        
    }
    
}
