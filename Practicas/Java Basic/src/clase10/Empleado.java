package clase10;

public class Empleado {
    private String nombre;
    private double salario;
    private String fechaContrato;

    public Empleado(String nombre, double salario, String fechaContrato){
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContrato = fechaContrato;
        System.out.println("Construyendo Empleado: "+nombre);
    }

    public Empleado(){
        nombre = "";
        salario = 0;
        fechaContrato = "";
        System.out.println("Construyendo Empleado.");
    }

    public void Mostrar() {
        System.out.println("Empleado: " + nombre + ", Salario $ " + salario + ", Fecha Contrato: " + fechaContrato);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaContrato() {
        return this.fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
}
