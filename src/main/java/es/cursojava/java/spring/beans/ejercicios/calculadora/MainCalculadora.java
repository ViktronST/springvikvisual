package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCalculadora {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Numeros.class);

        //Controlador controlador = context.getBean("controlador", Controlador.class);

        Controlador controlador = (Controlador)context.getBean("controlador");
        
        //Controlador controlador = context.getBean(Controlador.class);

        controlador.ejecutaOperacion();
    }
}
