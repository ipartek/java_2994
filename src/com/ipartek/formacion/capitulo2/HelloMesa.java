package com.ipartek.formacion.capitulo2;

import java.util.Scanner;

public class HelloMesa {
	// variables globales de la Clase
	private static int patas;
	private static String color;

	public static void main(String[] args) {

		System.out.println("Configurador de Mesas");
		System.out.println("---------------------------------");

		pedirDatos();
		imprimirTicket();

	}

	private static void pedirDatos() {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿ Numero de Patas ?");
		patas = sc.nextInt();

		System.out.println("¿ Color ?");
		color = sc.next();

	}

	private static void imprimirTicket() {
		System.out.println("---------------------------------");
		System.out.println("---- RESUMEN     ----------------");
		System.out.println("---------------------------------");
		System.out.println("Nº Patas: " + patas);
		System.out.println("color: " + color);
		System.out.println("---------------------------------");
		System.out.println("Precio                        12€");
		System.out.println("---------------------------------");
	}
}
