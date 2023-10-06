/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial5;

/**
 *
 * @author joaquin
 */
public class Genero {
    private int N;
    private int dimL=0;
    private Alumno[] alumnos;

    public Genero(int N) {
        this.N = N;
        alumnos = new Alumno[N];
        for (int i=0; i<N; i++) {
            alumnos[i] = null;
        }
    }
    
    public void agregarAlumno(Alumno alu) {
        if (dimL < N) {
            alumnos[dimL] = alu;
            dimL++;
        }
    }
    
    public int posAlumno(String nombre) {
        for(int i=0; i<dimL; i++) {
            if (alumnos[i].getNombre() == nombre) {
                return i;
            }
        }
        return -1;
    }
    
    public void asignarPuntaje(int pos, int puntaje) {
        alumnos[pos].setPuntaje(puntaje);
    }
    
    public int cantAlumnos() {
        return dimL;
    }
    
}
