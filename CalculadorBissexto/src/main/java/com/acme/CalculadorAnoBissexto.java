package com.acme;

// Calculador Bissexto
public class CalculadorAnoBissexto {
	 
	static int INICIO_CALENDARIO_JULIANO = -46;
	public static boolean ehAnoBissexto(int ano) {
		if (ano % 2 != 0) {
			return false;
		}
		if (ano < INICIO_CALENDARIO_JULIANO) {
			return false;
		}
		boolean divisivelPor4 = ano % 4 == 0;
		boolean divisivelPor100 = ano % 100 == 0;
		boolean divisivelPor400 = ano % 400 == 0;
		
		
		if (divisivelPor4 && (!divisivelPor100  || divisivelPor400 )) {
			return true;
		}
		return false;
	}

	
}
