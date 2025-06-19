import figurasGeometricas.CirculoDibujable;
import figurasGeometricas.CuadradoDibujable;
import figurasGeometricas.TrianguloDibujable;
import figurasGeometricas.ValorInvalidoException;

import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el valor para el círculo (radio): ");
            double valorCirculo = scanner.nextDouble();

            System.out.print("Ingrese el valor para el cuadrado (lado): ");
            double valorCuadrado = scanner.nextDouble();

            System.out.print("Ingrese el valor para el triángulo (lado): ");
            double valorTriangulo = scanner.nextDouble();

            CirculoDibujable circulo = new CirculoDibujable(valorCirculo, 0, 0);
            CuadradoDibujable cuadrado = new CuadradoDibujable(valorCuadrado, 100, 0);
            TrianguloDibujable triangulo = new TrianguloDibujable(valorTriangulo, 250, 0);

            System.out.println("\n--- Resultados ---");
            System.out.println("Círculo: Perímetro = " + circulo.getPerimetro() + ", Área = " + circulo.getArea());
            System.out.println("Cuadrado: Perímetro = " + cuadrado.getPerimetro() + ", Área = " + cuadrado.getArea());
            System.out.println("Triángulo: Perímetro = " + triangulo.getPerimetro() + ", Área = " + triangulo.getArea());

            JFrame frame = new JFrame("Dibujar Figuras Geométricas");
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    circulo.dibujar2D(g);
                    cuadrado.dibujar2D(g);
                    triangulo.dibujar2D(g);
                }
            };

            panel.setPreferredSize(new Dimension(400, 400));
            frame.add(panel);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar un número válido.");
        } catch (ValorInvalidoException e) {
            System.err.println("Error al crear la figura: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}