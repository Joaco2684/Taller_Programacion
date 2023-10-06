/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial6;

import java.sql.SQLOutput;

/**
 *
 * @author joaquin
 */
public class Concurso {
    private int N;
    private int dimL=0;
    private Pareja[] parejas;

    public Concurso(int N) {
        this.N = N;
        parejas = new Pareja[N];
        for (int i=0; i<N; i++) {
            parejas[i] = null;
        }
    }
    
    public void agregarPareja(Pareja p) {
        if (dimL < N ) {
            parejas[dimL] = p;
            dimL++;
        }
    }
    
    private Pareja parejaConMasDiferenciaEdad() {
        int max=-1;
        Pareja p= null;
        for (int i=0; i<dimL; i++) {
            if (parejas[i].diferenciaDeEdad() > max) {
                System.out.println("leleeee");
                max = parejas[i].diferenciaDeEdad();
                p=parejas[i];
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return "La pareja con m{as difernecia de edad es: " + parejaConMasDiferenciaEdad().toString();
    }
    
    
    
}
