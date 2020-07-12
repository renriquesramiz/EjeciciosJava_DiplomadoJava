package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class numeroParImpar {

	// 8) Programa que indique si un número es par o impar partiendo de un numero
	// entero entrado por teclado.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero que desea verificar: ");
		int num = sc.nextInt();

		if (num <= 0) {
			
			System.out.println("ERROR: Vuelva a Intentarlo con un numero positivo y mayor que cero!");
			
		} else {

			if (num % 2 == 0) {

				System.out.println("El numero " + num + " es Par");

			} else {

				System.out.println("El numero " + num + " es impar");

			}
		}

	}

}
