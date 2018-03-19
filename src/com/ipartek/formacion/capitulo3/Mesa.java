//1.definicion package
package com.ipartek.formacion.capitulo3;

//2. Imports => ahora mismo no tenemos ninguno

//3. definicion Clase
public class Mesa {

	// precio en €
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERA = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;

	// 4. Atributos siempre PRIVATE para mantener la encapsulacion
	private int numeroPatas;
	private int dimension; // metros cuadrados
	private String color;
	private int material;

	/*
	 * 5 Metodos 5.1 Constructores 5.2 Getters & Setters 5.3 Otros
	 */
	public Mesa() {
		super();
		this.numeroPatas = 4;
	}

	/**
	 * Sirve para documentar con JavaDoc
	 * 
	 * @author Ander Uraga Real
	 * @param numeroPatas
	 *            int en caso de ser nagativo se incializa con 0
	 */
	public Mesa(int numeroPatas) {
		super();
		// this.numeroPatas = numeroPatas;
		this.setNumeroPatas(numeroPatas);
	}

	public int getNumeroPatas() {
		return this.numeroPatas;
	}

	/**
	 * Cambia el numero de patas
	 * 
	 * @param numeroPatas
	 */
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	public int getPRecio() {
		return 0;
	}

}
