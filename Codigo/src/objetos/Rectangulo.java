package objetos;

import static java.lang.Math.round;

public class Rectangulo extends Bidimensional{
    private double largo;
    private double ancho;

    public Rectangulo() {
    }
    public Rectangulo(double largo, double ancho, int codigo) {
        this.largo = largo;
        this.ancho = ancho;
        super.area = largo*ancho;
        super.perimetro = (largo*2)+(ancho*2);
        super.codigo = codigo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
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

    public double getLargo() {
        return largo;
    }
    public double getAncho() {
        return ancho;
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
        return "Resctangulo: [ Codigo-> "+codigo+
                ", Perimetro: "+redondear(perimetro)+
                ", Area: "+redondear(area)+
                ", Largo: "+redondear(largo)+
                ", Ancho: "+redondear(ancho)+
                ", Tipo: 2D ].\n";
    }
    
    
}
