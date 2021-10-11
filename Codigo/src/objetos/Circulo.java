package objetos;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Circulo extends Bidimensional{
    private double radio;
    
    public Circulo(){
    }
    public Circulo(double radio, int codigo) {
        this.radio = radio;
        super.area = Math.PI*pow(radio,2);
        super.perimetro = 2*Math.PI*radio;
        super.codigo = codigo;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getRadio() {
        return radio;
    }
    @Override
    public double getArea() {
        return area;
    }
    @Override
    public double getPerimetro() {
        return perimetro;
    }
    @Override
    public int getCodigo() {
        return codigo;
    }

    public double redondear(double num){
        double nuevo = round(num*100)/100d;
        return nuevo;
    } 
    
    @Override
    public String toString() {
        return "Circulo: [ Codigo-> "+codigo+
                ", Perimetro: "+redondear(perimetro)+
                ", Area: "+redondear(area)+
                ",\t \t Radio "+redondear(radio)+
                ", Tipo: 2D ]."+'\n';
    }
}
