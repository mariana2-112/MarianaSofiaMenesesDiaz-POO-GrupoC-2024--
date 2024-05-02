public class Rombo extends Shape {
    private double base, altura;

public Rombo(double base, double altura) {
    this.base=base;
    this.altura=altura;
}
@Override
public double calcularArea() {
    return base * altura;
}

    @Override
    public double calcularPerimetro() {
        return base + base + altura + altura;
    }
}