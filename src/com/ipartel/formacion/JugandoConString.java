package com.ipartel.formacion;

public class JugandoConString {

	public static void main(String[] args) {

		String nombre = "Jose Antonio Friolan de todos los Santos";

		// longitud
		System.out.println("longitud del String" + nombre.length());

		// numero vocales

		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;
		char caracter;

		for (int i = 0; i < nombre.length(); i++) {
			caracter = nombre.charAt(i);
			caracter = Character.toLowerCase(caracter);

			// contar mayusculas

			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;

			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}

			// contar vocales y consonantes si 0>es Letra

			// TODO falt el if

			switch (caracter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				numeroVocales++;
				break;

			default:
				break;
			}
			System.out.println("numero vocales" + numeroMinusculas);
			System.out.println("numero vocales" + numeroMayusculas);
			System.out.println("numero vocales" + numeroVocales);

			System.out.println("numero vocales" + numeroConsonantes);

		}

		// numero consonantes

		// numero de palabras

		// buscar posicion de una letra concreta

		// limpiar espacios en blanco

		// sustituir una letra por otra

	}

}
