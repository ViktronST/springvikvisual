package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Cada vez que se inyecte, se crea una nueva instancia.
public class Numeros {
    
    @Value("7")
    private int num1;

    @Value("8")
    private int num2;

    public Numeros() {
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

    @Override
    public String toString() {
        return "Numeros [num1=" + num1 + ", num2=" + num2 + "]";
    }

}
