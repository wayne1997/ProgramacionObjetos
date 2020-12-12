package com.principal;
import com.clases.*;


public class Principal {
	
	public static void main(String args[]) {
		Persona persona = new Persona();
		persona.setNombre("Alex");
		persona.setCedula("06029723");
		persona.setEstaturaMetros(1.80);		
		System.out.println(persona.toString());
		
		
		Persona persona2 = new Persona("Ana", "0988766", 1.56);
		System.out.println(persona2.toString());
		
		/*
		Persona persona2 = new Persona();
		
		persona.nombre = "Ana";
		persona.cedula = "09766687";
		persona.estaturaMetros = 1.76;
		
		persona2.nombre = "Ismael";
		persona2.cedula = "0882873";
		persona2.estaturaMetros = 1.98;
		
		System.out.println(persona.nombre);
		System.out.println(persona2.nombre); */
	}
}
