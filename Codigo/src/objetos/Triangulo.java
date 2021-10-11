package objetos;

import static java.lang.Math.round;

public class Triangulo extends Bidimensional{
    private double base;
    private double lado2;
    private double lado3;
    private double altura;

    public Triangulo() {
    }
    public Triangulo(double base, double lado2, double lado3, double altura, int codigo) {
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        super.area = (base*altura)/2;
        super.perimetro = base+lado2+lado3;
        super.codigo = codigo;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public void setAltura(double altura) {
        this.altura = altura;
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

    public double getBase() {
        return base;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public double getAltura() {
        return altura;
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
        return "Triangulo: [ Codigo-> "+codigo+
                ", Perimetro: "+redondear(perimetro)+
                ", \t \t Area: "+redondear(area)+
                ", Base: "+redondear(base)+
                ", Altura: "+redondear(altura)+
                ", \t \t Lados: "+redondear(lado2)+" y "+redondear(lado3)+
                ", Tipo: 2D ]."+'\n';
    }
}
