package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNumeros = new int[10];
		rellenarArray(arrayNumeros);
		mostrarArray(arrayNumeros);
	}

	public static void mostrarArray(int[]array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice: " + i);
			System.out.println("Valor: " + array[i]);
			System.out.println();
		}
	}
	
	public static void rellenarArray(int[]array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escriba un numero para rellenar la array: ");
			array[i] = sc.nextInt();
		}
	}
}
