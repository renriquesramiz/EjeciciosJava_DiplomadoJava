package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class promedioEstudiante {

	public static void main(String[] args) {
		/*
		  20) Programa que determine la calificación promedio de un estudiante
		  partiendo de un listado de calificaciones introducidos por el usuario y
		  determine si esta aprobado o reprobado, indicando el literal que corresponde.
		 */
		Scanner sc = new Scanner(System.in);
		int cant, sumaNotas=0, n, c, sumaCredito=0, totalpunto=0;
		double promedio=0, indice=0;
		String literal;
		
		System.out.print("Cuantas notas desea calcular? ");
		cant = sc.nextInt();
		
		System.out.println("Introduzca las notas y los creditos de las asignaturas:");
		for(int i = 1; i<=cant; i++) {
			
			System.out.print("Nota "+ i + ": ");
			n=sc.nextInt();
			System.out.print("credito " + i + ": ");
			c=sc.nextInt();
			System.out.println(" ");
			sumaNotas +=n;
			sumaCredito +=c;
			
			if(n<70) {
				totalpunto += c*1;
			}else if(n >= 70 && n <= 79) {
				totalpunto += c*2;
			}else if(n >= 80 && n <= 89) {
				totalpunto += c*3;
			}else {
				totalpunto += c*4;
			}
			
			
			
		}
		
		promedio = sumaNotas / cant;
		
		if(promedio < 70) {
			literal = "F";
			indice = (double) totalpunto / sumaCredito;
			System.out.println("CREDITOS: " + sumaCredito+ " Puntos: " + totalpunto);
			System.out.println("\nEL promedio es: " + promedio + " REPROBADO = " + literal + " y el Indice acumulado es: " + indice);
			
		}else if(promedio >= 70 && promedio <= 79) {
			literal = "C";
			indice = (double) totalpunto / sumaCredito;
			System.out.println("CREDITOS: " + sumaCredito+ " Puntos: " + totalpunto);
			System.out.println("\nEL promedio es: " + promedio + " APROBADO = " + literal + " Regular, y el Indice acumulado es: "+ indice);
						
		}else if(promedio >= 80 && promedio <= 89) {
			literal = "B";
			indice = (double) totalpunto / sumaCredito;
			System.out.println("CREDITOS: " + sumaCredito+ " Puntos: " + totalpunto);
			System.out.println("\nEL promedio es: " + promedio + " APROBADO = " + literal + " Bueno, y el Indice acumulado es: "+ indice);
			
		}else {
			literal = "A";
			indice = (double) totalpunto / sumaCredito;
			System.out.println("CREDITOS: " + sumaCredito + " Puntos: " + totalpunto);
			System.out.println("\nEL promedio es: " + promedio + " APROBADO = " + literal + " Excelente y el Indice acumulado es: "+ indice);
			
		}
		
		
		
		
		
	}

}
