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

    @Override
    public String toString() {
        return "Circulo: [ Codigo-> "+codigo+
                ", Perimetro-> "+round(perimetro*100)/100d+
                ", Area-> "+round(area*100)/100d+
                ", Radio-> "+radio+
                ", Tipo: 2D ]."+'\n';
    }
}
