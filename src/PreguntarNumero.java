import java.util.Scanner;

public class PreguntarNumero {

	public static void main(String[] args) {

		System.out.println("dime un numero");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();

		System.out.println(" Has escrito " + numero);

		teclado.close();// cierra teclado

		if (numero == 0) {
			System.out.println("el cero no es ni par ni ipar");

		} else if (numero % 2 == 0) {
			System.out.println(" el numero" + numero + " es par");

		} else {
			System.out.println(" el numero" + numero + " es impar");

		}

		// es par o impar

	}

}
