package reto01;

import java.util.Scanner;

public class reto1 {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String nombresString[] = new String [6];
        nombresString[0] = "armando";
        nombresString[1] = "nicolas";
        nombresString[2] = "daniel";
        nombresString[3] = "maria";
        nombresString[4] = "marcela";
        nombresString[5] = "alexandra";

        String materiasString[] = new String [3];
        materiasString[0] = "literatura";
        materiasString[1] = "biologia";
        materiasString[2] = "geografia";

        String registrosString = leer.nextLine();
        int registrosInteger = Integer.parseInt(registrosString);
        float datosFloat[][] = new float [registrosInteger][4];

        for (int i = 0; i < registrosInteger; i++) {
            registrosString = leer.nextLine();
            String cantidades[]  = registrosString.split(" ");
            for (int j = 0; j < 4; j++) {
                datosFloat[i][j] = Float.parseFloat(cantidades[j]);
            }
        }

        float sumador = 0; float sumLit = 0; float sumBio = 0; float sumGeo = 0;
        int contador = 0; int contInsuficientes = 0; int contLit = 0; int contBio = 0; int contGeo = 0;
        float notaMayorLit = -1; float idEstudiante = 0;
        for (int i = 0; i < datosFloat.length; i++) {
            sumador = sumador + datosFloat[i][3];
            contador = contador + 1;
            if (datosFloat[i][3] > 3 && datosFloat[i][3] <= 6) {
                contInsuficientes = contInsuficientes + 1;
            }
            if (datosFloat[i][1] == 1 && datosFloat[i][2] == 1) {
                sumLit = sumLit + datosFloat[i][3];
                contLit = contLit + 1;
            }
            if (datosFloat[i][1] == 1 && datosFloat[i][2] == 2) {
                sumBio = sumBio + datosFloat[i][3];
                contBio = contBio + 1;
            }
            if (datosFloat[i][1] == 1 && datosFloat[i][2] == 3) {
                sumGeo = sumGeo + datosFloat[i][3];
                contGeo = contGeo + 1;
            }
            if (datosFloat[i][2] == 1 && datosFloat[i][3] > notaMayorLit) {
                notaMayorLit = datosFloat[i][3];
                idEstudiante = datosFloat[i][0];
            }
        }
        if (contador > 0) {
            float promedio = sumador / contador;
            System.out.printf("%.2f %n", promedio);
        }
        System.out.println(contInsuficientes);
        float promLit = 0; float promBio = 0; float promGeo = 0;
        if (contLit > 0) {
            promLit = sumLit / contLit;
        }
        if (contBio > 0) {
            promBio = sumBio / contBio;
        } 
        if (contGeo > 0) {
            promGeo = sumGeo / contGeo;
        }
        if (promLit >= promBio && promLit >= promGeo) {
            System.out.println(materiasString[0]);
        } else {
            if (promBio >= promLit && promBio >= promGeo) {
                System.out.println(materiasString[1]);
            } else {
                System.out.println(materiasString[2]);
            }
        }
        System.out.println(nombresString[(int)idEstudiante - 1]);
    }
}
