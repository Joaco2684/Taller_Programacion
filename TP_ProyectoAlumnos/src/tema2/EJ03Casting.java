/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author joaquin
 */
public class EJ03Casting {


    public static void main(String[] args) {
        
        
        Persona[][] Casting = new Persona[5][8];

        
        for (int i=0; i<5;i++){
            for (int j=0; j<8; j++) {
                Casting[i][j] = null;
            }
        }
        
       int i=0;
       int j=0;
       
       System.out.print("Ingrese el nombre");
       String nom = Lector.leerString();
       while ((i<5) && !nom.equals("ZZZ")){
           while ((j<8) && (!nom.equals("ZZZ"))) {
               System.out.print("Ingrese el dni:");
               int dni = Lector.leerInt();
               System.out.print("Ingrese la edad:");
               int edad = Lector.leerInt();
               Persona per = new Persona(nom, dni, edad);
               Casting[i][j] = per;
               j++;
               System.out.print("Ingrese el nombre");
               nom = Lector.leerString();
           }
           if (!nom.equals("ZZZ")) { //Si es "ZZZ" se van a guardar los indices, no se reincian
            j=0;
            i++;
           }
           
           
       }
        
      
        //IMPRIME CASTING COMPLETO
        for (int a=0; a<(i-1);a++) { //Imprime completo los dias llenos
            System.out.print("DIA " + a);
            for (int b=0; b<8; b++) {
                System.out.print(" |Turno " + (b) + " Nombre: " + Casting[a][b].getNombre());
            }
        }
        for (int b=0; b<j; b++) { //Imprime el ultimo dia, los castings ocupados
            System.out.print("DIA " + i);
            System.out.print(" |Turno " + (b) + " Nombre: " + Casting[i][b].getNombre());
        }
            
        
        
    }
    
}
