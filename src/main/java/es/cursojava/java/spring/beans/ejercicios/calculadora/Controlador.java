package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.stereotype.Component;

@Component("controlador")
public class Controlador {
    private String operacion;
    private CalculadoraService calculadoraService;

    public Controlador(String operacion, CalculadoraService calculadoraService) {
        this.operacion = operacion;
        this.calculadoraService = calculadoraService;
    }

    public void ejecutaOperacion() {
        try {
            int resultado = calculadoraService.operar(operacion);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error al ejecutar la operación: " + e.getMessage());
        }
    }
    
}
