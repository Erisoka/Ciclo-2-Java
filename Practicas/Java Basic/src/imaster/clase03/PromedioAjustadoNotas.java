/*
    Script en Java que calcule el promedio del estudiante 0-5 redondeando a 2 decimales, leyendo el código alfanumerico del estudiante, las 5 notas de cada estudiante (que van de 0 a 100). No promediar la nota mas baja de las 5 notas del estudiante.
*/

package imaster.clase03;

public class PromedioAjustadoNotas {
    
    //Lógica
    public static double notaQuices(int nota1, int nota2, int nota3, int nota4, int nota5) {
        //Declarar varia que contiene el resultado del cómputo
        double promedioAjustado = 0;

        //Algoritmo Promedio Ajustado
        //1) Identificar cuál es la peor nota
        //2) Retirar la peor nota
        //3) Obtener el promedio
        //4) Hacer la conversión a escala de 0 a 5
        
        //1) Identificar cuál es la peor nota
        int peorNota = nota1;
        if (nota2 < peorNota) {
            peorNota = nota2;
        }
        if (nota3 < peorNota) {
            peorNota = nota3;
        }
        if (nota4 < peorNota) {
            peorNota = nota4;
        }
        if (nota5 < peorNota) {
            peorNota = nota5;
        }

        //2) Retirar la peor nota
        //3) Obtener el promedio
        promedioAjustado = ((nota1 + nota2 + nota3 + nota4 + nota5) - peorNota) / 4;
        
        //4) Hacer la conversión a escala de 0 a 5
        promedioAjustado = promedioAjustado / 20;

        //Retornar el resultado del 
        return promedioAjustado;
    }
    
    //Interacción
    public static void presentarPromedio(String codigo, double promedioAjustado) {
        System.out.println("El promedio ajustado del estudiante "+codigo+" es: "+promedioAjustado);
    }
    
    //Sección principal
    public static void main(String[] args) {
        String codigo = "AA0010276";
        presentarPromedio(codigo, notaQuices(40, 50, 39, 76, 96));
    }
}
