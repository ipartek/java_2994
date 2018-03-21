package com.ipartek.formacion.capitulo2;

import com.ipartek.formacion.capitulo3.Mesa;

public class HelloWorld {

	public static void main(String[] args) {
		String saludo = "Hola Mundo";
		System.out.println(saludo);

		Mesa mDefecto = new Mesa();

		Mesa m1 = new Mesa(Mesa.MATERIAL_ALUMINIO, 2);
		Mesa m2 = new Mesa(Mesa.MATERIAL_MADERA, 4);

		System.out.println(m1.toString());
		System.out.println("Precio = " + m1.getPrecio() + " €");
	}

}
