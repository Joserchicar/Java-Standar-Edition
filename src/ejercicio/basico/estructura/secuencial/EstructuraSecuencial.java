package ejercicio.basico.estructura.secuencial;

import java.util.Scanner;

public class EstructuraSecuencial {

	public static void main(String[] args) {

// ejercicio 3
		{
			// declaraci�n de variables
			int n1, n2;
			Scanner sc = new Scanner(System.in);
			// leer el primer n�mero
			System.out.println("Introduce un n�mero entero: ");
			n1 = sc.nextInt(); // lee un entero por teclado
			// leer el segundo n�mero
			System.out.println("Introduce otro n�mero entero: ");
			n2 = sc.nextInt(); // lee un entero por teclado
			// mostrar resultado
			System.out.println("Ha introducido los n�meros: " + n1 + " y " + n2);

		}

		{ // Ejercicio 12:
			// Programa Java que lea un n�mero entero N de 5 cifras y muestre sus cifras
			// igual
			// que en el ejemplo.
			// Por ejemplo para un n�mero N = 12345 La salida debe ser:

			Scanner sc = new Scanner(System.in);
			int n;
			System.out.print("Introduzca valor de n: ");
			n = sc.nextInt(); // supondremos que el n�mero introducido tiene 5 cifras

			System.out.println(n / 10000);
			System.out.println(n / 1000);
			System.out.println(n / 100);
			System.out.println(n / 10);
			System.out.println(n / 1);
		}

	}
}
