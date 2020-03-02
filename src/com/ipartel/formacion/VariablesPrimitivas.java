package com.ipartel.formacion;

public class VariablesPrimitivas {

	public static void main(String[] args) {

		// booleano

		boolean tienesCoronaVirus = true; // valor por defecto false

		// enteros

		byte bite = 0;// 1byte = 8 bits
		short corto = 0;// 2 bytes
		int entero = 0;// 4 bytes
		long largo = 0;// 8 bytes

		// reales

		float numeroRea = 0.0f;// por delante escribir (float) o poner una f por detras de la cantidad
		double todaviaMasGrande = 6;// no hace falta poner el tipo

		// caracteres

		char letra = 'a';// se utiliza comillas simples; El inicio es el cero.

		char letraA = 65;// 65 en cod ASCII es A;

		/*
		 * Las variables primitivas siempre comienzan por minusclas y tienen un valor
		 * inicia.
		 */

		/*
		 * wrappers : Ckases que nos ayudan a trabajar con las variables primitivas.
		 * estas empiezan siempre por mayusculas int= Integer<br> boolean: Boolean<br>
		 * char: Character<br> ...<br>
		 * 
		 */
		System.out.println("un int ocupa" + Integer.SIZE);
		System.out.println("valor minimo" + Integer.MIN_VALUE + "valor maximo" + Integer.MAX_VALUE);

		String numeroEnFormatoTexto = "23";
		int numero2 = 2;
		int total = numero2 + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println(numero2 + " +" + numeroEnFormatoTexto + "=" + total);

	}// main

}// clase
