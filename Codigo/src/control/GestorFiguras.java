package control;
import java.util.ArrayList;
import objetos.Bidimensional;
import objetos.Figura;

public class GestorFiguras{
    private ArrayList<Figura> figuras = new ArrayList<Figura>();
    private int cantidadTotal;
    private int cantidad2D;
    private int cantidad3D;

    public GestorFiguras() {
        cantidadTotal = 0;
        cantidad2D = 0;
        cantidad3D = 0;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public void setCantidad2D(int cantidad2D) {
        this.cantidad2D = cantidad2D;
    }

    public void setCantidad3D(int cantidad3D) {
        this.cantidad3D = cantidad3D;
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public int getCantidad2D() {
        return cantidad2D;
    }

    public int getCantidad3D() {
        return cantidad3D;
    }
    
    public void agregarFigura(Figura figura){
        cantidadTotal +=1;
        if(figura instanceof Bidimensional){
            cantidad2D +=1;
        }else{
            cantidad3D +=1;
        }
        figuras.add(figura);
    }
}