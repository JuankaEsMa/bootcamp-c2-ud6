package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num = sc.nextInt();
		if(isPrimo(num)) {
			System.out.println("El numero " + num + " es primo");
		}else {
			System.out.println("El numero " + num + " no es primo");
		}
	}
	
	public static boolean isPrimo(int num) {
		boolean isPrimo = true;
		boolean end = false;
		int dividendo = 2;
		if(num >= 3) {
			while(!end) {
				if(dividendo <= num/2) {
					if(num % 2 == 0 && num != 0) {
						isPrimo = false;
						end = true;
					}else if(num % dividendo == 0) {
						isPrimo = false;
						end = true;
					}
				}else {
					end = true;
				}
				dividendo++;
			}
		}else {
			isPrimo = false;
		}
		
		return isPrimo;
	}
}
