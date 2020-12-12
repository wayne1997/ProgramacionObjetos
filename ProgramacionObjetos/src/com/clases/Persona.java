package com.clases;

public class Persona {
	private String nombre;
	private String cedula;
	private double estaturaMetros; //En metros
	
	public Persona() {}
	
	public Persona(String nombre, String cedula, double estaturaMetros) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.estaturaMetros = estaturaMetros;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public double getEstaturaMetros() {
		return estaturaMetros;
	}
	public void setEstaturaMetros(double estaturaMetros) {
		this.estaturaMetros = estaturaMetros;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", estaturaMetros=" + estaturaMetros + "]";
	}
	
	
}
