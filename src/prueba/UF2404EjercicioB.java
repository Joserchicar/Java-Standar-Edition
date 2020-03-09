package prueba;

import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones:
 * <ol>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ol>
 * 
 * 
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @author José Ramón Chica Ramírez
 *
 */
public class UF2404EjercicioB {

	public static void main(String[] args) {

		// Abrir scanner
		int opcion = 0;
		boolean continuar = true;
		boolean seguir = true;
		int dni = 0;
		Scanner sc = new Scanner(System.in);

		do {

			// pintar menu

			System.out.println("**************************************");
			System.out.println("*1.- Calcular la letra del dni       *");
			System.out.println("*2.- Calcular medida de cm a pulgadas*");
			System.out.println("*3.- Salir                           *");
			System.out.println("**************************************");
			// pedir unas opcion al usuario por pantalla

			System.out.println(" Introduzca una opción del 1 al 3, por favor.");

			try {

				opcion = Integer.parseInt(sc.nextLine());
				seguir = false;
			} catch (Exception e) {
				System.out.println(" Las opciones validas son: 1,2,3");
			}

			// switch case
			switch (opcion) {

			case 1:

				// calculo de la letra del DNI

				System.out.println("Calcular la letra del dni ");
				// Obtencion del DNI
				System.out.println("Introduzca los 8 digitos del DNI");
				String linea = sc.nextLine();
				dni = Integer.parseInt(linea);
				// calculo de la Letra correspondiente
				char caracteres[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
						'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
				int resto = dni % 23;

				System.out.println("La letra correspondiente al DNI " + dni + " es la letra " + caracteres[resto]);

				break;
			case 2:
				System.out.println("Calcular medida de cm a pulgadas ");
				// obtencion de las pulgadas
				System.out.println("introduzca la cantidad de centimetros");
				String cantidad = sc.nextLine();
				double centimetro = Double.parseDouble(cantidad);
				// calculo del cambio a cm
				double resultado = centimetro / 2.54;
				System.out.println(centimetro + " centimetros son " + resultado + " pulgadas");
				break;

			case 3:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Por favor, introduzca una opcion valida");
				break;
			}// finSwitch

		} // findo
		while (continuar);

		// cerrar scanner
		sc.close();

	}// fin main

}// fin class
