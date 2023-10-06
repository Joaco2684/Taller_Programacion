/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial3;

/**
 * @author joaquin
 */
public abstract class Alumno {
    private int dni;
    private String nombre;
    private Materia[] materiasAprobadas;
    private int N;
    private int pos=0;

    public Alumno(int dni, String nombre, int N) {
        this.dni = dni;
        this.nombre = nombre;
        this.N = N;
        materiasAprobadas = new Materia[N];
        for (int i=0; i<N; i++) {
            materiasAprobadas[i] = null;
        }
    }
    
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m) {
        if (m.getNota() >= 4) {
            materiasAprobadas[pos] = m;
            pos++;
        }
    }
    
    public boolean estaGraduado() {
        boolean tesisAprobada = false;
        int i=0;
        while ((tesisAprobada == false) && (i<pos)) {
            if (materiasAprobadas[i].getNombre().equals("tesis")) {
                tesisAprobada = true;
            }
            i++;
        }
        if ((pos == N) && (tesisAprobada)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String materias = "";
        for (int i=0; i<pos; i++) {
            materias += "( Nombre: " + materiasAprobadas[i].getNombre() + " Nota: " + materiasAprobadas[i].getNota() + " Fecha: " + materiasAprobadas[i].getFecha() + " ) ";
        }
        String aux = "Dni: " + this.dni +
                    "Nombre: " + this.nombre +
                    " Materias aprobadas: " + materias +
                    " Esta graduado: " + estaGraduado();
        return aux;
    }

    
    
}
