package com.ejerciciosPracticos.diplomadoJava;

public class tablasMultiplicar2 {

	public static void main(String[] args) {
		// las tablas desde el 1 hasta el 12
		
		for (int i = 1; i <= 12; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j <= 12; j++) {
				
				System.out.println(i + " x " + j + " = " + i*j);
				
			}
			System.out.println("");

			
		}

	}

}
