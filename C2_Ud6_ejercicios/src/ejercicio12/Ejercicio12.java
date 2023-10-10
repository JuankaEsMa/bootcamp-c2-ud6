package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		int arrayAcabados[];
		Scanner sc = new Scanner(System.in);
		System.out.println("¿De cuantas posiciones quieres que sea tu array?");
		array = new int[sc.nextInt()];
		rellenarArrayEntreNums(array, 1, 300);
		System.out.println("Escribe un numero para buscar los numeros dentro de la array que acaben por este: ");
		arrayAcabados = crearArrayAcabados(array, sc.nextInt());
		mostrarArray(arrayAcabados);
	}
	
	public static void rellenarArrayEntreNums(int[]array, int min, int max) {
		for (int i = 0; i < array.length; i++) {				 
			array[i] = (int)(Math.random()*(max+1-min)) + min;
		}
	}
	
	public static int[] crearArrayAcabados(int[] array, int num) {
		int numeros[];
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if(isEndedByNum(array[i], num)) {
				array[contador] = array[i];
				contador++;
			}
		}
		numeros = new int[contador];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = array[i];
		}
		return numeros;
	}
	public static boolean isEndedByNum(int num, int acabado) {
		if(num%Math.pow(10, calcularCifras(acabado)) == acabado) {
			return true;
		}
		return false;
	}
	public static void mostrarArray(int[]array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static int calcularCifras(int num) {
		int resultado = 0;
		if(num != 0) {
			for(int i = num; i > 0; i = i/10) {
				resultado++;
			}
		}else {
			return 1;
		}
		return resultado;
	}
}
