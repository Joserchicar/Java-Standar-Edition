package com.ipartek.formacion.clases;

public class Alumno extends Persona {

	private String email;
	private String github;
	private float nota;

	public Alumno() {
		super();
		this.email = "";
		this.github = "";
		this.nota = 0;

	}

	public Alumno(String email, String github, float nota) {
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

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString() + "Almno [email=" + email + ", github=" + github + ", nota=" + nota + "]";
	}

}
