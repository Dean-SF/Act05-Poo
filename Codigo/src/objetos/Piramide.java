/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
import static java.lang.Math.pow;
/**
 *
 * @author davidmorales
 */
public class Piramide extends Tridimensional{
        private double altura;
        private double ha;
        private double lado;
        public Piramide(){}
        public Piramide(double altura,double lado,int codigo) {
            this.altura = altura;
            this.lado = lado;
            this.ha = altura * altura + pow(this.lado/2, 2.0);
            super.area = (this.lado * this.lado) + (2*this.lado * ha);
            super.perimetro = this.lado * 4;
            super.codigo = codigo;
        }
        @Override
        public String toString() {
            return "Piramide: " + "Lado: " + lado + 
                             ", Area: " + this.getArea()+
                             ", Perimetro: "+ this.getPerimetro() + 
                             ", Tipo: 3D" + '\n';
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

}
