import java.util.Scanner;
public class Rombo extends Shape {
    Scanner leer = new Scanner(System.in);
    public void calcularArea(){
        System.out.println("Ingrese la base");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();
        int area;
        area = base*altura;
        System.out.println(area);
    }

    public void calcularPerimetro(){
        System.out.println("Ingrese la base");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();
        int perimetro;
        perimetro = base + base + altura + altura;
        System.out.println(perimetro);

    }
}