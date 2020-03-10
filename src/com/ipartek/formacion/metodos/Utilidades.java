package com.ipartek.formacion.metodos;

import java.util.Scanner;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";
	public static final String idioma = "";
	public static final char caracteres[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
			'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	static Scanner sc = new Scanner(System.in);

	static void saludar(String nombre) {
		System.out.println("Hola  " + nombre);
	}

	/**
	 * Saluda al nombre pasado por parametro en el idioma seleccionado
	 * 
	 * @see idiomas definidos en esta clase, por ejemplo: public static final String
	 *      IDIOMA_CASTELLANO
	 * @param nombre
	 * @param idioma
	 * @throws Throwable
	 */
	static String saludar(String nombre, String idioma) throws Exception {

		System.out.println("Selecciona tu idioma");
		// String idioma= sc Scanner(System.in);

		if (IDIOMA_CASTELLANO.equals(idioma) || IDIOMA_EUSKERA.equals(idioma) || IDIOMA_INGLES.equals(idioma)) {

			System.out.println("Hola  " + nombre);
		} else {
			throw new Exception("El idioma " + idioma + " no es valido");
		}
		return "";

	}

	static int suma(int a, int b) {
		return a + b;
	}

	// static char calcularLetraDni(int dni) {
	// calcular letra pasando un entero
	// char caracteres[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
	// 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
	// 'H', 'L', 'C', 'K', 'E' };

	// int resto = dni % 23;

	// return caracteres[resto];

	// }
	static char calcularLetraDni(int dni) throws Exception {
		String sDni = String.valueOf(dni);
		return calcularLetraDni(sDni);
	}

	static char calcularLetraDni(String dni) throws Exception {
		// cacular la letra pasndo un string
		int numero;
		if (dni != null && dni.length() == 8) {
			numero = Integer.parseInt(dni);
		} else {
			throw new Exception("no es un dni valido" + dni);
		}

		char caracteres[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		int resto = numero % 23;

		return caracteres[resto];

		// return calcularLetraDni(int dni)

	}

	public static int[] bubbleShort(int[] aDesordenado) {

		for (int i = 0; i < aDesordenado.length; i++) {

		}

		return null;
	}

}
