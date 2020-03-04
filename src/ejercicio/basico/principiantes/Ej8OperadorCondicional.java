package ejercicio.basico.principiantes;

/**
 * Se utiliza
 * 
 * @author Curso
 *
 */
public class Ej8OperadorCondicional {

	public static void main(String[] args) {

		// Escribe un programa java que declare una variable A de tipo entero y asígnale
		// un valor.
		// A continuación muestra un mensaje indicando si A es par o impar. Utiliza el
		// operador condicional ( ? : ) dentro del println para resolverlo.
		// Si por ejemplo A = 14 la salida será
		// 14 es par
		// Si fuese por ejemplo A = 15 la salida será:
		// 15 es impar

		int a = 27;
		System.out.println(a + (a % 2 == 0 ? " es par " : " es impar "));

		// Escribe un programa java que declare una variable B de tipo entero y asígnale
		// un valor.
		// A continuación muestra un mensaje indicando si el valor de B es positivo o
		// negativo.
		// Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : )
		// dentro del println
		// para resolverlo.
		// Si por ejemplo B = 1 la salida será
		// 1 es positivo
		// Si fuese por ejemplo B = -1 la salida será:
		// -1 es negativo

		int b = 0;

		System.out.println(b + (b >= 0 ? "es positivo" : "es negativo"));

		// Escribe un programa java que declare una variable C de tipo entero y asígnale
		// un valor.
		// A continuación muestra un mensaje indicando si el valor de C es positivo o
		// negativo,
		// si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o
		// menor que 100.
		// Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : )
		// dentro del println
		// para resolverlo.
		// Si por ejemplo C = 55 la salida será
		// 55 es positivo
		// 55 es impar
		// 55 es múltiplo de 5
		// 55 no es múltiplo de 10
		// 55 es menor que 100

		int c = 55;
		System.out.println(c + (c >= 0 ? " es positivo" : "es negativo") + "," + (c % 2 == 0 ? " es par" : " es impar")
				+ "," + (c % 5 == 0 ? " es multiplo de 5" : " no es multiplo de 5") + ","
				+ (c % 10 == 0 ? " es multiplo de 10" : " no es multiplo de 10 ") + ","
				+ (c < 100 ? " es menor que 100" : " es mayor que 100"));

		{ // ejercicio 9 Condicionales

			{// Ejercicio 1

				int i = 8, j = 5, k;
				float x = 0.005F, y = -0.01F, z;
				char d, e = 'p', f = 'q';

				// a) k = (j == 5) ? i : j;

				System.out.println("k=" + (j == 5 ? i : j));

				// b) k = (j > 5) ? i : j;

				System.out.println("k = " + (j > 5 ? i : j));

				// c) z = (x >= 0) ? x : 0;

				System.out.println("z =" + (x >= 0 ? x : 0));
				// d) z = (y >= 0) ? y : 0;

				System.out.println("z = " + (y >= 0 ? y : 0));
				// e) d = (e < f) ? e : f;

				System.out.println("d =" + (e < f ? e : f));

				// f) k = (j > 0) ? j : 0;

				System.out.println("k= " + (j > 0 ? j : 0));

				// g) k = (i > 0 && j > 0) ? 0 : 1;

				System.out.println("k= " + ((i > 0 && j > 0) ? 0 : 1));

				// h) k = (y > 0 || x > 0) ? i+1 : i-1;

				System.out.println("k= " + ((y > 0 || x > 0) ? i + 1 : i - 1));
				// i) d = (e < 'f') ? e : f;

				System.out.println("d=" + (e < 'f' ? e : f));

				// j) d = (e >= f) ? e : 'r';
				System.out.println("d=" + (e >= f ? e : 'r'));

			} // ejercicio9-1

			// ejercicio 2

			{

				int i = 1, j = 1, k = 1, x;

				// a) x = (j >= 0 && k > 1) ? ++j : k+1;

				System.out.println("x= " + ((j >= 0 && k > 1) ? ++j : k + 1));

				// b) x = (j > 1 || k >= 1) ? j+3 : k+1;

				System.out.println("x= " + ((j > 1 || k >= 1) ? j + 3 : k + 1));

				// c) x = (j >= 1 && i <= 1) ? 10 : 20;
				System.out.println("x= " + ((j >= 1 && i <= 1) ? 10 : 20));
				// d) x = (i + j > 2 || k < 1) ? 2 : 4;
				System.out.println("x= " + (((i + j > 2) || k < 1) ? 2 : 4));
				// e) x = (3 / 2 > i) ? j+5 : k;
				System.out.println("x= " + (((3 / 2) > i) ? j + 5 : k));

				// f) x = (3 % 2 > i) ? j++ : ++k;
				System.out.println("x= " + (((3 % 2) > i) ? j++ : ++k));
				// g) x = (i + 10 <= j + 10 || k == 0) ? -1 : -2;
				System.out.println("x= " + (((i + 10 <= j + 10) || k == 0) ? -1 : -2));

				// h) x = (i == 0 || j == 1 || k == 2) ? 0 : 5;
				System.out.println("x= " + ((i == 0 || j == 1 || k == 2) ? 0 : 5));
				// i) x = (i == 0 || j == 1 && k == 2) ? 0 : 5;
				System.out.println("x= " + ((i == 0 || j == 1 && k == 2) ? 0 : 5));

				// j) x = (i != 0 || j == 1 && k == 2) ? 0 : 5;
				System.out.println("x= " + ((i != 0 || j == 1 && k == 2) ? 0 : 5));

			} // Fin ejerccio 9-2
		} // ejercicio 9

	}

}
