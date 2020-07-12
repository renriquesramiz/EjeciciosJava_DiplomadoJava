package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class succesionFibonacci {

	public static void main(String[] args) {
		// 11) Programa que imprima la serie o succesion de numero fibonacci hasta un numero entrado por el usuario.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el numero : ");
		int numero = sc.nextInt();
		
		int a = 0, b = 1;
		int fibo = a + b;
		
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
		System.out.print(" ");
		
		while (fibo <= numero) {
			
			System.out.print(fibo);
			System.out.print(" ");
			
			a = b;
			b = fibo;
			fibo = a + b;
			
		}
		
		
		
		
		

	}

}
