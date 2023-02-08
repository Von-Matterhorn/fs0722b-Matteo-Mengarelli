package esercizio6_epicode;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Richiesta {

	private static int array[] = new int[5];

	public static int[] creaArray(int arr[]) {
		boolean controllo = false;
		for (int i = 0; i < arr.length; i++) {
			Random random = new Random();
			int mom = random.nextInt(1, 10);
			for (int a = 0; a < arr.length; a++) {
				if (arr[a] == mom) {
					controllo = true;
				}
			}
			if (controllo == true) {
				i--;
				controllo = false;
				continue;
			}
			arr[i] = mom;
		}
		return arr;
	}

	private static int[] modificaArray(int arr[]) {
		Scanner scan = new Scanner(System.in);
		int index;
		int valore;
		try {
			do {
				System.out.println("inserire l'indice dell'array 1-5");
				index = Integer.parseInt(scan.nextLine());
				System.out.println("inserire valore,oppure 0 per uscire");
				valore = Integer.parseInt(scan.nextLine());
				arr[index - 1] = valore;
				System.out.println(Arrays.toString(arr));
			} while (valore != 0);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("indice inserito non corretto, necessario indice tra 1-5");
			modificaArray(arr);
		} catch (NumberFormatException ex) {
			System.out.println("tipo di dato inserito non corretto, necessario numero");
			modificaArray(arr);
		}
		return arr;
	}

	public static void main(String[] args) {

		// creo l'array casuale
		array = creaArray(array);
		System.out.println(Arrays.toString(array));

		modificaArray(array);

	}

}
