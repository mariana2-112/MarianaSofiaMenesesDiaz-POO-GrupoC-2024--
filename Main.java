import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        // NullPointerException
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // ClassCastException
        try {
            Object objeto = new Integer(10);
            String texto = (String) objeto;
        } catch (ClassCastException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // NumberFormatException
        try {
            int numero = Integer.parseInt("abc");
            System.out.println(numero);
        } catch (NumberFormatException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // IOException
        try {
            FileReader archivo = new FileReader("archivo.txt");
        } catch (IOException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // FileNotFoundException
        try {
            FileReader archivo = new FileReader("archivo_que_no_existe.txt");
        } catch (FileNotFoundException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // ArithmeticException
        try {
            System.out.println(10/0);
        } catch (ArithmeticException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // IllegalArgumentException
        try {
            throw new IllegalArgumentException("Argumento ilegal");
        } catch (IllegalArgumentException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // IllegalStateException
        try {
            throw new IllegalStateException("Estado ilegal");
        } catch (IllegalStateException error) {
            System.out.println(error);
            System.out.println("  ");
        }

        // OutOfMemoryError
        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError error) {
            System.out.println(error);
            System.out.println("  ");
        }
    }
}
