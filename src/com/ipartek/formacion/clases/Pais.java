package com.ipartek.formacion.clases;

public class Pais {

	// atributos

	String nombre;
	int numeroInfectados;

	// Constructor

	public Pais() {
		super();
		this.nombre = "";
		this.numeroInfectados = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroInfectados() {
		return numeroInfectados;
	}

	public void setNumeroInfectados(int numeroInfectados) {
		this.numeroInfectados = numeroInfectados;
	}

	public boolean isInfectado() {

		return this.numeroInfectados > 0;
	}

	// crear ToString

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", numeroInfectados=" + numeroInfectados + "]";
	}

	// cuando se construye un pais su nombre es ""y numero casos 0
	// crear getters y Setters
	// Crear ToString

}
