/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parciales.parcial2;

/**
 *
 * @author joaquin
 */
public class MainParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cochera cochera = new Cochera(250, 220);
        Coche coche1 = new Coche(230, 1);
        Coche coche2 = new Coche(230, 25);
        Coche coche3 = new Coche(230, 2);
        Coche coche4 = new Coche(230, 3);
        cochera.agregarCocheSectorSuperior(coche1);
        cochera.agregarCocheSectorCondicional(coche2);
        cochera.agregarCocheSectorCondicional(coche3);
        cochera.agregarCocheSectorCondicional(coche4);
        System.out.println(cochera.sectorConMasCoches());
    }
    
}
