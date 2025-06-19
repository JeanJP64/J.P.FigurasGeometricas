package figurasGeometricas;

public class Triangulo extends Figura {

    public Triangulo(double valor1) throws ValorInvalidoException {
        super(valor1);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(this.valor1, 2);
    }

    @Override
    public double getPerimetro() {
        return 3 * this.valor1;
    }
}