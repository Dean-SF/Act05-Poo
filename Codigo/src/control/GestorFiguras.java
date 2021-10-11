package control;
import java.util.ArrayList;

import objetos.Bidimensional;
import objetos.Circulo;
import objetos.Cuadrado;
import objetos.Figura;
import objetos.Rectangulo;
import objetos.Triangulo;

import java.awt.Shape;

public class GestorFiguras{
    private ArrayList<Figura> figuras = new ArrayList<Figura>();
    private int cantidadTotal;
    private int cantidad2D;
    private int cantidad3D;

    private String figura2DMasEjemplares() {
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
        for(int i = 0; i < 5; i++) {
            if(max < cantidades[i]) {
                max = cantidades[i];
                index = i;
            }
        }
        switch (index) {
            case 0:
                return "circulo";
            case 1:
                return "cuadrado";
            case 2:
                return "rectangulo";
            case 3:
                return "triangulo";
            default:
                return "N/A";
        }
    }

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

    // por desarrollar
    public Shape dibujo2DMasEjemplares(){
        String figura = figura2DMasEjemplares();
        switch (figura) {
            case "circulo":
                return null;
            case "cuadrado":
                return null;
            case "rectangulo":
                return null;
            case "triangulo":
                return null;
            default:
                return null;
        }
    }
}