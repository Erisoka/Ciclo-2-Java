package imaster;

public class sesion02 {
    /*
     * private String nombre; private int identificacion; private double estatura;
     * private float peso; private char sexo; private boolean estaVacunado;
     */

    public static void main(String[] args) {
        // System.out.println("Hola mundo!");
        // int x = 5;
        // int y = 2;
        // int varEntero = x / y;
        // float varFloat = (float)(x) / (float)(y);
        // System.out.println(varEntero);
        // System.out.println(varFloat);

        // Estructura de control
        int key = 0;
        switch (key) {
            case 1:
                System.out.println("Caso 1");
                // bloque de codigo
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                // bloque de codigo
                break;
            default:
                System.out.println("Caso Default, ninguno de los anteriores.");
                break;
        }

        // Estrucutas de contro ciclicas, repetitivas, bucles
        // While
        boolean continuar = true;
        while (continuar) {
            System.out.println("Entre al ciclo while");
            continuar = false;
        }
        // Do while
        continuar = false;
        do {
            System.out.println("Entre al ciclo do while al menos 1 vez.");
        } while (continuar);
        // for each
        String[] carros = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String modelo : carros) {
            System.out.println(modelo);
        }
        // For
        for (int i = 0; i < carros.length; i++) {
            
        }
        //https://youtu.be/FSJlnNBQEJM?t=5784
    }
}
