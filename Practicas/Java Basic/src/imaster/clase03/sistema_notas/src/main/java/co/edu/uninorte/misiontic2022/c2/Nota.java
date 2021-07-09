package co.edu.uninorte.misiontic2022.c2;

public class Nota {
    // Atributos
    private float escala100;
    private float escala10;
    private float escala5;
    private String cualitativa;

    // Constructor(es)
    Nota() {
        this.escala100 = 0f;
        this.escala10 = 0f;
        this.escala5 = 0f;
        this.cualitativa = "";
    }

    // Nota(int escala100) {
    // this.escala100 = escala100;
    // this.escala10 = escala100 / 10;
    // this.escala5 = escala100 / 20;
    // if (escala100 >= 60) {
    // this.cualitativa = "Aprobado";
    // } else {
    // this.cualitativa = "Reprobado";
    // }
    // }

    // Nota(float escala10) {
    // float temp = escala10 * 10;
    // this.escala100 = (int) temp;
    // this.escala10 = escala10;
    // this.escala5 = escala10 / 2;
    // if (escala10 >= 6) {
    // this.cualitativa = "Aprobado";
    // } else {
    // this.cualitativa = "Reprobado";
    // }
    // }

    // Nota(double escala5) {
    // double temp = escala5 * 20;
    // this.escala100 = (int) temp;
    // temp = escala5 * 2;
    // this.escala10 = (int) temp;
    // this.escala5 = escala5;
    // if (escala10 >= 3) {
    // this.cualitativa = "Aprobado";
    // } else {
    // this.cualitativa = "Reprobado";
    // }
    // }

    Nota(Float nota, int escala) {
        if (escala > 10) {
            this.escala100 = nota;
            this.escala10 = nota / 10;
            this.escala5 = nota / 20;
            if (nota >= 60) {
                this.cualitativa = "Aprobado";
            } else {
                this.cualitativa = "Reprobado";
            }
        } else {
            if (escala > 5) {
                this.escala100 = nota * 10;
                this.escala10 = nota;
                this.escala5 = nota / 2;
                if (nota >= 6) {
                    this.cualitativa = "Aprobado";
                } else {
                    this.cualitativa = "Reprobado";
                }
            } else {
                this.escala100 = nota * 20;
                this.escala10 = nota * 2;
                this.escala5 = nota;
                if (nota >= 3) {
                    this.cualitativa = "Aprobado";
                } else {
                    this.cualitativa = "Reprobado";
                }
            }
        }
    }

    // Métodos

    // Getters
    public String getCualitativa() {
        return cualitativa;
    }

    public float getEscala100() {
        return escala100;
    }

    public float getEscala10() {
        return escala10;
    }

    public double getEscala5() {
        return escala5;
    }

    // Setters
    public void setCualitativa(String cualitativa) {
        this.cualitativa = cualitativa;
    }

    public void setEscala10(float escala10) {
        this.escala10 = escala10;
    }

    public void setEscala100(int escala100) {
        this.escala100 = escala100;
    }

    public void setEscala5(double escala5) {
        this.escala5 = escala5;
    }

}

// Grupo 61 Ciclo 2, 3 de julio
// https://www.youtube.com/watch?v=zPMRYUa34CU
