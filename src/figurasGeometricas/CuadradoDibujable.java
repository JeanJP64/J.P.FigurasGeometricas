package figurasGeometricas;

import java.awt.*;

public class CuadradoDibujable extends Figura implements figuraDibujable {

    private int x;
    private int y;

    public CuadradoDibujable(double valor1, int x, int y) throws ValorInvalidoException {
        super(valor1);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return Math.pow(valor1, 2);
    }

    @Override
    public double getPerimetro() {
        return 4 * valor1;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        g.drawRect(x, y, (int) valor1, (int) valor1);
    }
}