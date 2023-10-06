/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial6;

/**
 *
 * @author joaquin
 */
public class Pareja {
    private int dimL=0;
    private Participante[] participante = new Participante[2];

    public Pareja(Participante par1, Participante par2) {
        participante[0] = par1;
        participante[1] = par2;
        dimL = 2; //Se lleno el vectr (Esta comprobacion servivria en el toString() si se agrega de a uno los participantes)
    }
    
    public void agregarParticipante(Participante p) { //Este metodo no sirve!!!
        if (dimL < 2) {
            participante[dimL] = p; //Agregego un participate a la pareja
            dimL++;
            
        }
    }
    
    public int diferenciaDeEdad() {
        if (dimL == 2) { //La pareja está completa
            return (Math.abs(participante[0].getEdad() - participante[1].getEdad())); //Math.abs retorna el valor absoluto
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Pareja { " + participante[0].getNombre() + " , " + participante[1].getNombre() + " }";
    }
    
    
    
    
    
}
