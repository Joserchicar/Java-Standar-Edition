package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Profesor;

public class alumnoProfesorPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor p1 = new Profesor();

		Alumno nombre = new Alumno();

		p1.setNombre("Ander");
		p1.setMateria("Java");
		p1.setSueldo(2500.00);

		System.out.println("los alumnos son..");
		System.out.println("El profesor " + p1.getNombre() + " cobra " + p1.getSueldo() + " € e imparte la materia de  "
				+ p1.getMateria());
	}

}
