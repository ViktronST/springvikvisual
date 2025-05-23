package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.stereotype.Component;

@Component("numeros")
public class Numeros {
    private int num1;
    private int num2;

    public Numeros() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Numeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
