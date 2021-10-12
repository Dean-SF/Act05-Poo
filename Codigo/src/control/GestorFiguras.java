package control;
import java.util.ArrayList;

import objetos.Bidimensional;
import objetos.Circulo;
import objetos.Cuadrado;
import objetos.Figura;
import objetos.Rectangulo;
import objetos.Triangulo;

public class GestorFiguras{
    private ArrayList<Figura> figuras = new ArrayList<Figura>();
    private int cantidadTotal;
    private int cantidad2D;
    private int cantidad3D;
    private int maximosEjempares = 0;
    private String ejemplar = null;

    private void figura2DMasEjemplares() {
        int[] cantidades = {0,0,0,0};
        for(Figura actual : figuras) {
            if(actual instanceof Circulo){
                cantidades[0] += 1;
            } else if(actual instanceof Cuadrado) {
                cantidades[1] += 1;
            } else if(actual instanceof Rectangulo) {
                cantidades[2] += 1;
            } else if(actual instanceof Triangulo) {
                cantidades[3] += 1;
            }
        }
        int max = 0;
        int index = 0;
        for(int i = 0; i < 4; i++) {
            if(max < cantidades[i]) {
                max = cantidades[i];
                index = i;
            }
        }
        maximosEjempares = max;
        switch (index) {
            case 0:
                ejemplar = "circulo";
                break;
            case 1:
                ejemplar = "cuadrado";
                break;
            case 2:
                ejemplar = "rectangulo";
                break;
            case 3:
                ejemplar = "triangulo";
                break;
            default:
                ejemplar = "N/A";
                break;
        }
    }

    public GestorFiguras() {
        cantidadTotal = 0;
        cantidad2D = 0;
        cantidad3D = 0;
    }

    public void setEjemplar(String ejemplar) {
        this.ejemplar = ejemplar;
    }

    public void setMaximosEjempares(int maximosEjempares) {
        this.maximosEjempares = maximosEjempares;
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

    public String getEjemplar() {
        figura2DMasEjemplares();
        return ejemplar;
    }

    public int getMaximosEjempares() {
        figura2DMasEjemplares();
        return maximosEjempares;
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