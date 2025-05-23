package es.cursojava.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejemplo {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml")) {
            System.out.println("Contexto cargado correctamente.");
        }
    }
}
