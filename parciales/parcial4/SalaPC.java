/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial4;

/**
 *
 * @author joaquin
 */
public class SalaPC {
    private int N;
    private PC[] computadoras;
    
    
    public SalaPC(int N) {
        this.N = N;
        computadoras = new PC[N];
        
        for (int i=0; i<N; i++) {
            computadoras[i] = null;
        }
        
    }
    
    public void agregarPC(int nroEspacio, PC compu) {
        if (nroEspacio <= N) {
            if (computadoras[nroEspacio-1] == null) {
                computadoras[nroEspacio-1] = compu;
            } else {
                System.out.println("En ese espacio ya hay una computadora");
            }
        }
    }
    
    public void encenderPcMenorConsumo() {
        double min=99999;
        int pos=-1;
        for (int i=0; i<N; i++) {
            if (computadoras[i] != null) {
                if ((computadoras[i].getConsumo() < min) && (computadoras[i].isPrendida() == false)) {
                    min = computadoras[i].getConsumo();
                    pos = i;
                }
            }
        }
        if (pos != -1) {
            computadoras[pos].setPrendida(true);    
        }
        
    }

    @Override
    public String toString() {
        String aux = "Los numeros de espacios donde hay PCs prenidads son: [";
        for (int i=0; i<N; i++) {
            if ((computadoras[i] != null) && (computadoras[i].isPrendida())) {
                aux += (i+1) + ", ";
            }
        }
        return aux + "]";
    }
    
    

}
