package figurasGeometricas;

import java.awt.desktop.AboutEvent;
public abstract class Figura {
    protected double valor1;

    public Figura(double valor1) throws ValorInvalidoException {
        if (valor1 <= 0) {
            throw new ValorInvalidoException("El valor debe ser mayor que 0.");
        }
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) throws ValorInvalidoException {
        if (valor1 <= 0) {
            throw new ValorInvalidoException("El valor debe ser mayor que 0.");
        }
        this.valor1 = valor1;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
}