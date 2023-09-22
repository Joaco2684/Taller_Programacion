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
public class Ej05Partidos {

   
    public static void main(String[] args) {
        Partido[] partidos = new Partido[20];
        
        int cant = 0;
        System.out.print("Nombre Visitante:");
        String nomV = Lector.leerString();
        while (cant < 20 && !nomV.equals("ZZZ")) {
            System.out.print("Goles Visitante:");
            int golV = Lector.leerInt();
            System.out.print("Nombre Local:");
            String nomL = Lector.leerString();
            System.out.print("Goles Local:");
            int golL = Lector.leerInt();
            partidos[cant] = new Partido(nomL,nomV,golL,golV);
            cant++;
            System.out.print("Nombre Visitante:");
            nomV = Lector.leerString();
        }
        
        int cantRiver = 0;
        int cantGolesBoca = 0;
        
        for (int i=0;i<cant;i++) {
            //Inciso A
            System.out.println("(" + partidos[i].getLocal().toUpperCase() + " " + partidos[i].getGolesLocal() +
                    " VS " + partidos[i].getGolesVisitante() + " " + partidos[i].getVisitante().toUpperCase() + ")");
            //Incisio B
            if (partidos[i].hayGanador() && partidos[i].getGanador().equals("River")) {
                cantRiver++;
            }
            //Inciso C
            if (partidos[i].getLocal().equals("Boca")) {
                cantGolesBoca += partidos[i].getGolesLocal();
            }
        }
        
        System.out.println("---------------------------");
        System.out.println("River gano " + cantRiver + " partidos.");
        System.out.println("Boca hizo " + cantGolesBoca + " goles jugando de local");
        System.out.println("---------------------------");
        
        
    }
    
}
