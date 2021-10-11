package interfaz;

import javax.swing.JPanel;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Rectangle;

public class Dibujo extends JPanel {
    private Shape figura = new Rectangle(0,0,0,0);

    public Dibujo() {
        this.setVisible(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graficos = (Graphics2D) g;
        graficos.setPaint(Color.black);
        graficos.setStroke(new BasicStroke(5));
        graficos.draw(figura);
    }

    public void dibujar(Shape figura) {
        this.setVisible(true);
        this.figura = figura;
    }
    
}
