
public class PruebaTecnica {

	public static void main(String[] args) {
		System.out.println("prueba tecnica");

		for (int i = 0; i < 5; i++) {

			System.out.println("-esta es la iteracion numero" + i);

			if (i == 0) {
				System.out.println(" El cero es Cero");
			} else {
				if (i % 2 == 0) {
					System.out.println(i + " Es par");

				} else {
					System.out.println(i + " Es Impar");
				}
			} // 1er if

		} // for
		System.out.println("-Terminamos el bucle");
	}// main

}// class
