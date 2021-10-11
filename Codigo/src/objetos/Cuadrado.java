package objetos;

import static java.lang.Math.round;

public class Cuadrado extends Bidimensional{
   private double lado;
   
   public Cuadrado(){
   }
   public Cuadrado(double lado, int codigo){
       this.lado = lado;
       super.area = lado*lado;
       super.perimetro = lado*4;
       super.codigo = codigo;
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
        return "Cuadrado: [ Codigo-> "+codigo+", Perimetro-> "+round(perimetro*100)/100d+
                ", Area-> "+round(area*100)/100d+", Lado-> "+lado+", Tipo: 2D"+" ].";
    }
}
