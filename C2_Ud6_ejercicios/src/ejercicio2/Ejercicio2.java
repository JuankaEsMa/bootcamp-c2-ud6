package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numAleatorios = new int[sc.nextInt()];
		System.out.println("Escriba el rango minimo:");
		int min = sc.nextInt();
		System.out.println("Escriba el rango máximo:");
		int max = sc.nextInt();
		for(int i = 0; i < numAleatorios.length; i++) {
			numAleatorios[i] = generarNumAleatorio(min,max);
			System.out.println(numAleatorios[i]);
		}
		sc.close();
	}
	public static int generarNumAleatorio(int min, int max) {
		return (int)(Math.random()*(max+1-min)) + min;
	}
}
