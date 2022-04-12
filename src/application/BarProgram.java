package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.Bill;

public class BarProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();
		boolean test = true;
		char gender;
		
		do {
			System.out.print("Sexo (M/F): ");
			gender = sc.next().charAt(0);
			gender = Character.toUpperCase(gender);

			if (!((gender == 'F') || (gender == 'M')))
				System.out.println("Erro!!! Entre com a informação correta!");
			else
				test = !test;
		} while (test);
		
		bill.gender = gender;
		System.out.print("Quantidade de Cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de Refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de Espetinhos: ");
		bill.barbecue = sc.nextInt();
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo: R$ %.2f%n", bill.feeding());
		
		if (bill.cover() == 0)
			System.out.println("Isento de Couvert");
		else
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());
			
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Valor Total a Pagar = R$ %.2f%n", bill.total());
		sc.close();
	}
}
