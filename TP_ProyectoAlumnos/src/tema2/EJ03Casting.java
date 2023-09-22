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
        
        int[][] cantidad = new int[5][2]; //Almacena la cantidad de turnos por dia
        for (int i=0; i<5;i++){
            cantidad[i][1] = 0; //Cant turnos por dia
        }
        
        boolean flag = true; //Bandera que controla la lectura hasta "ZZZ"
        
        for (int i=0;i<5;i++){
            if (flag) {
                for (int j=0;j<8;j++) {
                    if (flag) {
                        System.out.print("Ingrese el nombre:");
                        String nom = Lector.leerString();
                        if(!nom.equals("ZZZ")) {
                            System.out.print("Ingrese el dni:");
                            int dni = Lector.leerInt();
                            System.out.print("Ingrese la edad:");
                            int edad = Lector.leerInt();
                            Persona per = new Persona(nom,dni,edad);
                            Casting[i][j] = per; //Agrega persona a Casting
                            cantidad[i][1]++; //Aumenta la cantidad de turnos ocupados en el dia "i"
                        } else {
                            flag = false;
                        }
                    }
                }
            }
            
        }
        
        //IMPRIME CASTING COMPLETO
        for (int i=0; i<5; i++) {
            System.out.print("DIA " + i);
            for(int j=0; j<cantidad[i][1]; j++) { // cantidad[x][y] => En la posicion y se encuentra la cantidad de turnos ocupados en el dia x
                System.out.print(" |Turno " + j + " Nombre: " + Casting[i][j].getNombre());
            }
            System.out.println("");
        }
            
        
        
    }
    
}
