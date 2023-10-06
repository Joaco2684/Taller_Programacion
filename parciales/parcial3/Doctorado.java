/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial3;

/**
 *
 * @author joaquin
 */
public class Doctorado extends Alumno{
    private String titulo;
    private String universidad;

    public Doctorado(String titulo, String universidad, int dni, String nombre, int N) {
        super(dni, nombre, N);
        this.titulo = titulo;
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        String aux = super.toString() +
                    " Titulo: " + this.titulo +
                    " Universidad de origen: " + this.universidad;
        return aux;
    }

    

    
    
}
