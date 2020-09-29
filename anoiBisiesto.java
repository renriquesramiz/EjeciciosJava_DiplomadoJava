package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class anoiBisiesto {

	// 5) Programa que determine si un año es bisiesto.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el año: ");
		int A = sc.nextInt();

		if ((A % 4 == 0 && A % 100 != 0) || (A % 100 == 0 && A % 400 == 0)) {

			System.out.println(A + " es un año bisiesto.");
			
			
		}else {
			
			System.out.println(A + " no es un año bisiesto.");

		}
		

	}

}
