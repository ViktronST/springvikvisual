package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("controlador")
public class Controlador {

    private String operacion;
    
    @Autowired
    private CalculadoraService calculadoraService;

    // Constructor por defecto
    public Controlador() {
    }

    // Constructor que recibe la operación y el servicio de calculadora
    public Controlador(String operacion, CalculadoraService calculadoraService) {
        this.operacion = operacion;
        this.calculadoraService = calculadoraService;
    }

    // Método para ejecutar la operación
    public void ejecutaOperacion() {
        try {
            calculadoraService.operar(operacion);
        } catch (Exception e) {
            System.out.println("Error al ejecutar la operación: " + e.getMessage());
        }
    }
    
    // Getters y Setters
    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public CalculadoraService getCalculadoraService() {
        return calculadoraService;
    }

    public void setCalculadoraService(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
}
