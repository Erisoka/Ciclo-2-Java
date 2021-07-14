package clase04;

public class practicasesion04 {

    public static void main(String[] args) {
        Persona objetoPersona = new Persona();
        objetoPersona.id = 1010;
        objetoPersona.nombre = "Maria Iglesias";
        objetoPersona.salario = 2500000;
        objetoPersona.edad = 25;
        objetoPersona.Mostrar();

        Persona anitaPersona = new Persona();
        anitaPersona.id = 2020;
        anitaPersona.nombre = "Anita Gomez";
        anitaPersona.salario = 1000000;
        anitaPersona.edad = 22;
        anitaPersona.Mostrar();
    }
}
