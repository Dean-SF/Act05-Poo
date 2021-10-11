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
public class Cilindro extends Tridimensional{
    private double altura;
    private double radio;
    public Cilindro(){}
    public Cilindro(double radio, double altura,int codigo) {
        
        this.radio = radio;  
        this.altura = altura;
        super.area = ((2 * Math.PI) * this.radio * altura) + ((2 * Math.PI) * pow(this.radio, 2.0));
        super.perimetro = ((2 * Math.PI) * this.radio);
        super.codigo = codigo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    
    @Override
    public String toString() {
        return "Cilindro: [" +   " Radio: " + this.radio +
                                ", Altura: " + altura +
                                ", Area : " + this.getArea() +
                                ", Perimetro: " + getPerimetro() +
                                ", Tipo: 3D"+" ]."+'\n';
    }
  
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void setArea(double area) {
        super.area = area;
    }
    @Override
    public void setPerimetro(double perimetro) {
        super.perimetro = perimetro;
    }

    @Override
    public void setCodigo(int codigo) {
        super.codigo = codigo;
    }
    
    public double getRadio(){
        return this.radio;
    }

    @Override
    public double getPerimetro() {
        return super.perimetro;
    }
    @Override
    public double getArea() {
        return super.area;
    }

    @Override
    public int getCodigo() {
        return super.codigo;
    }
}
