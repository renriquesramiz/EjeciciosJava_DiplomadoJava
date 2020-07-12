package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class cuartoEjercicio {

	// 4) Programa que imprima una succesion de numero desde un numero inicial hasta
	// el un numero final indicado por el usuario.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nInicio, nFinal;

		System.out.print("Introduzca el numero de inicio: ");
		nInicio = sc.nextInt();

		System.out.print("Introduzca el numero final: ");
		nFinal = sc.nextInt();

		if (nFinal < nInicio) {
			System.out.println("ERRROR: Numero Final debe de ser mayor al numero de Inicio!! ");

		} else {

			System.out.println("\nConteo de Numeros ");

			for (int i = nInicio; i <= nFinal; i++) {

				System.out.println(i);

			}

		}

	}
}
