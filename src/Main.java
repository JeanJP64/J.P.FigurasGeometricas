import figurasGeometricas.CirculoDibujable;
import figurasGeometricas.CuadradoDibujable;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        figurasGeometricas.CirculoDibujable circulo = new CirculoDibujable(100, 0, 0);
        figurasGeometricas.CuadradoDibujable cuadrado = new CuadradoDibujable(100,100,0);

        System.out.println("El perímetro del circulo es: " + circulo.getPerimetro());
        System.out.println("El área del circulo es: " + circulo.getArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado.getPerimetro());
        System.out.println("El área del cuadrado es: " + cuadrado.getArea());


        JFrame frame = new JFrame("Dibujar circulo");
        JPanel panel = new JPanel() {


            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);

            }
        };

        panel.setPreferredSize(new Dimension (400,400));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}