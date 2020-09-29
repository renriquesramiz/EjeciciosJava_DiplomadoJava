package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class TeoremaPitagoras {

	public static void main(String[] args) {
		// 17) Programa que utilizando el teorema de Pitágoras, que determine la longitud del cateto que no fue introducido por teclado
		
		double cOpuesto, cAbyasente, hipo;
		Pitagoras p = new Pitagoras();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cual es la ecuacion que desea resolver: ");
		System.out.println("1 - Hayar la Hipotenusa");
		System.out.println("2 - Hayar el Cateto Opuesto ");
		System.out.println("3 - Hayar el Cateto Abyacente ");
		
		System.out.print("Opcion: ");
		int opcion = sc.nextInt();
		
		
	switch (opcion) {
	case 1:
		System.out.print("Introduzca el Catero Opuesto: ");
		cOpuesto = sc.nextDouble();
		
		System.out.print("Introduzca el Catero Abyacente: ");
		cAbyasente = sc.nextDouble();
		
		System.out.println("La Hipotenusa es: " + p.hipotenusa(cOpuesto, cAbyasente));
		
		
		break;

	case 2:
		System.out.print("Introduzca la Hipotenusa: ");
		hipo = sc.nextDouble();
		
		System.out.print("Introduzca el Catero Abyacente: ");
		cAbyasente = sc.nextDouble();
		
		System.out.println("La Hipotenusa es: " + p.catetoA(hipo, cAbyasente));
		
		break;
		
	case 3:
		System.out.print("Introduzca la Hipotenusa: ");
		hipo = sc.nextDouble();
		
		System.out.print("Introduzca el Catero Opuesto: ");
		cOpuesto = sc.nextDouble();
		
		System.out.println("La Hipotenusa es: " + p.catetoB(hipo, cOpuesto));
		
		break;
		
	default:
		System.out.println("ERROR! Solo puede elegir una de las tres opciones!");
		break;
	}

		
		
		
		

	}

}
