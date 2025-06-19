package figurasGeometricas;

import java.awt.*;

public class CirculoDibujable extends Figura implements figuraDibujable {

    private int x;
    private int y;

    public CirculoDibujable(double valor1, int x, int y) throws ValorInvalidoException {
        super(valor1);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(valor1, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * valor1;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        g.drawOval(x, y, (int) valor1, (int) valor1);
    }
}