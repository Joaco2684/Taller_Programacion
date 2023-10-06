/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial2;

/**
 *
 * @author joaquin
 */
public class Sector {
    private Coche[] coches= new Coche[20];
    private int posLibre=0;
    
    
    public Sector() {
        for (int i=0; i< 20; i++) {
            coches[i] = null;
        }
    }
    
    public boolean hayLugar() {
        return (posLibre < 20);
    }
    
    public void agregarCoche(Coche c) {
        coches[posLibre] = c;
        posLibre++;
    }

    public int getPosLibre() {
        return posLibre;
    }
    
    
    
}
