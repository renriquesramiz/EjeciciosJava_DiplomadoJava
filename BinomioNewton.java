package com.ejerciciosPracticos.diplomadoJava;

import java.util.Scanner;

public class BinomioNewton {

	public static void main(String[] args) {

		factorial factorial = new factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el Exponente: ");
		int exp = sc.nextInt();

		System.out.println("Ingrese el valor de a:");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese el valor de b:");
		int n2 = sc.nextInt();
		int r = 0, rNum;// almacena el resultado de la formula n!/(n-r)! * r!
		String res = " ", a, b;

		if (exp == 0) {
			
			res = "1";
		} else {

			if (exp == 1) {

				a = (n1==1)? "a":n1 + "a";
				b = (n2==1)? "b":n2 + "b";
				res = a + "+"+b;
				
			} else {

				a = (n1==1)? "":""+(int) Math.pow(n1, exp);
							
				res = a +"a^" + exp;
				for (int i = 1; i < exp; i++) {
					r = (int) (factorial.factor(exp) / (factorial.factor(exp - i) * factorial.factor(i)));
					rNum = (int) (r * Math.pow(n1, exp-i) * Math.pow(n2, i));
					
					if(exp-i == 1) {
						a = "a";
					}else {
						a = "a^"+ (exp-i);
					}
					
					if (i == 1) {
						b = "b";
					}else {
						b = "b^" + i;
					}
				
					
					res += "+" + rNum + a + b;

				}

				b = (n2==1)? "":""+(int) Math.pow(n2, exp);
				res += "+"+ b +"b^" + exp;

			}

		}

		System.out.println(res);

	}

}
