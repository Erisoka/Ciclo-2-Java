package clase05;

public class Estudiante {
    private String nombre;
    private float nota1;
    private float nota2;
    private float nota3;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return this.nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    public Estudiante() {
        nota1 = 3.0f;
        nota2 = 3.5f;
        nota3 = 4.0f;
    }

    public Estudiante(String nom, float n1, float n2, float n3){
        nombre = nom;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public float Promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
