import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App03 {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader lector = new BufferedReader(capturarTeclado);
        System.out.println("Ingrese su edad: ");
        String strEdad = lector.readLine();
        Integer edad = Integer.parseInt(strEdad);

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}
