package esercizio7_epicode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Rubrica {

	public static void nuovoNumero(Map<String, Long> contatti) {
		Scanner scan = new Scanner(System.in);
		System.out.println("dimmi il nome: ");
		String nome = scan.nextLine();
		System.out.println("dimmi il numero: ");
		long numero = Long.parseLong(scan.nextLine());
		contatti.put(nome, numero);
	}

	public static void cancellaNumero(Map<String, Long> contatti) {
		Scanner scan = new Scanner(System.in);
		System.out.println("dimmi il nome del contatto da cancellare: ");
		String nome = scan.nextLine();
		contatti.remove(nome);
	}

	public static void cercaNomeTramiteNumero(Map<String, Long> contatti) {
		Scanner scan = new Scanner(System.in);
		System.out.println("dimmi il numero del contatto da cercare: ");
		long numero = Long.parseLong(scan.nextLine());
		if (contatti.containsValue(numero)) {
			for (Entry<String, Long> entry : contatti.entrySet()) {
				if (entry.getValue() == numero) {
					System.out.println(entry.getKey());
				}
			}
		}
	}

	public static void cercaNumeroTramiteNome(Map<String, Long> contatti) {
		Scanner scan = new Scanner(System.in);
		System.out.println("dimmi il nome del contatto da cercare: ");
		String nome = scan.nextLine();
		System.out.println(contatti.get(nome));
	}

	public static void stampa(Map<String, Long> contatti) {
		System.out.println(contatti);
	}

	public static void main(String[] args) {
		Map<String, Long> elencoContatti = new HashMap<String, Long>();
		boolean continua = true;
		System.out.println("Benvenuto nella tua Rubrica");
		System.out.println();
		while (continua) {
			System.out.println("");
			System.out.println("Premere 1 per aggiungere un nuovo contatto");
			System.out.println("Premere 2 per rimuovere un contatto");
			System.out.println("premere 3 per cercare contatto tramite numero");
			System.out.println("premere 4 per cercare contatto tramite nome");
			System.out.println("premere 5 per stampare la rubrica");
			System.out.println("premere 0 per uscire");
			Scanner scan = new Scanner(System.in);
			System.out.println("");
			int numero = Integer.parseInt(scan.nextLine());
			switch (numero) {
			case 0:
				continua = false;
				break;
			case 1:
				nuovoNumero(elencoContatti);
				break;
			case 2:
				cancellaNumero(elencoContatti);
				break;
			case 3:
				cercaNomeTramiteNumero(elencoContatti);
				break;
			case 4:
				cercaNumeroTramiteNome(elencoContatti);
				break;
			case 5:
				stampa(elencoContatti);
				break;
			default:
				System.out.println("errore, inserire un comando corretto");
				System.out.println("");
			}
		}
	}

}
