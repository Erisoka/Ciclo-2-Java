package clase10;

public class Jefe extends Empleado{
    private double incentivo;

    public Jefe(String nombre, double salario, String fechaContrato, double incentivo) {
        super(nombre, salario, fechaContrato);
        this.incentivo = incentivo;
        System.out.println("Construyendo Jefe: "+nombre);
    }

    public Jefe(){
        System.out.println("Construyendo Jefe.");
    }

    public double getIncentivo() {
        return this.incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public void Mostrar() {
        super.Mostrar();
        System.out.println("Incentivo: "+ incentivo);
    }
}
