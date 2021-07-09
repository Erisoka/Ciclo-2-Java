package clase03;

import java.util.Random;
import java.util.Scanner;

public class practica03 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int n, m, matA[][];

        System.out.print("Ingrese número de filas: ");
        m = leer.nextInt();
        System.out.print("Ingrese número de columnas: ");
        n = leer.nextInt();
        matA = new int[m][n];
        llenarMatriz(matA, m, n);
        System.out.println("=== Datos de la matriz A ===");
        imprimirMatriz(matA, m, n);

        int matB[][] = new int[m][n];
        int matC[][] = new int[m][n];
        llenarMatriz(matB, m, n);
        System.out.println("=== Datos de la matriz B ===");
        imprimirMatriz(matB, m, n);
        matC = sumarMatrices(matA, matB, m, n);
        System.out.println("=== Datos de la Matriz C Suma ===");
        imprimirMatriz(matC, m, n);

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

    // Método para sumar dos matrices
    public static int[][] sumarMatrices(int mat1[][], int mat2[][], int m, int n) {
        int resultado[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return resultado;
    }
}
