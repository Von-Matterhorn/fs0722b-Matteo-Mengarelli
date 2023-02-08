package esercizio6_epicode;

import java.util.Scanner;

public class Automobile {

	public static void calcoloConsumo() {
		try {
			Scanner scan = new Scanner(System.in);

			System.out.println("inserire numero Km");
			int km = Integer.parseInt(scan.nextLine());

			System.out.println("inserire numero Litri");
			int litri = Integer.parseInt(scan.nextLine());
			System.out.println(km / litri);
			calcoloConsumo();
		} catch (ArithmeticException ex) {
			System.out.println("impossibile dividere per zero, riprovare");
			calcoloConsumo();
		}
	}

	public static void main(String[] args) {
		calcoloConsumo();
	}

}
