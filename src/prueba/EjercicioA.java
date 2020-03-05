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
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Dime un numero:");
			int altura = Integer.parseInt(sc.nextLine());
			alturas[i] = altura;

			media = media + altura;
			System.out.println("La media es " + (media));

			// TODO calcular media

			// TODO altura maxima
			// TODO altura minima

		} // for

		System.out.println("Agur Venur");

		sc.close();

	}// main

}// clase
