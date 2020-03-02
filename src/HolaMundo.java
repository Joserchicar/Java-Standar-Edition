/*
 * comentario de bloque. 
 * se puede escribir varias lineas de codigo
 */
/**
 * 
 * @author Curso
 *
 */
public class HolaMundo {

	public static void main(String[] args) {
		// Todo el codigo para ejecutar TIENE QUE ESTAR DENTRO DEL MAIN

		System.out.println("Hola Clase!!");
		/**
		 * String es el tipo de la variable persona : nombre de la variable Joserra:
		 * valor de la variable
		 *
		 */
		// Las clases empiezan en mayuscula y los nombres de las variables en minuscula
		String persona = "Joserra";
		// usamos eloperador "+" para concatenar String o casdenas de texto.
		int edad = 50;
		float altura = 1.78f; // se pone una f por detras o float por delante.
		// float otraAltura = (float) 1.70;
		boolean isgoodDay = false;

		System.out.println("Hello, mi nombre es " + persona);

		System.out.println("Mi edad es " + edad + " años");

		System.out.println("mi altura es " + altura + "cm");

		if (isgoodDay) {

			System.out.println("hoy tengo un día bueno");
		} else {
			System.out.println("Hoy es un dia de mierda");
		}

	}// final metodo main

}// final de la clase
