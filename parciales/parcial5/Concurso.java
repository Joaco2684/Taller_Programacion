/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial5;

/**
 *
 * @author joaquin
 */
public class Concurso {
    private int N; //Maximos de alumnos por genero
    private Genero[] concurso = new Genero[5];

    public Concurso(int N) {
        this.N = N;
        for (int i=0; i<5;i++) {
            concurso[i] = new Genero(N); //Incializo cada genero con el maximo de alumnos
        }
    }
    
    public void inscribirAlumnoAConcurso(Alumno alu, int genero) { //Genero va de (1..5);
        concurso[genero-1].agregarAlumno(alu);
    }
    
    public void asignarPuntajeAlumno(String nombre, int puntaje) {
        boolean encontre=false;
        int i=0;
        while ((encontre == false) && (i<N)) {
            if (concurso[i].posAlumno(nombre) != -1) { //Devuleve -1 si no existe el alumno
                concurso[i].asignarPuntaje(concurso[i].posAlumno(nombre), puntaje);
                encontre = true;
            } 
            i++;
        }
    }
    
    public int generoMusicalConMasAlumnos() {
        int max = -1;
        int generoMax = -1;
        for (int i=0; i<5; i++) {
            if(concurso[i].cantAlumnos() > max) {
                max = concurso[i].cantAlumnos();
                generoMax = i;
            }
        }
        generoMax += 1; //Para que devuelve un valor de (1..5);
        return generoMax;
        
    }
    
    
}
