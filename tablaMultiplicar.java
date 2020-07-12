package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class tablaMultiplicar {
	
	// 7) Programa que despliegue la tabla de multiplicar de un numero entrado por teclado y asumiendo que la tabla de multiplicar es hasta el 12.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Cual Tabla desea calcular: ");
		int n = sc.nextInt();
		int cont = 1; 
		
		System.out.println("\nTable de Multiplicar del " + n);
		
		while (cont <= 12) {
			System.out.println(n + " x " + cont + " = " + n*cont);
			cont++;
			
		}
		
		
	}

}
