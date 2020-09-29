package com.ejerciciosPracticos.diplomadoJava;

public class FuncionesTrigo {

	public double seno(double opuesto, double hipotenusa) {

		double soh = opuesto / hipotenusa;

		return soh;

	}

	public double coseno(double abyacente, double hipotenusa) {

		double cah = abyacente / hipotenusa;

		return cah;

	}

	public double tangente(double opuesto, double abyacente) {

		double toa = opuesto / abyacente;

		return toa;

	}
	
	public double secante(double hipotenusa, double abyacente) {

		double sha = hipotenusa / abyacente;

		return sha;

	}
	
	public double cosecante(double hipotenusa, double opuesto) {

		double cho = hipotenusa / opuesto;

		return cho;

	}
	
	public double cotangente(double abyacente, double opuesto) {

		double cao = abyacente / opuesto;

		return cao;

	}
		

}
