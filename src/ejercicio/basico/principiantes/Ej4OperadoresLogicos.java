package ejercicio.basico.principiantes;

/**
 * @see
 * @author Joserra
 *
 */
public class Ej4OperadoresLogicos {
	public static void main(String[] args) {
// ejercicio1
		boolean x = true;
		boolean y = false;
		boolean z = true;

		System.out.println("(X && Y) || (X && Z) = " + ((x && y) || (x && z)));

		System.out.println("(X || !Y)&& (!X || Z)" + ((x || !y) && (!x || z)));

		System.out.println(" X || Y && Z  " + (x || y && z));

		System.out.println(" !(X || Y) && Z   " + (!(x || y) && z));

		System.out.println(" X || Y || X && !Z && !Y  " + (x || y || x && !z && !y));

		// ejercicio 2

		boolean w = false;
		boolean x1 = true;
		boolean y1 = true;
		boolean z1 = false;

		System.out.println(" W || Y && X && W || Z = " + (w || y1 && x1 && w || z1));

		// ejercicio 3
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
