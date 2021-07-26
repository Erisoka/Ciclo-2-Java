package clase08;

import clase08.paquete1.Ejemplo1;

public class App {

    public static void main(String[] args) {
        Ejemplo1 ob = new Ejemplo1();
        System.out.println("Atributo: " + ob.getAtributo() + " Atributo 2: " + ob.atributo2);
        ob.atributo2 = 10;
        ob.setAtributo(5);
        System.out.println("Atributo: " + ob.getAtributo() + " Atributo 2: " + ob.atributo2);
    }

}
