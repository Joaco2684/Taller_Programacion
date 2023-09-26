/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author joaquin
 */
public class Estante {
    private Libro[] estante =  new Libro[20];
    private int cant = 0;
    
    public Estante() {
        
    }
    
    public int cantAlmacenados() {
        return cant;
    }
    
    public boolean estaLLeno() {
        return (cant == 20);
    }
    
    public void agregarLibro (Libro l) {
        if (cant <20) {
            estante[cant] = l;
            cant++;
        }
    }
    
    public Libro buscarTitulo(String titulo) {
        for (int i=0; i<20;i++) {
            if (estante[i].getTitulo().equals(titulo)) {
                return estante[i];
            }
        }
        return estante[1];
    }
    
}
