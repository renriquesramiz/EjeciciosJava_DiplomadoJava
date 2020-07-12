package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class sumadeNumeros {

	public static void main(String[] args) {
		// 12) Programa que despliegue la sumatoria de números desde un número inicial
		// hasta uno final indicado por el usuario por teclado.

		Scanner sc = new Scanner(System.in);
		int n1, n2, suma = 0, cont = 0;

		System.out.print("Introduzca el primer numero: ");
		n1 = sc.nextInt();

		System.out.print("Introduzca el ultimo numero: ");
		n2 = sc.nextInt();

		if (n2 < n1) {
			System.out.println("ERRROR: Numero Final debe de ser mayor al numero de Inicio!! ");

		} else {

			for (int i = n1; i <= n2; i++) {

				suma += i;
				cont += 1;
				System.out.println(suma);

			}
			
			System.out.println("\nSe sumaron " + cont + " numeros entre " + n1 + " y " + n2 +".");
			System.out.println("La suma es: " + suma);
			
			
		}

	}

}
