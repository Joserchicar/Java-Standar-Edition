package com.ipartek.formacion.clases;

public class Persona {
//Atributos siempre son private para que no se pueda manipular desde fuera de esta
	// clase.
// para poder manipular atributos hay que crear metodos publicos 
	// denominados Getters y Setters. A esto se denomina encapsulación.

	private String nombre;
	private int edad;

	// TODO Auto-generated constructor stub

	// constructor porque se llama igual qu la clase
	public Persona() {
		super();

		this.nombre = "anonimo";
		this.edad = 18;

	}

	// getters y Setters
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
		if (edad < 0) {
			this.edad = 0;

		} else {
			this.edad = edad;
		}

	}

	// otras funciones
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
