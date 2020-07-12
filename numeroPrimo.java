package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class numeroPrimo {

	public static void main(String[] args) {
		// 10) Programa que indique si un número es primo partiendo de un numero entero
		// entrado por teclado.

		int divisor = 2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el numero que desea verificar: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " no es primo, ya que es un numero par. ");

		} else {

			while (numero > 1 && divisor <= numero && numero % divisor != 0) {

				divisor += 1;

				System.out.println(divisor);

			}

			if (divisor == numero) {

				System.out.println("\nEl " + numero + " es primo.");
			} else {
				System.out.println("\nEl " + numero + " no es primo.");

			}

		}
	}

}
