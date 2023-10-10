package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arrayNumeros;
		int min;
		int max;

		System.out.println("Escribe el numero de posiciones que quieres que tenga tu array");
		arrayNumeros = new int [sc.nextInt()];
		System.out.println("Indica el número mínimo de los valores");
		min = sc.nextInt();
		System.out.println("Indica el número máximo de los valores");
		max = sc.nextInt();
		rellenarArrayEntreNumsPrimos(arrayNumeros, min, max);
		mostrarArray(arrayNumeros);
	}
	
	public static void rellenarArrayEntreNumsPrimos(int[]array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			int num;
			do {
				num = (int)(Math.random()*(max+1-min)) + min;
			}while(!isPrimo(num));
			array[i] = num;
		}
	}
	
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
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
