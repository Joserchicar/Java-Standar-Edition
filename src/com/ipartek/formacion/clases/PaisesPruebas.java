package com.ipartek.formacion.clases;

public class PaisesPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear dos objetos de de tipo pais
		// Espa�a cn 120 casos

		// Francia con 300 casos

		// mostrar por consola

		// Declarar un Array con dos paises inicializados a null
		Pais[] paises = new Pais[2];

		Pais espa�a = new Pais();
		Pais francia = new Pais();

		paises[0] = espa�a;
		paises[1] = francia;

		espa�a.setNombre("Espa�a");
		espa�a.setNumeroInfectados(120);
		francia.setNombre("Francia");
		francia.setNumeroInfectados(300);

		System.out.println(espa�a.getNombre() + " tiene una cantidad de " + espa�a.getNumeroInfectados() + " casos");

		System.out.println(francia.getNombre() + " tiene una cantidad de " + francia.getNumeroInfectados() + " casos");

		// mostrar por consola el resultado de la Array

		for (int i = 0; i < paises.length; i++) {
			Pais paisActual = paises[i];
			System.out.println(paisActual.getNombre() + " tiene " + paisActual.getNumeroInfectados() + " casos");

		}

	}

}
