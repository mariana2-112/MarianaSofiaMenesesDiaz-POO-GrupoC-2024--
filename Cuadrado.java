import java.util.Scanner;
public class Cuadrado extends Shape {
    Scanner leer = new Scanner(System.in);
    public void calcularArea(){
        System.out.println("Ingrese el lado");
        int lado = leer.nextInt();
        int area;
        area = lado * lado * lado * lado;
        System.out.println(area);
    }

    public void calcularPerimetro(){
        System.out.println("Ingrese el lado");
        int lado = leer.nextInt();
        int area;
        area = lado * lado;
        System.out.println(area);

    }
}