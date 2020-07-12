package com.ejerciciosPracticos.diplomadoJava;

public class factorial {

	public int factor(int d) {

		int fact = 1;
		for (int i = 2; i <= d; i++) {
			fact *= i;
		}
		
		System.out.println(fact);
		return fact;
	}

	
}
