package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String opcion;
		double resultado = 0;
		boolean isCorrect = true;
		System.out.println("1) Calcular area de circulo");
		System.out.println("2) Calcular area de Triangulo");
		System.out.println("3) Calcular area de Cuadrado");
		opcion = sc.next();
		switch(opcion) {
			case "1":
				System.out.println("Escriba el radio del circulo: ");
				resultado = areaCirculo(sc.nextDouble());
				break;
			case "2":
				System.out.println("Escriba la base y la altura del Triangulo: ");
				resultado = areaTriangulo(sc.nextDouble(), sc.nextDouble());
				break;
			case "3":
				System.out.println("Escriba el lado del Cuadrado: ");
				resultado = areaCuadrado(sc.nextDouble());
				break;
			default:
				isCorrect = false;
		}
		if(isCorrect) {
			System.out.println("El Area es: " + resultado);
		}else {
			System.out.println("Opción incorrecta");
		}
	}
	
	public static double areaCirculo(double radio) {
		return (Math.pow(radio, 2))*Math.PI;
	}
	public static double areaTriangulo(double base, double altura) {
		return (base*altura)/2;
	}
	public static double areaCuadrado(double lado) {
		return lado*2;
	}
}
