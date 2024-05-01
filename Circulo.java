import java.util.Scanner;
public class Circulo extends Shape {
    Scanner leer = new Scanner(System.in);
    public void calcularArea(){
        System.out.println("Ingrese el radio");
        double radio = leer.nextDouble();
        radio = radio*radio;
        double area;
        double pi = 3.1416;
        area = radio * pi;
        System.out.println(area);
    }

    public void calcularPerimetro(){
        System.out.println("Ingrese el perimetro");
        double diametro = leer.nextDouble();
        double pi = 3.1416;
        double perimetro = pi * diametro;
        System.out.println(perimetro);

    }
}