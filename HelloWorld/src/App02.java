import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturarTeclado);
        System.out.println("Ingrese su nombre: ");
        String name = reader.readLine();
        System.out.println("Hola "+name);
    }
}
