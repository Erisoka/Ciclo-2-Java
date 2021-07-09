package clase02;
import java.util.Scanner;

public class vectoresEjemplo01 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejemplo con vectores unidimensionales");

        int n, i, v[];
        System.out.print("Ingrese tamaño vector: ");
        n = leer.nextInt();
        v = new int[n];

        for (i = 0; i < v.length; i++) {
            System.out.print("Ingrese el valor del vector V["+(i+1)+"]: ");
            v[i] = leer.nextInt();
        }
        for (i = 0; i < v.length; i++) {
            System.out.println("El valor del vector V["+(i+1)+"]: " + v[i]);
        }
        leer.close();
    }
}
