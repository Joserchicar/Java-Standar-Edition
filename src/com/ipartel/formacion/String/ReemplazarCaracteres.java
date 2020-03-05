package com.ipartel.formacion.String;

public class ReemplazarCaracteres {
	public static void main(String[] args) {
		// TODO cambiar numeros por letras y ademas pasar todo a MAYSUCULAS
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";
		String descodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";

		System.out.println(textoCodificado);

		descodificado = descodificado.replace('0', 'O');
		descodificado = descodificado.replace('4', 'A');
		descodificado = descodificado.replace('1', 'I');
		descodificado = descodificado.replace('3', 'E');

		System.out.println(descodificado);

		//

		/*
		 * String cambio1 = cambioCero; System.out.println("el cambio1 es " + cambio1);
		 * String cambio2 = cambio1 + cambioCuatro; System.out.println("el cambio2 es "
		 * + cambio2); String cambio3 = cambio2 + cambioUno; String cambio4 = cambio3 +
		 * cambioTres;
		 */

		// textoDecodificado = cambio4;
		// System.out.println(textoDecodificado);

	}
}
