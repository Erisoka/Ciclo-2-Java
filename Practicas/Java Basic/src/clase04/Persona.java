package clase04;

public class Persona {
    int id;
    String nombre;
    double salario;
    int edad;

    public void Mostrar() {
        System.out.println("=== Datos de la persona ===");
        System.out.println("Id: "+ id + " Nombre: "+ nombre +" Salario: $"+ salario +" Edad: "+ edad);
    }
}
