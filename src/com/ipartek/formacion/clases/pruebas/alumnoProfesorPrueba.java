package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Profesor;

public class alumnoProfesorPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor p1 = new Profesor();

		Alumno[] alumnos = new Alumno[4];

		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno();
		Alumno a3 = new Alumno();
		Alumno a4 = new Alumno();

		p1.setNombre("Ander");
		p1.setMateria("Java");
		p1.setSueldo(2500.00);

		a1.setNombre("Jose Luis");
		a2.setNombre("Sergio");
		a3.setNombre("Alfredo");
		a4.setNombre("Javier");

		a1.setGenero("f");
		a2.setGenero("f");
		a3.setGenero("m");
		a4.getGenero("f");

		alumnos[0] = a1;
		alumnos[1] = a1;
		alumnos[2] = a1;
		alumnos[3] = a1;

		System.out.println("los alumnos son..");
		System.out.println("El profesor " + p1.getNombre() + " cobra " + p1.getSueldo() + " € e imparte la materia de  "
				+ p1.getMateria());

		System.out.println("El profesor " + p1.getNombre() + "imparte clase a los alumnos" + a1.getNombre() + " , "
				+ a2.getNombre() + " , " + a3.getNombre() + " y " + a4.getNombre());

		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());

		}

	}
}
