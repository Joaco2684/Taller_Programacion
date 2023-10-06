/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial7;

/**
 *
 * @author joaquin
 */
public class Alumno {
    private String nombre;
    private int dni;
    private int tema;

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.tema = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }
    
    
    
    
    
}
