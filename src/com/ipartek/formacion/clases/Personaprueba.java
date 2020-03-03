package com.ipartek.formacion.clases;

public class Personaprueba {

	public static void main(String[] args) {
		// usamos la palabra new para instanciar o crear objetos
		Persona adam = new Persona();
		Persona eva = new Persona();

		// no podemos acceder.Los atributos están encapsulados
		// adam.nombre = "Adam";
		// adam.edad = 45;

		// el syso hace un ToString() de forma automatica
		System.out.println(adam);
		System.out.println(eva.toString());

		adam.setNombre("Adam");
		adam.setEdad(25);
		System.out.println("mi nombre es " + adam.getNombre() + " y tengo " + adam.getEdad() + " años");
	}

}
