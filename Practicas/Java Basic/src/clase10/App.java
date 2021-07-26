package clase10;

public class App {
    public static void main(String[] args) {
        // Jefe jefe_rh = new Jefe("Leonidas", 2500, "15/11/2015", 100);
        // Jefe jefe = new Jefe();

        Jefe vJefes[] = new Jefe[3];
        vJefes[0] = new Jefe("Leonidas", 2500, "01/01/2020", 100);
        vJefes[1] = new Jefe("Carlos", 4500, "01/05/2018", 250);
        vJefes[2] = new Jefe("Rossana", 600, "01/01/2020", 150);

        // jefe_rh.Mostrar();
        // jefe.Mostrar();

        // for (int i = 0; i < vJefes.length; i++) {
        //     vJefes[i].Mostrar();
        // }

        for (Jefe jefe : vJefes) {
            jefe.Mostrar();
        }
    }
}
