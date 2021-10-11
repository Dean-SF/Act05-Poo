package objetos;
import static java.lang.Math.pow;

public class Cuadrado extends Bidimensional{
   private double lado;
   
   public void Cuadrado(double lado, int codigo){
       this.lado = lado;
       super.area = pow(lado,2);
       super.perimetro = lado*lado;
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
