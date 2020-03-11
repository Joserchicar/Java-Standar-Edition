package com.ipartek.formacion.clases;

/**
 * ejemplo de herencia
 * 
 * @see Vehiculo
 * @author Curso
 *
 */
public class Coche extends Vehiculo {

	private boolean radio;

	public Coche() {
		super();
		// cambiar en vehiculo a "protected2 para que sea visible
		setNumeroPuertas(5);
		setNumeroRuedas(4);

		this.radio = false;

	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() + " de Coche [radio=" + radio + "]";
	}

}
