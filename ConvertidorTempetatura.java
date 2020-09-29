package com.ejerciciosPracticos.diplomadoJava;

import java.text.DecimalFormat;
import java.util.Scanner;

class ConvertidorTempetatura {

	public static void main(String[] args) {
		/*  19) Programa que convierta temperaturas de Celsius a 
			Kelvin y Fahrenheit, de Fahrenheit a Celsius y Kelvin, 
			Kelvin a Fahrenheit y Celsius.
		 */
		
		//Capturar las temperaturas
		System.out.println("Qué temperatura desea convertir? ");
		System.out.println("1- Celsius");
		System.out.println("2- Fahrenheit");
		System.out.println("3- Kelvin");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		
		double temp = sc.nextDouble();
		
		double gradoC, gradoF, gradoK;
		
		if(temp == 1) {
			System.out.println("\nCelsius");
			System.out.print("Introduzca el Valor deseado: ");
			gradoC = sc.nextDouble();
			df.format(gradoF = ((gradoC * 9)/5) + 32);
			df.format(gradoK = gradoC + 273.15);
			
			System.out.println(gradoC+" °C = " + gradoF+" °F y " + gradoK+" k");
			
		}else if(temp == 2) {
			System.out.println("\nFahrenheit");
			System.out.print("Introduzca el Valor deseado: ");
			gradoF = sc.nextDouble();
			df.format(gradoC = (gradoF - 32)*5 / 9);
			df.format(gradoK = ((gradoF - 32)*5 / 9) + 273.15);
			
			System.out.println(gradoF+" °F = " + gradoC+" °C y " + gradoK+" k");
			
		}else if(temp == 3) {
			System.out.println("\nKelvin");
			System.out.print("Introduzca el Valor deseado: ");
			gradoK = sc.nextDouble();
			df.format(gradoC = gradoK - 273.15);
			df.format(gradoF = ((gradoK - 273.15)*9 / 5) + 32);
			
			System.out.println(gradoK+" K = " + gradoC + " °C y " + gradoF +" °F");
		
		}else {
			
			System.out.println("ERROR!: Tiene que elegir uno de los grados indicados.");
			
		}
		

	}
	
}

