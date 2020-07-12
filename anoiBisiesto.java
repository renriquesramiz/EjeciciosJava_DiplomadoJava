package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class anoiBisiesto {

	// 5) Programa que determine si un año es bisiesto.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el año: ");
		int anio = sc.nextInt();

		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {

			System.out.println(anio + " es un año bisiesto.");
			
			
		}else {
			
			System.out.println(anio + " no es un año bisiesto.");

		}

	}

}
