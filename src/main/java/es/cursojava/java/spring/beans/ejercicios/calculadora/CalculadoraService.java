package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Capa de lógica, vamos a ejecutar acciones
@Service
public class CalculadoraService {
    
    // Autowired para inyección de dependencias, en este caso de la clase Numeros
    @Autowired
    private Numeros numeros;

    // Constructor por defecto
    public CalculadoraService() {
    }

    // Constructor que recibe un objeto Numeros
    public CalculadoraService(Numeros numeros) {
        this.numeros = numeros;
    }

    // Método para realizar la operación
    public void operar(String operacion) {
        // int a = numeros.getNum1();
        // int b = numeros.getNum2();
        // System.out.println("Operando: " + a + " y " + b + " con operación: " + operacion);
        // switch (operacion) {
        //     case "suma":
        //         System.out.println("Sumando: " + a + " + " + b);
        //         return (a) + (b);
        //     case "resta":
        //         System.out.println("Restando: " + a + " - " + b);
        //         return (a) - (b);
        //     case "multiplicacion":
        //         System.out.println("Multiplicando: " + a + " * " + b);
        //         return (a) * (b);
        //     case "division":
        //         System.out.println("Dividiendo: " + a + " / " + b);
        //         if (b == 0) {
        //             throw new ArithmeticException("División por cero");
        //         }
        //         return (a) / (b);
        //     default:
        //         throw new IllegalArgumentException("Operación no válida: " + operacion);
        // }
        operacion = "suma";
        switch (operacion) {
            case "suma": System.out.println("suma: " + (numeros.getNum1() + numeros.getNum2())); break;
            case "resta": System.out.println("resta: " + (numeros.getNum1() - numeros.getNum2())); break;
            case "multiplicacion": System.out.println("multiplicacion: " + (numeros.getNum1() * numeros.getNum2())); break;
            case "division":
                if (numeros.getNum2() == 0) {
                    throw new ArithmeticException("División por cero");
                }
                System.out.println("division: " + (numeros.getNum1() / numeros.getNum2())); break;
            default:
                throw new IllegalArgumentException("Operación no válida: " + operacion);
        }
    }

    // Getters y Setters
    public Numeros getNumeros() {
        return numeros;
    }

    public void setNumeros(Numeros numeros) {
        this.numeros = numeros;
    }
    
}
