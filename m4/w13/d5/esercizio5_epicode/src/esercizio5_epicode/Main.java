package esercizio5_epicode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MediaPlayer file1 = null;
		MediaPlayer file2 = null;
		MediaPlayer file3 = null;
		MediaPlayer file4 = null;
		MediaPlayer file5 = null;
		
		//per la sua sanità mentale guardi solo il primo, ogni file è identico
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cosa vuoi importare? Immagine (1), Video(2), Audio(3)");
		String string = scanner.nextLine();
		boolean control = isNumeric(string);
		while(control==false) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			string = scanner.nextLine();
			control = isNumeric(string);
		}
		int input = Integer.parseInt(string);
		while(input>3 || input<1) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			input = scanner.nextInt();
		}
		switch(input) {
		case 1:
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title = scanner1.nextLine();
			
			System.out.println("Luminosità: ");
			int lightness = scanner1.nextInt();
			while(lightness>10 || lightness<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness = scanner1.nextInt();
			}
			file1 = new Image(title, lightness);
			file1.isImage = 1;
			break;
		case 2:
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title1 = scanner2.nextLine();
			
			System.out.println("Durata: ");
			int time1 = scanner2.nextInt();
			while(time1>10 || time1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner2.nextInt();
			}
			
			System.out.println("Luminosità: ");
			int lightness1 = scanner2.nextInt();
			while(lightness1>10 || lightness1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness1 = scanner2.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume1 = scanner2.nextInt();
			while(volume1>10 || volume1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume1 = scanner2.nextInt();
			}
			
			file1 = new Video(title1, time1, lightness1, volume1);
			file1.isImage = 0;
			break;
		case 3: 
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title2 = scanner3.nextLine();
			
			System.out.println("Durata: ");
			int time2 = scanner3.nextInt();
			while(time2>10 || time2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner3.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume2 = scanner3.nextInt();
			while(volume2>10 || volume2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume2 = scanner3.nextInt();
			}
			
			file1 = new Audio(title2, time2, volume2);
			file1.isImage = 0;
			break;	
		}
		
		//f2---------------------------------------------
		
		Scanner scanner10 = new Scanner(System.in);
		System.out.println("Cosa vuoi importare? Immagine (1), Video(2), Audio(3)");
		string = scanner10.nextLine();
		boolean control1 = isNumeric(string);
		while(control1==false) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			string = scanner10.nextLine();
			control1 = isNumeric(string);
		}
		input = Integer.parseInt(string);
		while(input>3 || input<1) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			input = scanner.nextInt();
		}
		switch(input) {
		case 1:
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title = scanner1.nextLine();
			
			System.out.println("Luminosità: ");
			int lightness = scanner1.nextInt();
			while(lightness>10 || lightness<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness = scanner1.nextInt();
			}
			
			file2 = new Image(title, lightness);
			file2.isImage = 1;
			break;
		case 2:
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title1 = scanner2.nextLine();
			
			System.out.println("Durata: ");
			int time1 = scanner2.nextInt();
			while(time1>10 || time1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner2.nextInt();
			}
			
			System.out.println("Luminosità: ");
			int lightness1 = scanner2.nextInt();
			while(lightness1>10 || lightness1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness1 = scanner2.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume1 = scanner2.nextInt();
			while(volume1>10 || volume1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume1 = scanner2.nextInt();
			}
			
			file2 = new Video(title1, time1, lightness1, volume1);
			file2.isImage = 0;
			break;
		case 3: 
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title2 = scanner3.nextLine();
			
			System.out.println("Durata: ");
			int time2 = scanner3.nextInt();
			while(time2>10 || time2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner3.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume2 = scanner3.nextInt();
			while(volume2>10 || volume2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume2 = scanner3.nextInt();
			}
			
			file2 = new Audio(title2, time2, volume2);
			file2.isImage = 0;
			break;			
		}
		
		//f3---------------------------------------------
		
		Scanner scanner20 = new Scanner(System.in);
		System.out.println("Cosa vuoi importare? Immagine (1), Video(2), Audio(3)");
		string = scanner20.nextLine();
		control = isNumeric(string);
		while(control==false) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			string = scanner20.nextLine();
			control = isNumeric(string);
		}
		input = Integer.parseInt(string);
		while(input>3 || input<1) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			input = scanner.nextInt();
		}
		switch(input) {
		case 1:
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title = scanner1.nextLine();
			
			System.out.println("Luminosità: ");
			int lightness = scanner1.nextInt();
			while(lightness>10 || lightness<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness = scanner1.nextInt();
			}
			
			file3 = new Image(title, lightness);
			file3.isImage = 1;
			break;
		case 2:
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title1 = scanner2.nextLine();
			
			System.out.println("Durata: ");
			int time1 = scanner2.nextInt();
			while(time1>10 || time1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner2.nextInt();
			}
			
			System.out.println("Luminosità: ");
			int lightness1 = scanner2.nextInt();
			while(lightness1>10 || lightness1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness1 = scanner2.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume1 = scanner2.nextInt();
			while(volume1>10 || volume1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume1 = scanner2.nextInt();
			}
			
			file3 = new Video(title1, time1, lightness1, volume1);
			file3.isImage = 0;
			break;
		case 3: 
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title2 = scanner3.nextLine();
			
			System.out.println("Durata: ");
			int time2 = scanner3.nextInt();
			while(time2>10 || time2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner3.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume2 = scanner3.nextInt();
			while(volume2>10 || volume2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume2 = scanner3.nextInt();
			}
					
			file3 = new Audio(title2, time2, volume2);
			file3.isImage = 0;
			break;
		}
		
		//f4---------------------------------------------
		
		Scanner scanner30 = new Scanner(System.in);
		System.out.println("Cosa vuoi importare? Immagine (1), Video(2), Audio(3)");
		string = scanner30.nextLine();
		control = isNumeric(string);
		while(control==false) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			string = scanner30.nextLine();
			control = isNumeric(string);
		}
		input = Integer.parseInt(string);
		while(input>3 || input<1) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			input = scanner.nextInt();
		}
		switch(input) {
		case 1:
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title = scanner1.nextLine();
			
			System.out.println("Luminosità: ");
			int lightness = scanner1.nextInt();
			while(lightness>10 || lightness<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness = scanner1.nextInt();
			}
			
			file4 = new Image(title, lightness);
			file4.isImage = 1;
			break;
		case 2:
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title1 = scanner2.nextLine();
			
			System.out.println("Durata: ");
			int time1 = scanner2.nextInt();
			while(time1>10 || time1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner2.nextInt();
			}
			
			System.out.println("Luminosità: ");
			int lightness1 = scanner2.nextInt();
			while(lightness1>10 || lightness1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness1 = scanner2.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume1 = scanner2.nextInt();
			while(volume1>10 || volume1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume1 = scanner2.nextInt();
			}
			
			file4 = new Video(title1, time1, lightness1, volume1);
			file4.isImage = 0;
			break;
		case 3: 
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title2 = scanner3.nextLine();
			
			System.out.println("Durata: ");
			int time2 = scanner3.nextInt();
			while(time2>10 || time2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner3.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume2 = scanner3.nextInt();
			while(volume2>10 || volume2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume2 = scanner3.nextInt();
			}
			
			file4 = new Audio(title2, time2, volume2);
			file4.isImage = 0;
			break;			
		}
		
		//f5---------------------------------------------
		
		Scanner scanner40 = new Scanner(System.in);
		System.out.println("Cosa vuoi importare? Immagine (1), Video(2), Audio(3)");
		string = scanner40.nextLine();
		control = isNumeric(string);
		while(control==false) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			string = scanner40.nextLine();
			control = isNumeric(string);
		}
		input = Integer.parseInt(string);
		while(input>3 || input<1) {
			System.out.println("Inserire un numero tra quelli proposti: Immagine (1), Video(2), Audio(3)");
			input = scanner.nextInt();
		}
		switch(input) {
		case 1:
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title = scanner1.nextLine();
			
			System.out.println("Luminosità: ");
			int lightness = scanner1.nextInt();
			while(lightness>10 || lightness<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness = scanner1.nextInt();
			}
			
			file5 = new Image(title, lightness);
			file5.isImage = 1;
			break;
		case 2:
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title1 = scanner2.nextLine();
			
			System.out.println("Durata: ");
			int time1 = scanner2.nextInt();
			while(time1>10 || time1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner2.nextInt();
			}
			
			System.out.println("Luminosità: ");
			int lightness1 = scanner2.nextInt();
			while(lightness1>10 || lightness1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				lightness1 = scanner2.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume1 = scanner2.nextInt();
			while(volume1>10 || volume1<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume1 = scanner2.nextInt();
			}
			
			file5 = new Video(title1, time1, lightness1, volume1);
			file5.isImage = 0;
			break;
		case 3: 
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Titolo: ");
			String title2 = scanner3.nextLine();
			
			System.out.println("Durata: ");
			int time2 = scanner3.nextInt();
			while(time2>10 || time2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				time1 = scanner3.nextInt();
			}
			
			System.out.println("Volume: ");
			int volume2 = scanner3.nextInt();
			while(volume2>10 || volume2<0) {
				System.out.println("Inserire un valore tra 0 e 10");
				volume2 = scanner3.nextInt();
			}
			
			file5 = new Audio(title2, time2, volume2);
			file5.isImage = 0;
			break;			
		}

		int scelta;
		do {
			System.out.println("Seleziona da 1 a 5 il file da riprodurre:");
			string = scanner.nextLine();
			control = isNumeric(string);
			while(control==false) {
				System.out.println("Seleziona da 1 a 5 il file da riprodurre:");
				string = scanner.nextLine();
				control = isNumeric(string);
			}
			int scelta1 = Integer.parseInt(string);
			scelta = scelta1;
			switch (scelta1) {
			case 1:
				switch(file1.isImage) {
				case 1:
					file1.show();
					break;
				case 0: 
					file1.play();
					break;
				}
				break;
			case 2:
				switch(file2.isImage) {
				case 1:
					file2.show();
					break;
				case 0: 
					file2.play();
					break;
				}
				break;
			case 3:
				switch(file3.isImage) {
				case 1:
					file3.show();
					break;
				case 0: 
					file3.play();					
					break;
				}
				break;
			case 4:
				switch(file4.isImage) {
				case 1:
					file4.show();
					break;
				case 0: 
					file4.play();					
					break;
				}
				break;
			case 5:
				switch(file5.isImage) {
				case 1:
					file5.show();
					break;
				case 0: 
					file5.play();					
					break;
				}
				break;
				default: System.out.println("Il file non esiste");
			}
		} while (scelta != 0);
		
		
	}
	
	public static boolean isNumeric(String input) {
		if(input.matches("[-+]?\\d*\\.?\\d+")) {
			return true;
		}else {
			return false;
		}
	}
}