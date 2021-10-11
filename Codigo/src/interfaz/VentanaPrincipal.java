package interfaz;

import control.GestorFiguras;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.ArrayList;
import objetos.Cilindro;
import objetos.Circulo;
import objetos.Cono;
import objetos.Cuadrado;
import objetos.Cubo;
import objetos.Figura;
import objetos.Piramide;
import objetos.Rectangulo;
import objetos.Triangulo;

/** 
 * Clase con la ventan principal del Act05
*/
public class VentanaPrincipal extends JFrame implements ActionListener {
    //Gestor
    GestorFiguras gestor = new GestorFiguras();
    
    //Letras
    private Font fBotones = new Font("Segoe UI",Font.PLAIN,18);
    private Font fTitulo = new Font("Segoe UI Light",Font.BOLD,25);
    private Font fLabel = new Font("Segoe UI Light",Font.PLAIN,18);

    //Componentes
    private JLabel lFiguras = new JLabel("Detalle de las figuras registradas:");
    private JTextArea visualFiguras = new JTextArea();
    private JScrollPane scrollVisual = new JScrollPane(visualFiguras);
    private JButton botonRandomizador = new JButton();

    private JSeparator vSeparador1 = new JSeparator(SwingConstants.VERTICAL);

    private JLabel[] cantidades = new JLabel[10];

    private JLabel lCantidades = new JLabel("Cantidades de Figuras:");
    private JLabel lCirculo = cantidades[0] = new JLabel("Circulo: 0");
    private JLabel lCuadrado = cantidades[1] = new JLabel("Cuadrado: 0");
    private JLabel lRectagunlo = cantidades[2] = new JLabel("Rectangulo: 0");
    private JLabel lTriangulo = cantidades[3] = new JLabel("Triangulo: 0");
    private JLabel lCubo = cantidades[4] = new JLabel("Cubo: 0");
    private JLabel lCilindro = cantidades[5] = new JLabel("Cilindro: 0");
    private JLabel lCono = cantidades[6] = new JLabel("Cono: 0");
    private JLabel lPiramide = cantidades[7] = new JLabel("Piramide: 0");
    private JLabel lF2D = cantidades[8] = new JLabel("Figuras 2D: 0");
    private JLabel lF3D = cantidades[9] = new JLabel("Figuras 3D: 0");

    private JSeparator hSeparador1 = new JSeparator(SwingConstants.HORIZONTAL);

    private JLabel lDibujo = new JLabel("Figura 2D con más ejemplares:");
    private Dibujo Dibujo = new Dibujo();

    private JSeparator vSeparador2 = new JSeparator(SwingConstants.VERTICAL);

    private JLabel lDetalleTriangulo = new JLabel("Detalle de los triangulos:");
    private JTextArea visualTriangulo = new JTextArea();
    private JScrollPane scrollTriangulo = new JScrollPane(visualTriangulo);

    private JSeparator hSeparador2 = new JSeparator(SwingConstants.HORIZONTAL);
    
    private JLabel lDetalleCilindros = new JLabel("Detalle de los Cilindros: ");
    private JTextArea visualCilindros = new JTextArea();
    private JScrollPane scrollCilindros = new JScrollPane(visualCilindros);

    public VentanaPrincipal() {

        //Setup principal de la ventana
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1050,720);
        this.setTitle("Act05 - Programación Orientada a Objetos");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        //Boton
        botonRandomizador.setFont(fBotones);
        botonRandomizador.setBounds(480,645,160,30);
        botonRandomizador.setText("RANDOMIZAR");
        botonRandomizador.addActionListener(this);

        //Visual
        scrollVisual.setBounds(10,45,365,630);
        visualFiguras.setLineWrap(true);
        visualFiguras.setWrapStyleWord(true);
        visualFiguras.setEditable(false);;
        lFiguras.setFont(fTitulo);
        lFiguras.setBounds(10,10,500,33);
        vSeparador1.setBounds(380,10,60,665);

        //Cantidades
        lCantidades.setBounds(390, 10, 500, 33);
        lCantidades.setFont(fTitulo);

        int y = 40;
        for(JLabel actual : cantidades) {
            actual.setFont(fLabel);
            actual.setBounds(390, y, 500, 33);
            y += 30;
            this.add(actual);
        }

        hSeparador1.setBounds(390,350,340,60);

        lDibujo.setBounds(390,350,500, 33);
        lDibujo.setFont(fTitulo);
        Dibujo.setBounds(390, 390, 300, 300);
        
        vSeparador2.setBounds(740,10,60,665);

        lDetalleTriangulo.setFont(fTitulo);
        lDetalleTriangulo.setBounds(750, 10, 500, 33);
        visualTriangulo.setLineWrap(true);
        visualTriangulo.setWrapStyleWord(true);
        visualTriangulo.setEditable(false);;
        scrollTriangulo.setBounds(750,45,275,300);

        hSeparador2.setBounds(750,350,275,60);

        lDetalleCilindros.setFont(fTitulo);
        lDetalleCilindros.setBounds(750,350,500, 33);
        visualCilindros.setLineWrap(true);
        visualCilindros.setWrapStyleWord(true);
        visualCilindros.setEditable(false);;
        scrollCilindros.setBounds(750,385,275,290);
        

        this.add(botonRandomizador);
        this.add(lFiguras);
        this.add(scrollVisual);
        this.add(vSeparador1);
        this.add(lCantidades);
        this.add(hSeparador1);
        this.add(lDibujo);
        this.add(vSeparador2);
        this.add(lDetalleTriangulo);
        this.add(scrollTriangulo);
        this.add(hSeparador2);
        this.add(lDetalleCilindros);
        this.add(scrollCilindros);
        this.add(Dibujo);
        
    }
    
    private ArrayList generarDatos(int num){
        ArrayList datos = new ArrayList();
        double random;
        for(int i = 0; i<num; i++){
            random = Math.random()*100+1;
            datos.add(random);
        }
        return datos;
    }
    
    private void crearFiguras(){
        double randomMedida = 0;
        ArrayList datos;
        int random = (int)(Math.random()*(50-30+1)+30);
        Figura nueva;
        for(int i = 0; i<random; i++){
            int randomTipo = (int)(Math.random()*8);
            
            if(randomTipo==0){
                randomMedida = Math.random()*100+1;
                nueva = new Cuadrado(randomMedida,i);
            }else if(randomTipo==1){
                datos = generarDatos(4);
                nueva = new Triangulo((double)(datos.get(0)),(double)(datos.get(1)),
                        (double)(datos.get(2)),(double)(datos.get(3)),i);
            }else if(randomTipo==2){
                datos = generarDatos(2);
                nueva = new Rectangulo((double)(datos.get(0)),(double)(datos.get(1)),i);
            }else if(randomTipo==3){
                randomMedida = Math.random()*100+1;
                nueva = new Circulo(randomMedida,i);
            }else if(randomTipo==4){ 
                datos = generarDatos(3);
                nueva = new Piramide((double)(datos.get(0)),(double)(datos.get(1)),
                        (double)(datos.get(2)),i);
            }else if(randomTipo==5){
                datos = generarDatos(2);
                nueva = new Cono((double)(datos.get(0)),(double)(datos.get(1)),i);
            }else if(randomTipo==6){
                datos = generarDatos(2);
                nueva = new Cilindro((double)(datos.get(0)),(double)(datos.get(1)),i);
            }else{
                randomMedida = Math.random()*100+1;
                nueva = new Cubo(randomMedida,i);
            }
            System.out.println(nueva);
            gestor.agregarFigura(nueva);
        }
    }
    
    private void llenarTextoTotal(){
        
    }
    
    private void llenarDatosGenerales(){
        System.out.println("a");
    }
    
    private void actualizar(){
        crearFiguras();
        llenarDatosGenerales();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(botonRandomizador)) {
            actualizar();
        }
    }
}
