/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parciales.parcial4;

/**
 *
 * @author joaquin
 */
public class MainParcial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaPC sala = new SalaPC(5);
        PC pc1 = new PC(100);
        PC pc2 = new PC(150);
        PC pc3 = new PC(400);
        sala.agregarPC(1, pc1);
        sala.agregarPC(3, pc2);
        sala.agregarPC(5, pc3);
        sala.encenderPcMenorConsumo();
        System.out.println(sala.toString());
    }
    
}
