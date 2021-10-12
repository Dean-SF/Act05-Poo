/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import static java.lang.Math.pow;
import static java.lang.Math.round;

/**
 *
 * @author davidmorales
 */
public class Cubo extends Tridimensional{
    private double lado;
    public Cubo(){}
    public Cubo(double lado, int codigo) {
        this.lado = lado;
        super.area = pow(lado,2) * 6;
        super.perimetro = lado * 12;
        super.codigo = codigo;
    }
    
    public double redondear(double num){
        double nuevo = round(num*100)/100d;
        return nuevo;
    } 
    
     @Override
    public String toString() {
        return "Cubo: [" + "Codigo-> "+codigo+
                        ", Lado: " + redondear(lado) + 
                        ", Area: " + redondear(area)+
                        ", \t \t Perimetro: " + redondear(perimetro) +
                        ", Tipo: 3D ]."+'\n';
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
}
   
