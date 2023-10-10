package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		System.out.println("El numero " + num + " es " + transformarBinario(num) + " en binario");
	}
	public static String transformarBinario(int num) {
		String resultado = "";
		while(num >= 2) {
			resultado = (num%2) + resultado;
			num = num / 2;
		}
		return num + resultado;
	}

}
