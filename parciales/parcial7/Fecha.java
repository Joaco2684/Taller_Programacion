/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial7;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author joaquin
 */
public class Fecha {
    private int N;
    private int M; //Guardo el M para realizar el rango del Random [asiganrTemaAleatorio()]
    private Sala[] salas;

    public Fecha(int N, int M) { //N= cant salas | M= Maximos de alumnos que rinden la materia
        this.N = N;
        this.M=M;
        salas = new Sala[N];
        for (int i=0; i<N; i++) {
            salas[i]= new Sala(M);
        }
    }
    
    public void agregarAluSala(int nroSala, Alumno alu) { //El nro Sala irá de (1..N)
        salas[nroSala-1].agregarAlu(alu);
    }
    
    public void asignarTemaAleatorio() { //Se genera un nro random para cada sala
        int random;
        GeneradorAleatorio.iniciar();
        for (int i=0; i<N; i++) {
            random = GeneradorAleatorio.generarInt(M) + 1;
            System.out.println(random);
            salas[i].asignarTema(random);
        }
    
   
    }
    
    public String toString(int tema) {
        String aux = "";
        for (int i=0; i<N; i++) {
            aux += " " + salas[i].toString(tema);
            
        }
        return aux;
    }
    
    
       
}
