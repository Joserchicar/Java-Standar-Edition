package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Coche;
import com.ipartek.formacion.clases.Vehiculo;

public class vehiculoPruebas {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();

		Vehiculo v2 = new Vehiculo("negro", "4444GPS");

		Vehiculo v3 = new Vehiculo("BLANCO", "1111 XRS", 5);

		System.out.println(v1.toString());
		System.out.println(v2);// no es necesario llamar a toString();
		System.out.println(v3);

		// vamos a pintar el coche

		v1.setColor("rojo");

		// vamos a matricularlo

		v1.setMatricula("1234 FGT");

		System.out.println("despues de pintar y matricular v1");
		System.out.println(v1);

		System.out.println("color" + v1.getColor());
		System.out.println("matricula" + v1.getMatricula());
		System.out.println("numero puertas" + v1.getNumeroPuertas());
		System.out.println("numero ruedas" + v1.getNumeroRuedas());
		System.out.println("Potencia" + v1.getPotencia());

		Coche chinquechento = new Coche();

		chinquechento.setColor("blanco");
		System.out.println(chinquechento);
	}

}
