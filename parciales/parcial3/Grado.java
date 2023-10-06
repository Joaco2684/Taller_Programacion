/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial3;

/**
 *
 * @author joaquin
 */
public class Grado extends Alumno {
    private String carrera;

    public Grado(String carrera, int dni, String nombre, int N) {
        super(dni, nombre, N);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        String aux = super.toString() + 
                    " Carrera: " + this.carrera;
        return aux;
    }

    

    
    
    
}
