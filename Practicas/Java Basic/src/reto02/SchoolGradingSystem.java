import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SchoolGradingSystem {

    public static Scanner leer = new Scanner(System.in);
    public static float datosFloat[][];
    public static String[] nombresString = { "armando", "nicolas", "daniel", "maria", "marcela", "alexandra" };
    public static String materiasString[] = { "literatura", "biologia", "geografia" };
    public static float sumador = 0;
    public static float sumLit = 0;
    public static float sumBio = 0;
    public static float sumGeo = 0;
    public static int contador = 0;
    public static int contInsuficientes = 0;
    public static int contLit = 0;
    public static int contBio = 0;
    public static int contGeo = 0;
    public static float notaMayorLit = -1;
    public static float idEstudiante = 0;
    public static DecimalFormatSymbols separator = new DecimalFormatSymbols();   
    public static DecimalFormat f; 

    public void readData() {
        String registrosString = leer.nextLine();
        int registrosInteger = Integer.parseInt(registrosString);
        datosFloat = new float[registrosInteger][4];

        for (int i = 0; i < registrosInteger; i++) {
            registrosString = leer.nextLine();
            String cantidades[] = registrosString.split(" ");
            for (int j = 0; j < 4; j++) {
                datosFloat[i][j] = Float.parseFloat(cantidades[j]);
            }
        }
        calcular();
    }

    public void calcular() {
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
        separator.setDecimalSeparator('.');
        f = new DecimalFormat("0.00", separator);
    }

    public void question1() {
        if (contador > 0) {
            float promedio = sumador / contador;
            System.out.println(f.format(promedio));
        }
    }

    public void question2() {
        System.out.println(contInsuficientes);
    }

    public void question3() {
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
    }

    public void question4() {
        System.out.println(nombresString[(int)idEstudiante - 1]);
    }
}
