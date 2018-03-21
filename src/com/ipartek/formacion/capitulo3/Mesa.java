//1.definicion package
package com.ipartek.formacion.capitulo3;

//2. Imports => ahora mismo no tenemos ninguno

//3. definicion Clase
/**
 * 
 * @author ur00
 *
 */
public class Mesa {

	/**
	 * precio en �
	 */
	public static final int PRECIO_PATA = 1;
	public static final int PRECIO_M2 = 5;
	public static final int PRECIO_MATERIAL_MADERA = 4;
	public static final int PRECIO_MATERIAL_ACERO = 6;
	public static final int PRECIO_MATERIAL_ALUMINIO = 5;
	public static final int PRECIO_MATERIAL_PLASTICO = 2;
	public static final int PRECIO_COLOR_CUSTOM = 23;
	public static final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	public static final int MATERIAL_MADERA = 1;
	public static final int MATERIAL_ACERO = 2;
	public static final int MATERIAL_ALUMINIO = 3;
	public static final int MATERIAL_PLASTICO = 4;

	// 4. Atributos siempre PRIVATE para mantener la encapsulacion
	private int numeroPatas;
	private int dimension; // metros cuadrados
	private String color;
	private int material;

	public Mesa() {

		// llamar siempre a super
		super();

		// inicializar los atributos
		this.numeroPatas = 4;
		this.dimension = 1;
		this.color = "blanco";
		this.material = MATERIAL_MADERA;

	}

	public Mesa(int material) {
		this(); // llamar siempre al constructor por defecto
		this.material = material;
	}

	public Mesa(int material, int dimension) {
		this(material);
		this.dimension = dimension;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	/**
	 * Si numeroPatas < 0 asignamos valor 1, else numeroPatas
	 * 
	 * @param numeroPatas
	 *            int
	 */
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas <= 0) ? 1 : numeroPatas;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + ", dimension=" + dimension + ", color=" + color + ", material="
				+ material + "]";
	}

	/**
	 * Calculamos el precio de la mesa en funcion de los materiales usados.
	 * 
	 * @see consultar todas las constantes definidas para los precios
	 * @return int precio en �
	 */
	public int getPrecio() {

		int resul = 0;

		return resul;
	}

}
