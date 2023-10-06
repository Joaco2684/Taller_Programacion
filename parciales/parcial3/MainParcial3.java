/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parciales.parcial3;

/**
 *
 * @author joaquin
 */
public class MainParcial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grado grado = new Grado("Informatica", 46269490, "JOaquin", 3);
        Materia mat1 = new Materia("taller", 6, "20/7/22");
        Materia mat2 = new Materia("cadp", 1, "26/2/22");
        Materia mat3 = new Materia("tesis", 4, "12/5/22");
        grado.agregarMateria(mat1);
        grado.agregarMateria(mat2);
        grado.agregarMateria(mat3);
        System.out.println(grado.toString());
    }
    
}
