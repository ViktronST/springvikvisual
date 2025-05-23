package es.cursojava.java.spring.beans.anotaciones;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component("SaludoBean")
// @Scope(scopeName = "prototype")
@Service("SaludoBean")
public class ServicioSaludo {

    public ServicioSaludo() {
        super();
    }

    public void saludar() {
        System.out.println("¡Hola desde un bean de Spring!");
    }
}