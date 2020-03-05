
package com.ipartel.formacion.String;

public class CalcularDNI {

	public static void main(String[] args) {

		// TODO sumar todos los numeros de este String

		char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		String dniTexto = "11111111";

		int numeroDni = Integer.parseInt(dniTexto);
		int restoDivision = numeroDni % 23;
		System.out.println("la letra es " + LETRA_DNI);

	}

}
