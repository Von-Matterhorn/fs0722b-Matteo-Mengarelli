package esercizio3_epicode;

import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {

		richiestaContinua();

	}

	public static void richiestaContinua() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Inserire una stringa non vuota. Se vuoi uscire, inserisci :q");
			String str = sc.nextLine().trim();
			while (!str.equalsIgnoreCase(":q")) {
				System.out.println(String.join(",", str.split("")));
				System.out.println("Inserire una stringa non vuota. Se vuoi uscire, inserisci :q");
				str = sc.nextLine().trim();

			}
		}
	}

}
