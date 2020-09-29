
package com.ejerciciosPracticos.diplomadoJava;

public class Pitagoras {
	
	
	public double hipotenusa (double a, double b) {
		
		double result = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
		
		return result;		
		
	}

	
	public double catetoA (double h, double b) {
		
		double result = Math.sqrt(Math.pow(h,2) - Math.pow(b, 2));
		
		return result;
		
	}
	
	
	public double catetoB(double h, double a) {
		
		double result = Math.sqrt(Math.pow(h,2) - Math.pow(a, 2));
		
		return result;
		
	}
	
	
	
}
