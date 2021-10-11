package objetos;

public abstract class Figura {
    protected double perimetro;
    protected int codigo;
    
    public Figura(){}

    public abstract void setPerimetro(double perimetro);
    public abstract void setCodigo(int codigo);
    
    public abstract double getPerimetro();
    public abstract int getCodigo();
}
