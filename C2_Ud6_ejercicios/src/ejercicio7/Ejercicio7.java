package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String monedaCambio;
		double euros;
		
		System.out.println("¿Cuantos euros quieres cambiar? ");
		if(sc.hasNextDouble()) {
			euros = sc.nextDouble();
		}else {
			euros = Double.parseDouble(sc.next());
		}
		System.out.println("Elija la moneda a la que quieres cambiar: ");
		System.out.println("Libras");
		System.out.println("Dolares");
		System.out.println("Yenes");
		monedaCambio = sc.next();
		cambiarMoneda(euros, monedaCambio);
		
	}
	public static void cambiarMoneda(double euros, String moneda) {
		final double LIBRA = 0.86;
		final double DOLAR = 1.28611;
		final double YEN = 129.852;
		
		switch(moneda) {
			case "libras":
				System.out.println(euros + "€ = " + euros*LIBRA + " libras");
				break;
			case "dolares":
				System.out.println(euros + "€ = " + euros*DOLAR + "$");
				break;
			case "yenes":
				System.out.println(euros + "€ = " + euros*YEN + " yenes");
				break;
			default:
				System.out.println("Moneda de cambio no identificada");
		}
	}
}
