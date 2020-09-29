package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class factorial {

	public double factor(int d) {

		double fact = 1;

		if (d <= 1) {

			fact = 1;
			//System.out.println(num + "! = " + 1);

		} else {

			//System.out.print(num + "! = ");
			for (int i = d; i != 0; i--) {

				/*
				 * System.out.print(i); if (i != 1) { System.out.print(" x ");
				 * 
				 * } else { System.out.print(" = "); }
				 */

				fact *= i;

			}

			//System.out.print(fact);
		}
		
		return fact;

	}

	
}
