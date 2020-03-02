import java.util.Scanner;

/**
 * Ejercicio para pedir 3 numeros por pantalla y pedir la media
 * 
 * @author Curso
 *
 */
public class MediaNumerosBucle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean terminar = true;
		float numero, total = 0;
		float contador = 0;

		do {
			System.out.println("dime un numero");
			numero = Float.parseFloat(sc.nextLine());
			// total = total + numero;
			total += numero;

// preguntar si quiere terminar
			System.out.println("quieres terminar? Escribe SI");

			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {
				terminar = false;

			}
// contador=contador +1
			contador++;
		} while (terminar);

		System.out.println("El total es " + total);
		System.out.println("Lamedia es " + (total / contador));

		sc.close();

	}

}
