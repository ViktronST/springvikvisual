package es.cursojava.java.spring.beans.ejercicios.calculadora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCalculadora {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigCalc.class);

        //Controlador controlador = context.getBean("controlador", Controlador.class);

        //Controlador controlador = (Controlador)context.getBean("controlador");
        
        //Controlador controlador = context.getBean(Controlador.class);

        Controlador controlador = context.getBean(Controlador.class);
        System.out.println(controlador.getCalculadoraService().getNumeros().getNum1());
        System.out.println(controlador.getCalculadoraService().getNumeros().getNum2());

        System.out.println("===========================================");

        Numeros numeros = context.getBean(Numeros.class);
        // numeros.setNum1((int)Math.random() * 100);
        // numeros.setNum2((int)Math.random() * 100);
        numeros.setNum1(7);
        numeros.setNum2(20);

        controlador.ejecutaOperacion();
    }
}
