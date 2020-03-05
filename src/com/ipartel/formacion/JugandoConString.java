package com.ipartel.formacion;

public class JugandoConString {

	public static void main(String[] args) {

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
		System.out.println("Numero espacios " + numeroSpaces);
		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		String lineaCVS = "jose;froilan;16;35.000";
		// mostrar nombre y apellido, la edad y el sueldo anual
		String[] arrayLineaCVS = lineaCVS.split(";");
		System.out.println("el nombre completo es : " + arrayLineaCVS[0] + " " + arrayLineaCVS[1]);
		System.out.println("La edad  es : " + arrayLineaCVS[2]);
		System.out.println("El Sueldo Anual es : " + arrayLineaCVS[3]);

		for (int i = 0; i < arrayLineaCVS.length; i++) {

			System.out.println("los datos son " + arrayLineaCVS[i]);
		}

		// buscar posicion de una letra concreta
		String buscarLetra = "Abracadrabra";
		System.out.println("La primera b esta en la poscion " + buscarLetra.indexOf('b'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('a'));
		System.out.println("¿Que pasa si no encuentra? " + buscarLetra.indexOf('z'));
		// buscar primera 'd'
		System.out.println("la primera d se encuentra en la posición " + buscarLetra.indexOf('d'));

		// buscar posicion ultima 'a'

		System.out.println("La ultima a se encuentra en la posición " + buscarLetra.lastIndexOf('a'));

		// limpiar espacios en blanco
		String datosIntroducidosUsuario = "    minombre       es Manolo    ";
		String limpiarEspacios = datosIntroducidosUsuario.trim();
		limpiarEspacios = limpiarEspacios.replace("  ", "");
		System.out.println(limpiarEspacios);

		// TODO cambiar numeros por letras y ademas pasar todo a MAYSUCULAS
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";

		System.out.println(textoCodificado);

		String cambioCero = textoCodificado.replace('0', 'O');
		String cambioCuatro = textoCodificado.replace('4', 'A');
		String cambioUno = textoCodificado.replace('1', 'I');
		String cambioTres = textoCodificado.replace('3', 'E');

		System.out.println(cambioCero + cambioCuatro + cambioUno + cambioTres);

		//
		/*
		 * String cambio1 = cambioCero; System.out.println("el cambio1 es " + cambio1);
		 * String cambio2 = cambio1 + cambioCuatro; System.out.println("el cambio2 es "
		 * + cambio2); String cambio3 = cambio2 + cambioUno; String cambio4 = cambio3 +
		 * cambioTres;
		 */

		// textoDecodificado = cambio4;
		// System.out.println(textoDecodificado);

		// TODO sumar todos los numeros de este String
		String dni = "12345678";

		// TODO buscar por interenet como se calcula la letra

	}

}
