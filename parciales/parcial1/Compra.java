/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parciales.parcial1;

/**
 *
 * @author joaquin
 */
public abstract class Compra {
    private int nro;
    private Producto[] productos;
    private int N;
    private int pos=0;

    public Compra(int nro, int N) {
        this.nro = nro;
        this.N = N;
        productos = new Producto[N];
        for (int i=0; i<N; i++) {
            productos[i] = null;
        }
    }
    
    public void agregarProducto(Producto c) {
        if (pos < N) {
            productos[pos] = c;
            pos++;
        }
    }
    
    public double precioAPagar() {
        double monto = 0;
        for (int i=0; i<pos; i++) {
            monto += productos[i].getPrecio();
        }
        return (monto + (monto * 0.21));
    }

    @Override
    public String toString() {
        String productosString = "";
        for (int i=0; i<pos; i++) {
            productosString += "(Codigo: " +productos[i].getCod() + ", Precio: " + productos[i].getPrecio() + ". Descripcion: " + productos[i].getDescripcion() + ") ";
        }
        String aux = "Nro: " + this.nro +
                    "Productos: " + productosString +
                    "Precio a pagar: " + precioAPagar();
        return aux;
    }
    
    
    
    
}
