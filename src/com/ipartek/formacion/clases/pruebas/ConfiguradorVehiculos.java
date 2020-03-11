package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Vehiculo;

public class ConfiguradorVehiculos {

	public static void main(String[] args, String muneroPuertas) {

		Scanner sc = new Scanner(System.in);
Vehiculo v9=new Vehiculo();

		String color = v9.setColor();
		String matricula = v9.setMatricula();
		String numeroRuedas = v9.setNumeroRuedas();
		String numeroPuertas=v9 = .setNumeroPuertas();
		float potencia = v9.setPotencia();

		System.out.println(" como quiere que sea su vehiculo?");

		System.out.println(" indiqueme que color prefiere");
		color = sc.nextLine();

		System.out.println("indique la matricula");
		matricula = sc.nextLine();

		System.out.println("indique el numero de ruedas");
		numeroRuedas = sc.nextLine();

		System.out.println("indique el numero de puertas");
		muneroPuertas = sc.nextLine();
		System.out.println("indique la potencia del vehiculo");
		//potencia = sc.nextLine();
		System.out.println("su vehiculo es de color" + color + ", con matricula" + matricula + "con  " + numeroRuedas
				+ "ruedas , con " + muneroPuertas + " puertas y con " + potencia + " CV de potencia");
		
		
		// preguntar por consola como quiere el Vehiculo

		// preguntar color
		// preguntar matricula
		// preguntar puertas y resto de atributos

		// mostrar uno a uno todos los atriibutos por consola

	}

}
