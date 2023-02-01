package esercizio3_epicode;

import java.nio.file.spi.FileSystemProvider;

public class esercizio2 {

	public static void controllo(int a) {
		switch (a) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("errore");
		}
	}

	public static void main(String[] args) {

		controllo(2);
	}
}
