package com.ipartek.formacion.clases;

public class Vehiculo {

	// 1 .-atributos

	private String color;
	private String matricula;
	private int numeroPuertas;
	private int numeroRuedas;
	private float potencia; // CV

	// 2.- constructores

	public Vehiculo() {
		super(); // hace referencia a la superclase o Padre.
		this.color = "";
		this.matricula = "";
		this.numeroPuertas = 0;
		this.numeroPuertas = 0;
		this.potencia = 0;
	}

	// constructor sobrecargado.
	public Vehiculo(String color, String matricula) {
		// llamamos al constructor por defecto

		this(); // hace referencia a la propia clase
		this.color = color;
		this.matricula = matricula;
	}

	public Vehiculo(String color, String matricula, int numeroPuertas) {
		this(color, matricula);
		this.color = color;
		this.matricula = matricula;
		this.numeroPuertas = numeroPuertas;
	}

	// 3.- getters y setters

	public String getColor() {
		return color;
	}

	public String setColor(String color) {
		return this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	/**
	 * si el numero de ruedas es menor de cero, entonces, numeroRuedas =0
	 * 
	 * @param numeroRuedas
	 */
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;

	}

	public float getPotencia() {
		return potencia;
	}

	public float setPotencia() {
		return this.potencia = potencia;
	}

	// 4.- Tostring
	// se utiliza para poder sacar por pantalla datos

	@Override // sobreescribiendo el metodo delpadre.
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + ", numeroPuertas=" + numeroPuertas
				+ ", numeroRuedas=" + numeroRuedas + ", potencia=" + potencia + "]";
	}

	// 5.- Otros metodos || funciones|| comportamientos necesarios.

}
