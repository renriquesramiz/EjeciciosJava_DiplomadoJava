package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class primerEjercicio {

	// 1) Programa que sume dos números entrados por teclado.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, suma;

		System.out.println("Introduzca el primer numero entero que va ha sumar: ");
		a = sc.nextInt();
		
		System.out.println("\n");
		System.out.println("Introduzca el segundo numero entero que va ha sumar: ");
		
		b = sc.nextInt();

		suma = a + b;

		System.out.println("\n");
		System.out.println("La suma de " + a + " + " + b + " es: " + suma);

	}

}
