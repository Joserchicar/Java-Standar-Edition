import java.util.Scanner;

public class PreguntarNombreCompleto {

	public static void main(String[] args) {

		System.out.println("Dime tu nomnbre:");

		Scanner teclado = new Scanner(System.in);

		// preguntar nombre, usar nextLine para leer un String

		String nombre = teclado.nextLine();

		System.out.println("Dime tu primer apellido:");

		String apellido1 = teclado.nextLine();

		System.out.println("Dime tu segundo  apellido:");

		String apellido2 = teclado.nextLine();

		System.out.println("Te llamas " + nombre + " " + apellido1 + " " + apellido2);

		teclado.close();

		// preguntar 1º apellido

		// preguntar 2º apellido

		// mostrar por consola nombre completo

	}

}
