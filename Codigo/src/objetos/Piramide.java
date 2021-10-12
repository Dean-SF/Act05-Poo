/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
/**
 *
 * @author davidmorales
 */
public class Piramide extends Tridimensional{
    private double altura;
    private double ha;// esto es la altura del lado
    private double lado;
    private double inclinacion;
    public Piramide() {

    }

    public Piramide(double altura,double lado,double inclinacion,int codigo) {
        this.altura = altura;
        this.lado = lado;
        this.inclinacion = inclinacion;
        this.ha = sqrt(pow(altura,2) + pow(this.lado/2, 2.0));// formula para averiguar la altura del lado
        super.area = (this.lado * this.lado) + (2*this.lado * ha);
        super.perimetro = (this.lado * 4) + (inclinacion * 4);
        super.codigo = codigo;
    }
    
    public double redondear(double num){
        double nuevo = round(num*100)/100d;
        return nuevo;
    } 

    @Override
    public String toString() {
        return "Piramide: [" + "Codigo-> "+codigo+
                            ", Lado: " + redondear(lado) + 
                            ", Area: " + redondear(area)+
                            ", \t \t Perimetro: "+ redondear(perimetro) + 
                            ", Tipo: 3D ]."+ '\n';
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

   @Override
    public void setArea(double area) {
        super.area = area;
    }

   @Override
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

   @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getLado() {
        return lado;
    }

   @Override
    public double getArea() {
        return super.area;
    }

   @Override
    public double getPerimetro() {
        return perimetro;
    }

   @Override
    public int getCodigo() {
        return codigo;
    }
    public double getAltura() {
        return altura;
    }

    public void setHa(double ha) {
        this.ha = ha;
    }

    public void setInclinacion(double inclinacion) {
        this.inclinacion = inclinacion;
    }

    public double getHa() {
        return ha;
    }

    public double getInclinacion() {
        return inclinacion;
    }
    
    
}
