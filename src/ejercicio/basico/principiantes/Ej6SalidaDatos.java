package ejercicio.basico.principiantes;

public class Ej6SalidaDatos {

	public static void main(String[] args) {
		// Escribe un programa Java que realice lo siguiente: declarar dos variables X e
		// Y de tipo int,
		// dos variables N y M de tipo double y asigna a cada una un valor. A
		// continuación muestra por pantalla:
		// El valor de cada variable.
		// La suma X + Y
		// La diferencia X – Y
		// El producto X * Y
		// El cociente X / Y
		// El resto X % Y
		// La suma N + M
		// La diferencia N – M
		// El producto N * M
		// El cociente N / M
		// El resto N % M
		// La suma X + N
		// El cociente Y / M
		// El resto Y % M
		// El doble de cada variable
		// La suma de todas las variables
		// El producto de todas las variables
		// Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2
		// y a N el valor 4.7
		// se debe mostrar por pantalla:

		int x = 1;
		int y = 2;
		double n = 4.7;
		double m = 3.2;

		System.out.println("La suma  X + Y = " + (x + y));
		System.out.println("La diferencia X – Y = " + (x - y));
		System.out.println("El producto X * Y =" + (x * y));
		System.out.println(" El cociente X / Y= " + (x / y));
		System.out.println("El resto X % Y= " + (x % y));
		System.out.println("La suma N + M =" + (n + m));
		System.out.println("La diferencia N – M = " + (n - m));
		System.out.println("El producto N * M = " + (n * m));
		System.out.println("El cociente N / M = " + (n / m));
		System.out.println("El resto N % M =" + (n % m));
		System.out.println("El doble de cada variable = " + (2 * x) + "," + (2 * y) + "," + (2 * n) + "," + (2 * m));
		System.out.println("La suma de todas las variables = " + (x + y + n + m));
		System.out.println("El producto de todas las variables= " + (x * y * n * m));
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
