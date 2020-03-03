import java.util.Scanner;

import com.ipartek.formacion.clases.Pais;

public class PaisesCoronaVirusConObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declarar un Array con 3 paises inicializados con NULL
		Pais[] paises = new Pais[3];

		// crear tres objetos de tipo Pais
		Pais p = new Pais();
		p.setNombre("España");
		p.setNumeroInfectados(100);
		paises[0] = p;

		p = new Pais();
		p = new Pais();
		p.setNombre("Andorra");
		p.setNumeroInfectados(0);
		paises[1] = p;

		// Francia con 300 casos
		p = new Pais();
		p = new Pais();
		p.setNombre("Francia");
		p.setNumeroInfectados(300);
		paises[2] = p;

		Scanner sc = new Scanner(System.in);

// Preguntar si existe algun caso de coronavirus
		for (int i = 0; i < 3; i++) {
			System.out.println(" el pais " + p.getNombre() + "tene" + p.getNumeroInfectados() + "casos");

			// System.out.println("el pais" + p2.getNombre() + "tiene" +
			// p2.getNumeroInfectados() + "casos");
			// System.out.println("el pais" + p3.getNombre() + "tiene" +
			// p3.getNumeroInfectados() + "casos");
			// String pregunta1 = sc.nextLine();

			// if ("si".equalsIgnoreCase(pregunta1)) {

			// System.out.println("¿Cuantos casos?");
			// int pregunta2 = Integer.parseInt(sc.nextLine());
			// total += pregunta2;

			// actualizar arrays
			// paisesInfectados[i] = true;
			// numeroInfectados[i] = pregunta2;

		}

	}

}
