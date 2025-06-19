package figurasGeometricas;

import java.awt.*;

public class TrianguloDibujable extends Triangulo implements figuraDibujable {

    private int x;
    private int y;


    public TrianguloDibujable(double valor1, int x, int y) throws ValorInvalidoException {
        super(valor1);
        this.x = x;
        this.y = y;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        int lado = (int) this.valor1;


        int[] xPoints = { x, x + lado / 2, x - lado / 2 };
        int[] yPoints = { y, y + lado, y + lado };

        g.drawPolygon(xPoints, yPoints, 3);
    }
}