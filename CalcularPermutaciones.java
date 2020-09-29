package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class CalcularPermutaciones {

	public static void main(String[] args) {
		/*
		  15) Programa que utilizando análisis combinatorio indique la cantidad de
		  Permutaciones posibles con una X cantidad de elementos y cantidad de los
		  grupos, ambos datos deben ser introducidos por teclados, además indicando si
		  permiten o no repeticiones.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el valor de n: ");
		int n = sc.nextInt();
		
		System.out.print("Introduzca el valor de r: ");
		int r = sc.nextInt();
		
		System.out.println("Como desea calcular las Permutaciones? ");
		System.out.println("1 - Con Repeticiones.");
		System.out.println("2 - Sin Repeticiones.");
		
		System.out.print("\nOpcion: ");
		int opcion = sc.nextInt();
		
		Permutar p = new Permutar();
		
		if (opcion == 1) {
			System.out.print("\nLas permutaciones con repeticiones son: ");
			System.out.print(p.conRepeticion(n, r) + " permutaciones");
			
		}else if (opcion == 2) {
			System.out.print("\nLas permutaciones sin repeticiones son: ");
			System.out.print(p.sinRepeticion(n, r) + " permutaciones");
			
		}
		
		
		
	}

}
