package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class VelocidadTiempoDistancia {

	// 6) Programa que Calcule Velocidad, Tiempo y Distancia.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qué desea calcular?");
		System.out.println("1- Calcular la Velocidad");
		System.out.println("2- Calcular la Distancia");
		System.out.println("3- Calcular el Tiempo");

		System.out.print("\nOpcion : ");
		int opcion = sc.nextInt();
		
		calcularVTD calcular = new calcularVTD();

		switch (opcion) {
		case 1:
			System.out.println("\nHa seleccionado calcular la Velocidad.");
			System.out.print("Introduzca la Distancia recorrida: (km): ");
			double dist = sc.nextDouble();
			System.out.print("Introduzca el tiempo estimado (horas): ");
			double tiem = sc.nextDouble();
			
			System.out.print("La velocidad a la que viajaba es de " + calcular.velocidad(dist, tiem) + " km/h");
			
			break;

		case 2:
			System.out.println("\nHa seleccionado calcular la Distancia.");
			System.out.print("Introduzca la velocidad a la que viajaba: (km/h): ");
			double velo = sc.nextDouble();
			System.out.print("Introduzca el tiempo estimado (horas): ");
			double tiem1 = sc.nextDouble();
			
			System.out.print("La distancia recorrida es de " + calcular.distancia(velo, tiem1) + " km");
			

			break;
			
		case 3:
			
			System.out.println("\nHa seleccionado calcular el Tiempo.");
			System.out.print("Introduzca la Distancia recorrida: (km): ");
			double dist1 = sc.nextDouble();
			System.out.print("Introduzca la velocidad a la que viajaba: (km/h): ");
			double velo1 = sc.nextDouble();
			
			System.out.print("\nLa distancia recorrida es de " + calcular.tiempo(dist1, velo1) + " horas");

			break;
		
		default:
			System.out.println("ERROR! Debe de introducir un numero comprendido entre 1 y 3");
			break;
		}

	}

}
