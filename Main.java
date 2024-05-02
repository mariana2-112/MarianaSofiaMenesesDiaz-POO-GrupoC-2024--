import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int figura;
        double radio, base, altura, lado;
        Rombo rombo1;
        Circulo circulo1;
        Cuadrado cuadrado1;

        while (true) {
            System.out.println("------------Escoge una figura------------");
            System.out.println("1.Rombo, 2.Circulo, 3.Cuadrado o 4.Finalizar");
            figura = leer.nextInt();

            switch (figura) {
                case 1:
                    System.out.println("ROMBO");
                    System.out.println("Ingrese la base:");
                    base = leer.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = leer.nextDouble();
                    rombo1 = new Rombo(base, altura);
                    System.out.println("Area: " + rombo1.calcularArea() + "\nPerimetro: " + rombo1.calcularPerimetro());
                    break;
                case 2:
                    System.out.println("CIRCULO");
                    System.out.println("Ingrese el radio:");
                    radio = leer.nextDouble();
                    circulo1 = new Circulo(radio);
                    System.out.println("Area: " + circulo1.calcularArea() + "\nPerimetro: " + circulo1.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("CUADRADO");
                    System.out.println("Ingrese el lado");
                    lado = leer.nextDouble();
                    cuadrado1= new Cuadrado(lado);
                    System.out.println("Area: " + cuadrado1.calcularArea() + "\nPerimetro: " + cuadrado1.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("Finalizando programa");
                    return;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}