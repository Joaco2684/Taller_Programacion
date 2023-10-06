/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parciales.parcial7;

/**
 *
 * @author joaquin
 */
public class MainParcial7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha = new Fecha(2,4); // 2 salas y 4 alumnos
        Alumno alu1 = new Alumno("Lu", 234);
        Alumno alu2 = new Alumno("Lo", 2);
        Alumno alu3 = new Alumno("Lw", 98);
        Alumno alu4 = new Alumno("Lf", 76);
        Alumno alu5 = new Alumno("Lk", 23);
        Alumno alu6 = new Alumno("Lm", 45);
        Alumno alu7 = new Alumno("Lc", 31);
        Alumno alu8 = new Alumno("La", 32);
        fecha.agregarAluSala(1, alu1);
        fecha.agregarAluSala(1, alu2);
        fecha.agregarAluSala(1, alu3);
        fecha.agregarAluSala(1, alu4);
        fecha.agregarAluSala(2, alu5);
        fecha.agregarAluSala(2, alu6);
        fecha.agregarAluSala(2, alu7);
        fecha.agregarAluSala(2, alu8);
        fecha.asignarTemaAleatorio();
        System.out.println(fecha.toString(2));
    }
    
}
