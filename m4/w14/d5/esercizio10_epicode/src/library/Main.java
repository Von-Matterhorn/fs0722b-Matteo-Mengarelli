package library;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.FileUtils;

public class Main {
	public static void main(String[] args) throws IOException {
		List<Libro> bookList = new ArrayList<Libro>();
		List<Rivista> magList = new ArrayList<Rivista>();
		long x = 1;
		while(x > 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Selezionare operazione da compiere: Aggiunta/rimozione (1)   Ricerca (2)   Upload/Download catalogo (3)");
			String input = scanner.nextLine();
			switch(input) {
			case "1":
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Aggiunta (1)   Rimozione (2)");
				input = scanner1.nextLine();
				switch(input){
				case "1":
					Scanner scanner11 = new Scanner(System.in);
					System.out.println("Libro (1)   Rivista (2)");
					input = scanner11.nextLine();
					switch(input){
					case "1":
						Scanner scanner111 = new Scanner(System.in);
						System.out.println("Inserire titolo:");
						String title1 = scanner111.nextLine();
						System.out.println("Inserire anno:");
						int year1 = Integer.parseInt(scanner111.nextLine());
						System.out.println("Inserire pagine:");
						int pages1 = Integer.parseInt(scanner111.nextLine());
						System.out.println("Inserire ISBN:");
						long isbn1 = Long.parseLong(scanner111.nextLine());
						System.out.println("Inserire autore:");
						String author1 = scanner111.nextLine();
						System.out.println("Inserire genere:");
						String genre1 = scanner111.nextLine();
						Libro libro = new Libro(title1, year1, pages1, isbn1, author1, genre1);
						bookList.add(libro);
						break;
					case "2":
						Scanner scanner112 = new Scanner(System.in);
						System.out.println("Inserire titolo:");
						String title2 = scanner112.nextLine();
						System.out.println("Inserire anno:");
						int year2 = Integer.parseInt(scanner112.nextLine());
						System.out.println("Inserire pagine:");
						int pages2 = Integer.parseInt(scanner112.nextLine());
						System.out.println("Inserire ISBN:");
						long isbn2 = Long.parseLong(scanner112.nextLine());
						System.out.println("Inserire periodicità: Settimanale (1)   Mensile (2)   Semestrale (3)");
						int period2 = Integer.parseInt(scanner112.nextLine());
						Period period = null;
						switch (period2) {
						case 1:
							period = Period.SETTIMANALE;
							break;
						case 2:
							period = Period.MENSILE;
							break;
						case 3:
							period = Period.SEMESTRALE;
							break;
						}
						Rivista rivista = new Rivista(title2, year2, pages2, isbn2, period);
						magList.add(rivista);
						break;
					}
					break;
				case "2":
					Scanner scanner12 = new Scanner(System.in);
					System.out.println("Seleziona il/i libro/i o la/e rivista/e da rimuovere tramite codice ISBN");
					long input2 = scanner12.nextLong();
					boolean trovato = false;
					for (int i = 0; i < bookList.size(); i++) {
						if (bookList.get(i).getIsbn() == input2) {
							Stream<Libro> streamLista = bookList.stream().filter(element -> element.getIsbn() != input2);
							bookList = streamLista.collect(Collectors.toList());
							System.out.println("Elemento rimosso");
							trovato = true;
						}
					}
					for (int i = 0; i < magList.size(); i++) {
						if (magList.get(i).getIsbn() == input2) {
							Stream<Rivista> streamLista2 = magList.stream().filter(element -> element.getIsbn() != input2);
							magList = streamLista2.collect(Collectors.toList());
							System.out.println("Elemento rimosso");
							trovato = true;
						}
					}
					if (!trovato) {
						System.out.println("Libro o rivista non trovato");
					}
					break;
				}
				break;
			case "2":
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Parametro da ricercare: ISBN (1)   Anno(2)   Autore(3)");
				String input2 = scanner2.nextLine();
				switch(input2){
				case "1":
					Scanner scanner21 = new Scanner(System.in);
					System.out.println("Inserire codice ISBN");
					int input21 = scanner21.nextInt();
					Stream<Libro> streamList = bookList.stream().filter(element -> element.getIsbn() == input21);
					List<Libro> filteredList = new ArrayList<Libro>();
					filteredList = streamList.collect(Collectors.toList());
					Stream<Rivista> streamList1 = magList.stream().filter(element -> element.getIsbn() == input21);
					List<Rivista> filteredList1 = new ArrayList<Rivista>();
					filteredList1 = streamList1.collect(Collectors.toList());
					if (!filteredList.isEmpty()) {
						System.out.println(filteredList.get(0).title);
					} else 	if (!filteredList1.isEmpty()) {
						System.out.println(filteredList1.get(0).title);
					} else {
						System.out.println("Libro o rivista non trovata");
					}
				case "2":
					Scanner scanner22 = new Scanner(System.in);
					System.out.println("Inserire anno");
					int input22 = scanner22.nextInt();
					Stream<Libro> streamList2 = bookList.stream().filter(element -> element.getIsbn() == input22);
					List<Libro> filteredList2 = new ArrayList<Libro>();
					filteredList2 = streamList2.collect(Collectors.toList());
					Stream<Rivista> streamLista22 = magList.stream().filter(element -> element.getIsbn() == input22);
					List<Rivista> filteredList22 = new ArrayList<Rivista>();
					filteredList22 = streamLista22.collect(Collectors.toList());
					if (!filteredList2.isEmpty()) {
						System.out.println(filteredList2.get(0).title);
					} else 	if (!filteredList22.isEmpty()) {
						System.out.println(filteredList22.get(0).title);
					} else {
						System.out.println("Libro o rivista non trovata");
					}
				case "3":
					Scanner scanner23 = new Scanner(System.in);
					System.out.println("Inserire anno");
					int input23 = scanner23.nextInt();
					Stream<Libro> streamList3 = bookList.stream().filter(element -> element.getIsbn() == input23);
					List<Libro> filteredList3 = new ArrayList<Libro>();
					filteredList3 = streamList3.collect(Collectors.toList());
					if (!filteredList3.isEmpty()) {
						System.out.println(filteredList3.get(0).title);
					} else {
						System.out.println("Libro non trovata");
					}
				}
				break;
			case "3":
				Scanner scanner3 = new Scanner(System.in);
				System.out.println("Upload (1)   Download (2)");
				input = scanner3.nextLine();
				switch(input){
				case "1":
					uploadBooks(bookList);
					uploadMag(magList);			
					break;
				case "2":				
					break;
				}
				break;
			default:
				System.out.println("Errore");
			}
		}
	}
	public static void uploadBooks(List<Libro> list) throws IOException {
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Libro) {
				Libro currentBook = (Libro) list.get(i);
				string += "libro";
				string += " ";
				string += list.get(i).getTitle();
				string += ", ";
				string += currentBook.getAuthor();
				string += ", ";
				string += currentBook.getGenre();
				string += ", ";
				string += Long.toString(list.get(i).getIsbn());
				string += ", ";
				string += Integer.toString(list.get(i).getYear());
				string += ", ";
				string += Integer.toString(list.get(i).getPages());
				string += ", ";
			}
		}
		File file = new File("archivio/elencolibri.txt");
		FileUtils.writeStringToFile(file, string, "UTF-8");
	}
	public static void uploadMag(List<Rivista> list) throws IOException {
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Rivista) {
				Rivista currentMag = (Rivista) list.get(i);
				string += "rivista";
				string += " ";
				if (currentMag.getPeriod() == Period.SETTIMANALE) {
					string += "settimanale";
				} else if (currentMag.getPeriod() == Period.MENSILE) {
					string += "mensile";
				} else {
					string += "semestrale";
				}
				string += " ";
				string += list.get(i).getTitle();
				string += ", ";
				string += Long.toString(list.get(i).getIsbn());
				string += ", ";
				string += Integer.toString(list.get(i).getYear());
				string += ", ";
				string += Integer.toString(list.get(i).getPages());
				string += ", ";
			}
		}
		File file = new File("archivio/elencoriviste.txt");
		FileUtils.writeStringToFile(file, string, "UTF-8");
	}
}
