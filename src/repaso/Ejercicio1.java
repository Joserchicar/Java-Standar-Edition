package repaso;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("prueba");

		System.out.println("otra prueba");

		String nombre = "Jose Ramon";
		String[] alumnos = { "Joserra", "Jose", "Ariel", "Guillermo" };
		double[] notas = { 8.5, 9.3, 8.5, 7.2 }; // array de notas con numeros enteros.
		String[] curso = { "Quimica", "Java", "Fisica", "Cocina" };
		System.out.println("mi nombre es " + nombre);
// posicion X alumno Y con la nota Z

		for (int i = 0; i < alumnos.length; i++) {

			System.out.println("posicion " + i + "  alumno " + alumnos[i] + " con la nota " + notas[i]
					+ " del curso de " + curso[i]);

		} // for i

	}// main

}// class
