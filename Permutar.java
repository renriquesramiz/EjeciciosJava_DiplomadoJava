package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class Permutar {
	
	//Permutar con repeticion
	
	public int conRepeticion(int n, int r) {
	
		int pcR = (int) Math.pow(n, r);
		
		return pcR; 

	}
	
	//Permutar sin repeticion
	
	public double sinRepeticion(int n, int r) {
		
		factorial f = new factorial();
		
		double psR = f.factor(n) / f.factor(n-r);
				
		return psR;
		
	}
	
}
