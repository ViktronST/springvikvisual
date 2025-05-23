package es.cursojava.java.spring.beans.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "es.cursojava.java.spring.beans.autowired")
public class AppConfig {
	
//	@Bean(name = "CustomerBean")
//    public ServicioSaludo saludo() {
//        return new ServicioSaludo();
//    }
	
    @Bean(name = "PersonBean2")
    public Person persona2() {
        return new Person("Eva",51);
    }

    @Bean(name = "PersonBean1")
    public Person persona1() {
        return new Person("Marta",46);
    }
	
}
