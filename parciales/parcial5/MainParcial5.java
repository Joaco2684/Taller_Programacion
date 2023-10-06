/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parciales.parcial5;

/**
 *
 * @author joaquin
 */
public class MainParcial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concurso concurso = new Concurso(20);
        Alumno alu1 = new Alumno("Joaquin", 12, "Guitarra");
        Alumno alu2 = new Alumno("Lucio", 18, "Piano");
        Alumno alu3 = new Alumno("Luca", 11, "Violin");
        Alumno alu4 = new Alumno("Laureano", 15, "Armonica");
        Alumno alu5= new Alumno("Jeremias", 14, "Flauta");
        concurso.inscribirAlumnoAConcurso(alu1, 1);
        concurso.inscribirAlumnoAConcurso(alu2, 4);
        concurso.inscribirAlumnoAConcurso(alu3, 2);
        concurso.inscribirAlumnoAConcurso(alu4, 5);
        concurso.inscribirAlumnoAConcurso(alu5, 5);
        System.out.println("EL genero muscial con mas alumnos incriptos es: " + concurso.generoMusicalConMasAlumnos());
    }
    
}
