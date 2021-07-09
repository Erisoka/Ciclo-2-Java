package co.edu.uninorte.misiontic2022.c2;

/**
 * Grupo 61 Ciclo 2, 3 de julio
 * https://www.youtube.com/watch?v=zPMRYUa34CU
 * App Sistema de Notas
 *
 */
public class App 
{
    public static void main( String[] args ){
        //Probar el comportamiento de Notas
        Nota notaVacia = new Nota();
        System.out.println("Nota Vacia");
        System.out.println("Valor Escala 5 -> " + notaVacia.getEscala5());
        System.out.println("Valor Escala 10 -> " + notaVacia.getEscala10());
        System.out.println("Valor Escala 100 -> " + notaVacia.getEscala100());
        System.out.println("Cualitativa -> " + notaVacia.getCualitativa());

        Nota notaEscala5= new Nota(4.4f, 5);
        System.out.println("Nota Escala 5");
        System.out.println("Valor Escala 5 -> " + notaEscala5.getEscala5());
        System.out.println("Valor Escala 10 -> " + notaEscala5.getEscala10());
        System.out.println("Valor Escala 100 -> " + notaEscala5.getEscala100());
        System.out.println("Cualitativa -> " + notaEscala5.getCualitativa());
        
        Nota notaEscala10= new Nota(4.8f, 10);
        System.out.println("Nota Escala 10");
        System.out.println("Valor Escala 5 -> " + notaEscala10.getEscala5());
        System.out.println("Valor Escala 10 -> " + notaEscala10.getEscala10());
        System.out.println("Valor Escala 100 -> " + notaEscala10.getEscala100());
        System.out.println("Cualitativa -> " + notaEscala10.getCualitativa());

        Nota notaEscala100= new Nota(79f, 100);
        System.out.println("Nota Escala 100");
        System.out.println("Valor Escala 5 -> " + notaEscala100.getEscala5());
        System.out.println("Valor Escala 10 -> " + notaEscala100.getEscala10());
        System.out.println("Valor Escala 100 -> " + notaEscala100.getEscala100());
        System.out.println("Cualitativa -> " + notaEscala100.getCualitativa());
    }
}
