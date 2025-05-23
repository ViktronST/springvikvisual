package es.cursojava.java.spring.beans.autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 
public class MainApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
    	Customer cust = (Customer)context.getBean("CustomerBean");
    	//System.out.println(cust.toString());
    	System.out.println(cust);
 
    }
}