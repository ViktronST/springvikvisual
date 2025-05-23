package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.stereotype.Service;

@Service("calculadoraService")
public class CalculadoraService {
    private Numeros numeros;

    public int operar(String operacion) {
        return operar(operacion, numeros.getNum1(), numeros.getNum2());
    }

    public int operar(String operacion, int num1, int num2) {
        switch (operacion) {
            case "suma":
                return num1 + num2;
            case "resta":
                return num1 - num2;
            case "multiplicacion":
                return num1 * num2;
            case "division":
                if (num2 != 0) {
                    return (int) num1 / num2;
                } else {
                    throw new ArithmeticException("No se puede dividir entre cero");
                }
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}
