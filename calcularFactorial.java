package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class calcularFactorial {

	public static void main(String[] args) {

		// 13) Programa que despliegue la factorial de un número.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero: \n");
		int num = sc.nextInt();
		double fact = 1;

		if (num <= 1) {

			System.out.println(num + "! = " + 1);

		} else {

			System.out.print(num + "! = ");
			for (int i = num; i != 0; i--) {

				System.out.print(i);
				if (i != 1) {
					System.out.print(" x ");

				} else {
					System.out.print(" = ");
				}

				fact *= i;

			}

			System.out.print(fact);
		}

	}
}