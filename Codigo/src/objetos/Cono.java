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
public class Cono extends Tridimensional{
    private double inclinacion;
    private double radio;
    public Cono(){}
    public Cono(double radio, double inclinacion,int codigo) {
        this.inclinacion = inclinacion;
        this.radio = radio; 
        super.area = (Math.PI * this.radio * inclinacion) + (Math.PI * pow(this.radio, 2.0));
        super.perimetro = ((2 * Math.PI) * this.radio);
        super.codigo = codigo;
    }

    public double redondear(double num){
        double nuevo = round(num*100)/100d;
        return nuevo;
    } 
    
    @Override
    public String toString() {
        return "Cono: [" +  "Codigo-> "+codigo+ 
                            ", Radio: " + redondear(radio) +
                            ", Inclinación: " + redondear(inclinacion) +
                            ", \t \t Area: " + redondear(area) + 
                            ", Perimetro: " + redondear(perimetro) +
                            ", Tipo: 3D ]."+'\n';
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
    public void setInclinacion(double inclinacion) {
        this.inclinacion = inclinacion;
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
    public double getRadio(){
        return this.radio;
    }
    public double getInclinacion() {
        return inclinacion;
    }

    
}

