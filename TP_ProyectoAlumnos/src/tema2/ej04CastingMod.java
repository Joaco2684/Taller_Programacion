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
public class ej04CastingMod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-----------------------------------------------
        // ESTA TODO EL EJERCICIO MAL (CORREGIR EN BASE AL EJ03CASTING.JAVA)
        //-----------------------------------------------
        Persona[][] Casting = new Persona[5][8];
        
        int[][] cantidad = new int[5][2]; //Almacena la cantidad de turnos por dia
        for (int i=0; i<5;i++){
            cantidad[i][1] = 0; //Cant turnos por dia
        }
        
        boolean flag = true; //Bandera que controla la lectura hasta "ZZZ"
        
        
        
        while (flag){
            
            System.out.print("Ingrese el nombre:");
            String nom = Lector.leerString();
            if (!nom.equals("ZZZ")) {
                System.out.print("Ingrese el dni:");
                int dni = Lector.leerInt();
                System.out.print("Ingrese la edad:");
                int edad = Lector.leerInt();
                Persona per = new Persona(nom,dni,edad);
                System.out.print("Ingrese el dia:");
                int dia = Lector.leerInt() - 1; //El menos es porque el usuario elige del dia (1..5) y el vector almacena de (0..4)
                if (cantidad[dia][1] < 8) { //Chequea que haya turnos disponibles
                    int posUltElem = cantidad[dia][1]; //Recupera la pos del primer turno disponble de ese dia
                    Casting[dia][posUltElem] = per; //Agrega la persona a ese turno
                    cantidad[dia][1]++; //Aumento la cantidad de turnos ocupados de ese dia
                } else {
                    System.out.println("NO SE PUDO INGRESAR, EL DIA ESTA LLENO");
                }
                
            } else {
                flag = false;
            }
            
            
        }
       
        //IMPRIME CASTING COMPLETO
        for (int i=0; i<5; i++) {
            System.out.print("DIA " + i);
            for(int j=0; j<cantidad[i][1]; j++) { // cantidad[x][y] => En la posicion y se encuentra la cantidad de turnos ocupados en el dia x
                System.out.print(" |Turno " + (j+1) + " Nombre: " + Casting[i][j].getNombre());
            }
            System.out.println("");
        }
    }
    
}
