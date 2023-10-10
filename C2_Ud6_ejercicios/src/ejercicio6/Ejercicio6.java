package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isPositive = false;
		int num = 0;
		do {
			System.out.println("Escribe un número positivo: ");
			num = sc.nextInt();	
			if(num >= 0) {
				isPositive = true;
			}
		}while(!isPositive);
		System.out.println(calcularCifras(num));
	}
	
	public static int calcularCifras(int num) {
		int resultado = 0;
		for(int i = num; i > 0; i = i/10) {
			resultado++;
		}
		return resultado;
	}

}
