package com.ipartek.formacion.clases;

public class Profesor extends Persona {

	private static double sueldo;
	private static String materia;

	public Profesor() {
		super();

		this.sueldo = 0;
		this.materia = "";

	}

	public Profesor(float sueldo, String materia) {
		super();
		this.sueldo = 0;
		this.materia = "";
	}

	public static double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public static String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString() + "Profesor [sueldo=" + sueldo + ", materia=" + materia + "]";
	}

}
