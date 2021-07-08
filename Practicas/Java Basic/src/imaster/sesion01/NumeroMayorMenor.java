package imaster.sesion01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroMayorMenor {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader lector = new BufferedReader(capturarTeclado);
        System.out.println("Ingrese el primer número: ");
        String strNumero = lector.readLine();
        Integer numero1 = Integer.parseInt(strNumero);
        System.out.println("Ingrese el segundo número: ");
        strNumero = lector.readLine();
        Integer numero2 = Integer.parseInt(strNumero);
        System.out.println("Ingrese el tercer número: ");
        strNumero = lector.readLine();
        Integer numero3 = Integer.parseInt(strNumero);
        
        Integer mayor = numero1;
        Integer menor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        } 

        if (numero2 < menor) {
            menor = numero2;
        } 
        if (numero3 < menor) {
            menor = numero3;
        } 

        System.out.println("El número mayor es: "+ mayor);
        System.out.println("El número menor es: "+ menor);
    }
}

