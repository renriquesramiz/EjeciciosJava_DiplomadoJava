package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class calculoFTrigonometricas {

	public static void main(String[] args) {
		/*
		 * 18) Programa que determine las funciones trigonométricas (Seno, Coseno,
		 * Secante, Cosecante, Tangente y Cotangente), a partir de dos catetos
		 * introducidos por teclado.
		 */

		FuncionesTrigo funcion = new FuncionesTrigo();

		Scanner sc = new Scanner(System.in);

		System.out.println("Que función desea determinar? ");
		System.out.println("1- Seno");
		System.out.println("2- Coseno");
		System.out.println("3- Tangente");
		System.out.println("4- Secante");
		System.out.println("5- Cosecante");
		System.out.println("6- Cotangente");

		System.out.print("Función : ");
		int opcion = sc.nextInt();
		
		
		switch (opcion) {
		case 1:
			System.out.println("\nLa función Seno");
			System.out.print("\nIntroduzca el valor del Cateto Opuesto: ");
			double o = sc.nextDouble();
			System.out.print("Introduzca el valor la Hipotenusa: ");
			double h = sc.nextDouble();
			
			double soh = funcion.seno(o, h);
			
			System.out.println("\nEl Seno es: " + soh);
			
			
			break;

		case 2:
			System.out.println("\nLa función Coseno");
			System.out.print("\nIntroduzca el valor del Cateto Abyacente: ");
			double a = sc.nextDouble();
			System.out.print("Introduzca el valor la Hipotenusa: ");
			h = sc.nextDouble();
			
			double cah = funcion.coseno(a, h);
			
			System.out.println("\nEl Coseno es: " + cah);
			
			break;
		case 3:
			System.out.println("\nLa función Tangente");
			System.out.print("\nIntroduzca el valor del Cateto Opuesto: ");
			o = sc.nextDouble();
			System.out.print("Introduzca el valor del Cateto Abyecente: ");
			a = sc.nextDouble();
			
			double toa = funcion.tangente(o, a);
			
			System.out.println("\nEl Coseno es: " + toa);
			
			break;
		case 4:
			System.out.println("\nLa función Secante");
			System.out.print("\nIntroduzca el valor de la Hipotenusa: ");
			h = sc.nextDouble();
			System.out.print("Introduzca el valor del Cateto Abyecente: ");
			a = sc.nextDouble();
			
			double sha = funcion.secante(h, a);
			
			System.out.println("\nEl Coseno es: " + sha);
			
			break;
		case 5:
			System.out.println("\nLa función Cosecante");
			System.out.print("\nIntroduzca el valor de la Hipotenusa: ");
			h = sc.nextDouble();
			System.out.print("Introduzca el valor del Cateto Opuesto: ");
			o = sc.nextDouble();
			
			double cho = funcion.secante(h, o);
			
			System.out.println("\nEl Coseno es: " + cho);
			
			break;
		case 6:
			System.out.println("\nLa función Cotangente");
			System.out.print("\nIntroduzca el valor del Cateto Abyacente: ");
			a = sc.nextDouble();
			System.out.print("Introduzca el valor del Cateto Opuesto: ");
			o = sc.nextDouble();
			
			double cao = funcion.secante(a, o);
			
			System.out.println("\nEl Coseno es: " + cao);
			
			break;
		default:
			System.out.println("ERROR! Solo puede elegir una de las seis opciones!");
			
			break;
		}

	}

}
