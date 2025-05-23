package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.stereotype.Controller;

@Controller("controlador")
public class Controlador {
    private String operacion;
    private CalculadoraService calculadoraService;

    public Controlador(String operacion) {
        this.operacion = operacion;
    }

    public int ejecutarOperacion(String operacion, int num1, int num2) {
        this.operacion = operacion;
        return calculadoraService.operar(operacion, num1, num2);
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    
}
