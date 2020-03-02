import java.util.Scanner;

public class PaisesCoronavirus {

	public static void main(String[] args) {

		/**
		 * recorrer paises y preguntar si existe algun caso de Coronavirus. En caso
		 * afirmativo, preguntar numero de infectados. finalmente, mostrar paises libres
		 * de Coronavirus mostrar paises infectados junto con su numero de casos total
		 * numero de personas infectadas.
		 * 
		 */

		final String[] PAISES = { "Noruega", "Alemania", " republica checa", "Italia" };
		boolean[] paisesInfectados = { false, true, false, true };
		int[] numeroInfectados = { 0, 10, 0, 5 };
		paisesInfectados[1] = true;
		numeroInfectados[1] = 5;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < PAISES.length; i++) {
			if (paisesInfectados[i] == true) {
				System.out.println(PAISES[i] + " esta infectado");
				//System.out.println("Cuantos infectados hay?");

				//numeroInfectados[i] = sc.nextInt();
				System.out.println("Hay " + numeroInfectados[i]+ "  infectados");
				
			}

		} // cierre for i

		for (int j = 0; j < PAISES.length; j++) {

			if (paisesInfectados[j] == false) {

				System.out.println("Los paises libres son " + PAISES[j]);

			}
		}
	}
}
