import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int figura;

        Rombo rombo1 = new Rombo();
        Circulo circulo1 = new Circulo();
        Cuadrado cuadrado1 = new Cuadrado();

        while (true) {
            System.out.println("------------Escoge una figura------------");
            System.out.println("1.Rombo, 2.Circulo, 3.Cuadrado o 4.Finalizar");
            figura = leer.nextInt();

            switch (figura) {
                case 1:
                    System.out.println("ROMBO");
                    System.out.println("Area");
                    rombo1.calcularArea();
                    System.out.println("Perimetro");
                    rombo1.calcularPerimetro();
                    break;
                case 2:
                    System.out.println("CIRCULO");
                    System.out.println("Area");
                    circulo1.calcularArea();
                    System.out.println("Perimetro");
                    circulo1.calcularPerimetro();
                    break;
                case 3:
                    System.out.println("CUADRADO");
                    System.out.println("Ingrese el lado");
                    int lado = leer.nextInt();
                    System.out.println("Area");
                    cuadrado1.calcularArea();
                    System.out.println("Perimetro");
                    cuadrado1.calcularPerimetro();
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