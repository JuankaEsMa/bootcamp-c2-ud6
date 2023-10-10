package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		System.out.println("El factorial de " + num + " es " + calcularFactorial(num));
	}
	
	public static int calcularFactorial(int num) {
		int resultado = num;
		
		for(int i = 1; i < num; i++) {
			resultado = resultado * (num - i);
		}
		
		return resultado;
	}

}
