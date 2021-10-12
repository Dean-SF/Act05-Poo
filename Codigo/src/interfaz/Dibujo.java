package interfaz;

import javax.swing.JPanel;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class Dibujo extends JPanel {
    private String figura = null;
    private int cantidad = 0;

    public Dibujo() {
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graficos = (Graphics2D) g;
        graficos.setStroke(new BasicStroke(2));
        int x = 3;
        int y = 3;
        int[] xt = {3,30,15};
        int[] yt = {30,30,3};

        Shape shape;
        Random rand = new Random();
        for(int i = 1; i <= cantidad; i++) {
            graficos.setPaint(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            if(figura.equals("triangulo")) {
                graficos.drawPolygon(xt,yt,3);
                xt[0] += 40;
                xt[1] += 40;
                xt[2] += 40;
                if(i % 8 == 0){
                    yt[0] += 40;
                    yt[1] += 40;
                    yt[2] += 40;
                    xt[0] = 3;
                    xt[1] = 30;
                    xt[2] = 15;
                }
                continue;
            }
            switch (figura) {
                case "circulo":
                    shape = new Ellipse2D.Double(x,y,30,30);
                    break;
                case "cuadrado":
                    shape = new Rectangle2D.Float(x,y,30,30);
                    break;
                case "rectangulo":
                    shape = new Rectangle2D.Float(x,y,30,20);
                    break;
                default:
                    shape = null;
                    break;
            }
            graficos.draw(shape);
            x += 40;
            if(i % 8 == 0){
                y += 40;
                x = 3;
            }
        }
        
    }

    public void dibujar(String figura, int cantidad) {
        this.cantidad = cantidad;
        this.figura = figura;
        paintComponent(this.getGraphics());
    }
    
}
