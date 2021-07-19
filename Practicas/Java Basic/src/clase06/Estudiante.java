package clase06;

public class Estudiante {

    private int id;
    private String nombre;
    public static String grado;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void Prueba(){
        grado = "10°";
    }

    public void Imprimir(){
        // Prueba();
        System.out.println(id + " " + nombre + " " + grado);
    }

}