package prueba;

import java.util.Scanner;

/**
 * Ejercicio para Lorem Ipsum....
 * 
 * @author ur00
 *
 */
public class EjercicioA {

	public static void main(String[] args) {

		System.out.println("Empezamos");
		int[] alturas = new int[5];
		int media = 0;
		int alturaMaxima;
		int alturaMinima;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Dime un numero:");
			int altura = Integer.parseInt(sc.nextLine());
			alturas[i] = altura;

			// calcular media
			media = media + altura;

			// altura maxima

			if (altura < alturas[i]) {

				alturaMaxima = altura;
			}
			// altura minima

			if (altura > alturas[i]) {

				alturaMaxima = altura;
			}

		} // for

		System.out.println("La media es " + (media / 5));
		// System.out.println("La altura maxima es " + alturaMaxima);
		// System.out.println("La altura miinima es " + alturaMinima);
		System.out.println("Agur Venur");

		sc.close();

	}// main

}// clase
