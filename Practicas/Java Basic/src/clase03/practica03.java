package clase03;

import java.util.Random;
import java.util.Scanner;

public class practica03 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int n, m, matriz[][];

        System.out.print("Ingrese número de filas: ");
        m = leer.nextInt();
        System.out.print("Ingrese número de columnas: ");
        n = leer.nextInt();
        matriz = new int[m][n];
        llenarMatriz(matriz, m, n);
        System.out.println("=== Datos de la matriz ===");
        imprimirMatriz(matriz, m, n);

        leer.close();
    }

    // Método para llenar la matriz aleatoriamente
    public static void llenarMatriz(int mat[][], int m, int n) {
        int i, j;
        Random rnd = new Random();

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                mat[i][j] = rnd.nextInt(99);
            }
        }
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int mat[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
