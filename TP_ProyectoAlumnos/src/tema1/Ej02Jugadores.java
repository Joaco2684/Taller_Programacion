
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        double[] alturas = new double[5];
        double total=0;
        
        for (int i=0; i<5; i++) {
            alturas[i] = Lector.leerDouble();
            total += alturas[i];
        }
        
        double prom = total / 5;
        
        int cant = 0;
        for (int i=0; i<5; i++) {
            if (alturas[i] > prom)
                cant += 1;
        }
        
        System.out.println("Hay " + cant + " alumnos con alturas mayor a " + prom);
        
    }
    
}
