
package com.ipartel.formacion.String;

public class CalcularDNI {

	public static void main(String[] args) {

		// calcular letra del DNI

		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		String dniTexto = "12345678";
		int numeroDni = Integer.parseInt(dniTexto);

		int restoDivision = numeroDni % 23;

		System.out.println("La letra es " + LETRA_DNI[restoDivision]);

	}

}
