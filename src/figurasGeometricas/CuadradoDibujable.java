package figurasGeometricas;

import java.awt.*;

public class CuadradoDibujable extends Cuadrado implements figuraDibujable {

    private int x;
    private int y;
    public CuadradoDibujable(double valor1, int x, int y){
        super(valor1);
        this.x=x;
        this.y=y;

    }

    @Override
    public void setCoordenadas(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void dibujar2D(Graphics g){
        g.drawRect(this.x, this.y, (int) this.valor1,(int) this.valor1);

    }

}
