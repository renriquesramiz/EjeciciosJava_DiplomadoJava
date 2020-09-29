package com.ejerciciosPracticos.diplomadoJava;

public class Combinar {
	
	//Combinar con repeticiones
	
	public double conRepeticion(int n, int r) {
		
		factorial f = new factorial();
		
		double pcR = f.factor(n + r - 1) / (f.factor(r)*f.factor(n-1));
		
		return pcR; 

	}
	
	//Combinar sin repeticiones
	
	public double sinRepeticion(int n, int r) {
		
		factorial f = new factorial();
		
		double psR = f.factor(n) / (f.factor(r)*f.factor(n-r));
				
		return psR;
		
	}

}
