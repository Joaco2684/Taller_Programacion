/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parciales.parcial1;

/**
 *
 * @author joaquin
 */
public class MainParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mayorista may = new Mayorista(23, 2, 3);
        MInorista min = new MInorista(true, 23, 3);
        Producto prod1 = new Producto(1, 300, "Producto 1");
        Producto prod2 = new Producto(2, 4200, "Producto 2");
        Producto prod3 = new Producto(3, 2000, "Producto 3");
        may.agregarProducto(prod1);
        may.agregarProducto(prod2);
        may.agregarProducto(prod3);
        min.agregarProducto(prod1);
        min.agregarProducto(prod2);
        min.agregarProducto(prod3);
        System.out.println(may.toString());
        System.out.println(min.toString());
    }
    
}
