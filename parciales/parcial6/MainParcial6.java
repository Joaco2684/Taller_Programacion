/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parciales.parcial6;

/**
 *
 * @author joaquin
 */
public class MainParcial6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concurso concurso = new Concurso(2);
        Participante par1 = new Participante(435, 2, "Joaquin");
        Participante par2 = new Participante(43, 8, "Lucio");
        Pareja pareja1 = new Pareja(par1, par2);
        Participante par3 = new Participante(43, 7, "Francesa");
        Participante par4 = new Participante(2, 6, "Pablo");
        Pareja pareja2 = new Pareja(par3, par4);
        concurso.agregarPareja(pareja1);
        concurso.agregarPareja(pareja2);
        System.out.println(concurso.toString());
    }
    
}
