/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial1;

/**
 *
 * @author joaquin
 */
public class Mayorista extends Compra {
    private int CUIT;

    public Mayorista(int CUIT, int nro, int N) {
        super(nro, N);
        this.CUIT = CUIT;
    }

    @Override
    public String toString() {
        String aux = super.toString() +
                    ", CUIT: " + this.CUIT;
        return aux;
    }
    
    
    
}
