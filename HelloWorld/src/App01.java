public class App01 {
    public static void main(String[] args) throws Exception {
        Integer edad = 20;
        Boolean esMayorDeEdad = edad >= 18;

        if (esMayorDeEdad) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
