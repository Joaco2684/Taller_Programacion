/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author joaquin
 */
public class Triangulo {
    private double a;
    private double b;
    private double c;
    private String colorRelleno;
    private String colorLinea;
    
    public Triangulo() {
        
    }
    
    public Triangulo(double a, double b, double c,String colorRelleno, String colorLinea) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.colorLinea = colorLinea;
        this.colorRelleno = colorRelleno;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    public double calcularPerimetro() {
        return (a + b + c);
    }
    
    
    public double calcularArea() {
        double s = (calcularPerimetro() / 2);
        return Math.sqrt(s*(s-a)-(s-b)-(s-c));
    }
    
    
}
