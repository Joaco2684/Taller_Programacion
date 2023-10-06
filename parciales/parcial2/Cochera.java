/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial2;

/**
 *
 * @author joaquin
 */
public class Cochera {
    private Sector sectorInferior = new Sector();
    private Sector sectorSuperior = new Sector();
    private double costoInferior;
    private double costoSuperior;

    public Cochera(double costoInferior, double costoSuperior) {
        this.costoInferior = costoInferior;
        this.costoSuperior = costoSuperior;
    }

    public double getCostoInferior() {
        return costoInferior;
    }

    public void setCostoInferior(double costoInferior) {
        this.costoInferior = costoInferior;
    }

    public double getCostoSuperior() {
        return costoSuperior;
    }

    public void setCostoSuperior(double costoSuperior) {
        this.costoSuperior = costoSuperior;
    }
    
    public int agregarCocheSectorSuperior(Coche c) {
        int pos=-1;
        if (sectorSuperior.hayLugar()) {
            pos = sectorSuperior.getPosLibre(); //Alamceno en que pos lo inserte
            sectorSuperior.agregarCoche(c);
        } 
        return pos;
    }
    
    public int agregarCocheSectorCondicional(Coche c) {
        int pos=-1;
        if (c.getCantHoras() < 24) {
            pos = sectorInferior.getPosLibre();
            sectorInferior.agregarCoche(c);
        } else {
            pos = sectorSuperior.getPosLibre();
            sectorSuperior.agregarCoche(c);
        }
        return pos;
    }    
    
    public String sectorConMasCoches() {
        String aux = "";
        if (sectorInferior.getPosLibre() > sectorSuperior.getPosLibre() ) { //PosLibre devuelve la cantidad de autos que hay en la cochera
            aux = "inferior";
        } else {
            aux = "superior";
        }
            
        return aux;
    }
    
    
    
}
