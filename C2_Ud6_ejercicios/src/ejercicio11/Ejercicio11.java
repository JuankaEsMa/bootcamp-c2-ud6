package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1;
		int[] array2;
		int[] arrayMultiplicado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la dimensión del primer array: ");
		array1 = new int[sc.nextInt()];
		System.out.println("Dime la dimensión del segundo array: ");
		array2 = new int[sc.nextInt()];
		rellenarArrayEntreNums(array1);
		array2 = array1;
		rellenarArrayEntreNums(array2);
		arrayMultiplicado = multiplicacionDeArrays(array1,array2);
		
		System.out.println("Array 1");
		mostrarArray(array1);
		System.out.println("Array 2");
		mostrarArray(array2);		
		System.out.println("Array Multiplicado");
		mostrarArray(arrayMultiplicado);
		
	}
	public static void rellenarArrayEntreNums(int[]array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
	}
	public static int[] multiplicacionDeArrays(int array1[], int array2[]) {
		int arraySumado[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			arraySumado[i] = array1[i] * array2[i];
		}
		return arraySumado;
	}
	
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
