package prueba;

import java.util.Scanner;

/**
 * Realizar un programa en java que realice la siguiente función: Crear un array
 * de 5 notas que almacenara en formato double. Una vez creado dicho array se
 * rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array
 * 
 * @author José Ramón Chica Ramírez
 *
 */
public class UF2404EjercicioA {

	public static void main(String[] args) {

		// declarar variables : arrayNotas, media, maxima, minima

		double[] notas = { 0.0, 0.0, 0.0, 0.0, 0.0 };
		double media = 0.0;
		double maxima = 0.0;
		double minima = 10.0;
		double nota = 0.0;
		double sumaNotas = 0.0;

		// Abrir Scanner
		Scanner sc = new Scanner(System.in);

		// hacer un for con la longitud del array
		for (int i = 0; i < notas.length; i++) {

			boolean volverApeguntar = true;

			// preguntar por pantalla la nota
			System.out.println("Introduce una nota");
			do {

				try {
					nota = Double.parseDouble(sc.nextLine());
					volverApeguntar = false;

				} catch (Exception e) {
					System.out.println("Introduzca una nota valida");

				}
			} while (volverApeguntar);

			// guardar en el array la nota
			notas[i] = nota;
			sumaNotas = sumaNotas + nota;

			// sumar la nota en la variable media
			// comprobar si es la nota maxima para guardarla en la variable 'maxima'
			if (maxima < notas[i]) {
				maxima = nota;

			} // fin if

			// lo mismo con la minima

			if (minima > notas[i]) {
				minima = nota;

			} // fin if

		} // end for
			// calculo de la media
		media = sumaNotas / notas.length;

		// usar la variable media para conseguir la 'media' de notas

		System.out.println("La media de las notas obtenidas es " + media);

		System.out.println(" la nota maxima es " + maxima);

		System.out.println(" la nota minima es " + minima);

		// Cerrar Scanner
		sc.close();
	}// fin main

}// fin class
