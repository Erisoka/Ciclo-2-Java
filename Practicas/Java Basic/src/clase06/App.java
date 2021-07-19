package clase06;

public class App {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();
        Estudiante.grado = "8°";
        est1.grado = "11°";
        est1.setId(101);
        est1.setNombre("Pedro Gomez");
        est2.setNombre("Maria C");
        est2.setId(20);
        est1.Imprimir();
        est2.Imprimir();
    }
}
