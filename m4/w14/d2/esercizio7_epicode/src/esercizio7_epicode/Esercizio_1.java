package esercizio7_epicode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio_1 {

	public static void esercizio1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dimmi la dimensione del set: ");
		int dimensione = Integer.parseInt(scan.nextLine());
		Set<String> setParole = new HashSet<String>();
		Set<String> setParoleDuplicate = new HashSet<String>();
		for (int i = 0; i < dimensione; i++) {
			System.out.println("forniscimi la parola numero:" + (i + 1));
			String parola = scan.nextLine();
			if (setParole.contains(parola)) {
				setParoleDuplicate.add(parola);
			} else {
				setParole.add(parola);
			}
		}
		System.out.println("Parole duplicate: " + setParoleDuplicate);
		System.out.println("Numero parole distinte: " + setParole.size());
		System.out.println("Parole distinte: " + setParole);
	}

	public static void main(String[] args) {
		esercizio1();
	}

}
