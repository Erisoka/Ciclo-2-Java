package reto02;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SchoolGradingSystemdev {

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

        // Registro Manual de los datos
        String filas[] = new String[18];
        filas[0] = "1.0 0.0 1.0 5.6";
        filas[1] = "1.0 0.0 2.0 0.4";
        filas[2] = "1.0 0.0 3.0 7.8";
        filas[3] = "2.0 0.0 1.0 8.9";
        filas[4] = "2.0 0.0 2.0 0.5";
        filas[5] = "2.0 0.0 3.0 1.5";
        filas[6] = "3.0 0.0 1.0 8.1";
        filas[7] = "3.0 0.0 2.0 4.0";
        filas[8] = "3.0 0.0 3.0 7.9";
        filas[9] = "4.0 1.0 1.0 4.8";
        filas[10] = "4.0 1.0 2.0 9.3";
        filas[11] = "4.0 1.0 3.0 4.8";
        filas[12] = "5.0 1.0 1.0 5.8";
        filas[13] = "5.0 1.0 2.0 3.3";
        filas[14] = "5.0 1.0 3.0 4.7";
        filas[15] = "6.0 1.0 1.0 6.3";
        filas[16] = "6.0 1.0 2.0 5.5";
        filas[17] = "6.0 1.0 3.0 8.4";

        // Lectura y registro de datos
        // System.out.print("Número de registros que se deben leer: ");
        // String registrosString = leer.nextLine();
        String registrosString = "18";
        int registrosInteger = Integer.parseInt(registrosString);
        System.out.println("Registros que se deben ingresar: " + registrosInteger);
        datosFloat = new float[registrosInteger][4];

        for (int i = 0; i < registrosInteger; i++) {
            // System.out.print("Datos registro "+ (i+1)+": ");
            // registrosString = leer.nextLine();
            // String cantidades[] = registrosString.split(" ");
            String cantidades[] = filas[i].split(" ");
            for (int j = 0; j < 4; j++) {
                datosFloat[i][j] = Float.parseFloat(cantidades[j]);
            }
        }
        imprimirMatriz(datosFloat);
        calcular();
    }

    public void calcular() {
        for (int i = 0; i < datosFloat.length; i++) {
            sumador = sumador + datosFloat[i][3];
            contador = contador + 1;
            if (datosFloat[i][3] > 3 && datosFloat[i][3] <= 6) {
                contInsuficientes = contInsuficientes + 1;
            }
            // Promedio feminino de Literatura
            if (datosFloat[i][1] == 1 && datosFloat[i][2] == 1) {
                sumLit = sumLit + datosFloat[i][3];
                contLit = contLit + 1;
            }
            // Promedio feminino de Bilogia
            if (datosFloat[i][1] == 1 && datosFloat[i][2] == 2) {
                sumBio = sumBio + datosFloat[i][3];
                contBio = contBio + 1;
            }
            // Promedio femenino de Geografia
            if (datosFloat[i][1] == 1 && datosFloat[i][2] == 3) {
                sumGeo = sumGeo + datosFloat[i][3];
                contGeo = contGeo + 1;
            }
            // Estudiante mejor desempeño en Literatura (1)
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
            System.out.println("=== Promedio del grupo ===");
            // System.out.printf("%.2f %n", promedio);
            System.out.println(f.format(promedio));
        }
    }

    public void question2() {
        System.out.println("=== Cantidad Examenes Insuficientes ===");
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
        System.out.println("=== Materia con mejor desempeño femenino ===");
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
        System.out.println("=== Estudiante con mejor desempeño en Literatura ===");
        System.out.println(nombresString[(int)idEstudiante - 1]);
    }

    public static void imprimirMatriz(float matriz[][]) {
        System.out.println("=== Matriz Ingresada ===");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}

class Nota {

    private float nota;

    public Nota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

}

class Materia {
    private String nombre;
    private Nota nota;
    private float codigo;
    private static float sumadorNota;
    private static int contadorMateria;
    private static float promedioNota;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return this.nota.getNota();
    }

    public void setNota(Float nota) {
        this.nota.setNota(nota);
    }

    public Materia(String nombre, Float nota, float codigo) {
        this.nombre = nombre;
        this.nota = new Nota(nota);
        this.codigo = codigo;
        Materia.contarMateria(nota);
    }

    public static void contarMateria(float nota) {
        contadorMateria++;
        sumadorNota += nota;
    }

    public static void Promedio() {
        promedioNota = sumadorNota / contadorMateria;
    }
}

class Estudiante {
    private String nombre;
    private float codigo;
    public float genero;
    private ArrayList<Materia> materias = new ArrayList<Materia>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCodigo() {
        return this.codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public float getGenero() {
        return this.genero;
    }

    public void setGenero(float genero) {
        this.genero = genero;
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia);
    }

    public Estudiante(String nombre, float codigo, float genero) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.genero = genero;
    }

}