/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial7;

/**
 *
 * @author joaquin
 */
public class Sala {
    private int M;
    private int dimL=0;
    private Alumno[] alumnos;

    public Sala(int M) {
        this.M = M;
        alumnos = new Alumno[M];
    }
    
    public void agregarAlu(Alumno alu) {
        if (dimL < M) {
            alumnos[dimL] = alu;
            dimL++;
        }
    }
    
    public void asignarTema(int tema) {
        for (int i=0; i<M; i++) {
            alumnos[i].setTema(tema);
        }
    } 
    
    
    public String toString(int tema) {
        String aux="";
        for (int i=0; i<M; i++) {
            if (alumnos[i].getTema() == tema) {
                aux += " {" + alumnos[i].getNombre() + ", " + alumnos[i].getDni() + ", tema: " + alumnos[i].getTema() + "}";
            }
        }
        System.out.println("Aux" + aux);
        return aux; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
