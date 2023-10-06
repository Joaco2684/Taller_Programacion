/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial1;

/**
 *
 * @author joaquin
 */
public class MInorista extends Compra{
    private boolean jubilado;

    public MInorista(boolean jubilado, int nro, int N) {
        super(nro, N);
        this.jubilado = jubilado;
    }
    
    @Override
    public String toString() {
        String aux = super.toString() +
                    ", Es Jubilado: " + this.jubilado;
        return aux;
    }
    
}
