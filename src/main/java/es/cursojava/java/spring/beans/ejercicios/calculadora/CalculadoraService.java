package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.stereotype.Service;

@Service("calculadoraService")
public class CalculadoraService {
    private Numeros numeros;

    public CalculadoraService() {
        this.numeros = numeros;
    }

    public int operar(String operacion) {
        int a = numeros.getNum1();
        int b = numeros.getNum2();

        switch (operacion) {
            case "suma":
                return a + b;
            case "resta":
                return a - b;
            case "multiplicacion":
                return a * b;
            case "division":
                if (b == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operación no válida: " + operacion);
        }
    }
}
