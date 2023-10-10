package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNumeros;
		final int max = 9;
		final int min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero de posiciones que quieres que tenga tu array");
		arrayNumeros = new int [sc.nextInt()];
		rellenarArrayEntreNums(arrayNumeros, min, max);
		mostrarArray(arrayNumeros);
	}

	public static void rellenarArrayEntreNums(int[]array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*(max+1-min)) + min;
		}
	}
	
	public static void mostrarArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			suma = suma + array[i];
		}
		System.out.println("La suma de todos los números es " + suma);
	}
}
