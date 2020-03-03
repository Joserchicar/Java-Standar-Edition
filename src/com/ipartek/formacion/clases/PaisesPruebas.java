package com.ipartek.formacion.clases;

public class PaisesPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear dos objetos de de tipo pais
		// España cn 120 casos

		// Francia con 300 casos

		// mostrar por consola

		// Declarar un Array con dos paises inicializados a null
		Pais[] paises = new Pais[2];

		Pais españa = new Pais();
		Pais francia = new Pais();

		paises[0] = españa;
		paises[1] = francia;

		españa.setNombre("España");
		españa.setNumeroInfectados(120);
		francia.setNombre("Francia");
		francia.setNumeroInfectados(300);

		System.out.println(españa.getNombre() + " tiene una cantidad de " + españa.getNumeroInfectados() + " casos");

		System.out.println(francia.getNombre() + " tiene una cantidad de " + francia.getNumeroInfectados() + " casos");

		// mostrar por consola el resultado de la Array

		for (int i = 0; i < paises.length; i++) {
			Pais paisActual = paises[i];
			System.out.println(paisActual.getNombre() + " tiene " + paisActual.getNumeroInfectados() + " casos");

		}

	}

}
