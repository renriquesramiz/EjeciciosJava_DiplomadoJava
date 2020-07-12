package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class numerosPares {

//    9) Programa que imprima los numeros par de una succision de numeros partiendo desde un numeros inicial hasta un numero final, ambos inidicados por el usuario.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2;

		System.out.print("Introduzca el primer numero: ");
		n1 = sc.nextInt();

		System.out.print("Introduzca el segundo numero: ");
		n2 = sc.nextInt();

		if (n2 < n1) {
			System.out.println("ERRROR: Numero Final debe de ser mayor al numero de Inicio!! ");

		} else {

			System.out.println("\nLos numeros pares entre " + n1 + " y " + n2 + " son: ");

			for (int i = n1; i <= n2; i++) {

				if (i % 2 == 0) {
					System.out.println(i);
				}

			}

		}

		
		
	}

}
