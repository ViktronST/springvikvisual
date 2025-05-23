package es.cursojava.java.spring.beans.autowired;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person implements Serializable{
	//@Value("Juan")
	private String nombre;

	//@Value("30")
	private int edad;
	
	public Person() {
	
	}
	
	public Person(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
