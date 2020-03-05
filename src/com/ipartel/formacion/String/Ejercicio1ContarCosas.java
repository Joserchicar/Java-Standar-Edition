package com.ipartel.formacion.String;

public class Ejercicio1ContarCosas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ¿ Que valor tiene por defecto un String si no lo inicializamos ?
		String sinInicializar;

		String nombre = " AaAnN 5 ";

		// longitud
		System.out.println("Longitud del nombre " + nombre.length());

		// numero vocales
		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;
		int numeroNumeros = 0;
		int numeroSpaces = 0;

		char caracter;
		for (int i = 0; i < nombre.length(); i++) {

			caracter = nombre.charAt(i);
			System.out.println("En la posicion " + i + " tenemos caracter " + caracter);

			// contar mayusculas y minusculas
			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;
			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}
			// contar numeros
			if (Character.isDigit(caracter)) {

				numeroNumeros++;
			}
			// contar espacios
			if (Character.isSpaceChar(caracter)) {
				numeroSpaces++;

			}

			// Contar (Vocales o Consonates) Si => es Letra

			if (Character.isLetter(caracter)) {

				caracter = Character.toLowerCase(caracter);
				switch (caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					numeroVocales++;
					break;

				default:
					numeroConsonantes++;
					break;
				}// switch

			} // if isLetter

		} // for

		System.out.println("Numero Mayusculas " + numeroMayusculas);
		System.out.println("Numero Minusculas " + numeroMinusculas);
		System.out.println("Numero Vocales " + numeroVocales);
		System.out.println("Numero Consonantes " + numeroConsonantes);
		System.out.println("Numero digitos " + numeroNumeros);

	}

}
