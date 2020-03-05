package repaso;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temperaturas = new int[7];
		int temperatura = 0;
		int minima = Integer.MAX_VALUE;
		int maxima = Integer.MIN_VALUE;
		temperaturas[0] = 15;
		temperaturas[1] = 12;
		temperaturas[2] = 15;
		temperaturas[3] = 15;
		temperaturas[4] = 14;
		temperaturas[5] = 25;
		temperaturas[6] = 17;

		for (int i = 0; i < temperaturas.length; i++) {

			temperatura = temperatura + temperaturas[i];// temperatura+=temperaturas[i];

			// Temperatura minima

			if (temperaturas[i] < minima) {
				minima = temperaturas[i];
			} // if

			// Temperatura maxima
			if (temperaturas[i] > maxima) {
				maxima = temperaturas[i];

			} // if

			// media

		} // For
		double media = temperatura / temperaturas.length;

		System.out.println(media);
		System.out.println("la temperatura minima" + minima);
		System.out.println("la temperatura maxima" + maxima);

	}// main

}// class
