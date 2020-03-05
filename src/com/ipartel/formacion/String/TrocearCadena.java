package com.ipartel.formacion.String;

public class TrocearCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		String lineaCVS = "jose;froilan;16;35.000";
		// mostrar nombre y apellido, la edad y el sueldo anual
		String[] arrayLineaCVS = lineaCVS.split(";");
		System.out.println("el nombre completo es : " + arrayLineaCVS[0] + " " + arrayLineaCVS[1]);
		System.out.println("La edad  es : " + arrayLineaCVS[2] + " años");
		System.out.println("El Sueldo Anual es : " + arrayLineaCVS[3]);

		for (int i = 0; i < arrayLineaCVS.length; i++) {

			System.out.println("los datos son " + arrayLineaCVS[i]);
		}
	}

}
