import java.util.Scanner;

/**
 * Ejercicio para pedir 3 numeros por pantalla y pedir la media
 * 
 * @author Curso
 *
 */
public class MediaNumeros {

	public static void main(String[] args) {

		int num1, num2, num3;
		float media;

		Scanner sc = new Scanner(System.in);

		System.out.println("introduce un numero");

		num1 = Integer.parseInt(sc.nextLine());

		System.out.println("introduce el segundo");

		num2 = Integer.parseInt(sc.nextLine());

		System.out.println("introduce el tercer numero");

		num3 = Integer.parseInt(sc.nextLine());

		media = (num1 + num2 + num3) / 3.0f;
		System.out.println(media);

		sc.close();

	}

}
