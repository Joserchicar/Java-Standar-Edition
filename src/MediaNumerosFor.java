import java.util.Scanner;

/**
 * Pedir al usuario la temperatura de los dias de la semana, comenzando por el
 * Lunes mostrar por pantalla la media de la semanay la temperatura mas alta y
 * baja.
 * 
 * @author Curso
 *
 */
public class MediaNumerosFor {

	public static void main(String[] args) {

		final String[] DIAS_SEMANA = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		float temperaturaDia;

		float media = 0f;
		float minima = Float.MAX_VALUE;
		float maxima = Float.MIN_VALUE;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= DIAS_SEMANA.length; i++) {

			String dia = DIAS_SEMANA[i];
			System.out.println("Dime la temperatura del " + dia);

			temperaturaDia = Float.parseFloat(sc.nextLine());
			media += temperaturaDia;
			System.out.println("la temperatura media es" + (media / 7));

			if (minima > temperaturaDia) {
				minima = temperaturaDia;
				System.out.println("la temperatura minima" + minima);
			}
			if (maxima > temperaturaDia) {
				maxima = temperaturaDia;
				System.out.println("la temperatura maxima" + maxima);
			}
		}

	}

}
