package com.ipartek.formacion.clases;

public class Persona {

	public static final String GENERO_FEMENINO = "f";
	public static final String GENERO_MASCULINO = "m";
	public static final String GENERO_INDEFINIDO = "i";
//Atributos siempre son private para que no se pueda manipular desde fuera de esta
	// clase.
// para poder manipular atributos hay que crear metodos publicos 
	// denominados Getters y Setters. A esto se denomina encapsulación.

	private String nombre;
	private int edad;
	private float altura;
	private String genero;
	private String raza;

	// TODO Auto-generated constructor stub

	// constructor porque se llama igual qu la clase
	public Persona() {
		super();

		this.nombre = "";
		this.edad = 0;

	}

	public Persona(String nombre, int edad, float altura, String genero, String raza) {
		super();
		this.nombre = "anonimo";
		this.edad = 0;
		this.altura = 0f;
		this.genero = "i";
		this.raza = "";
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getGenero(String genero) {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", genero=" + genero + ", raza="
				+ raza + "]";
	}

}
