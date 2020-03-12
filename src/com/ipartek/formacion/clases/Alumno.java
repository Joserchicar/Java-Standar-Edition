package com.ipartek.formacion.clases;

public class Alumno extends Persona {

	public static final int NOTA_MIN = 0;
	public static final int NOTA_MAX = 10;
	private String email;
	private String github;
	private int nota;

	public Alumno() {
		super();
		this.email = "";
		this.github = "";
		this.nota = 5;

	}

	public Alumno(String email, String github, int nota) {
		super();
		this.email = email;
		this.github = github;
		this.nota = nota;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString() + "Almno [email=" + email + ", github=" + github + ", nota=" + nota + "]";
	}

}
