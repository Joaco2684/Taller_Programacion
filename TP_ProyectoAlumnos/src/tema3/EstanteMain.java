/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

/**
 *
 * @author joaquin
 */
public class EstanteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor a = new Autor("Joaquin", "El autor bibi", "La Plata");
        
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 a, "978-0071809252", 21.72);
        
        Autor a2 = new Autor("Lucio", "El autor bibi", "La Plata");
        
        Libro libro2= new  Libro( "Mujercitas",   
                                 "Mcgraw-Hill", 2014,   
                                 a2, "978-0071809252", 21.72);
        
        Autor a3 = new Autor("Jeremias", "El autor bibi", "La Plata");
        
        Libro libro3= new  Libro( "El principito",   
                                 "Mcgraw-Hill", 2014,   
                                 a3, "978-0071809252", 21.72);
        
        Estante e = new Estante();
        
        e.agregarLibro(libro1);
        e.agregarLibro(libro2);
        e.agregarLibro(libro3);
        
        System.out.println("Hay " + e.cantAlmacenados() + " libros almacenados.");
        if (e.estaLLeno() == false) {
            System.out.println("El estante esta vacio");
        }
        System.out.println(e.buscarTitulo("Mujercitas").getPrimerAutor().getNombre());
    
    }
    
}
