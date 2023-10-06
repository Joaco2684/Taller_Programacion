/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial4;

/**
 *
 * @author joaquin
 */
public class PC {
    private boolean prendida;
    private double consumo;

    public PC(double consumo) {
        this.consumo = consumo;
        this.prendida = false;
    }

    public boolean isPrendida() {
        return prendida;
    }

    public void setPrendida(boolean prendida) {
        this.prendida = prendida;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    
    
}
