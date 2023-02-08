package esercizio7_epicode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Esercizio_2 {

	public static List<Integer> creaLista(int dimensione, List<Integer> listaOrdinata) {
		Random random = new Random();
		for (int i = 0; i < dimensione; i++) {

			listaOrdinata.add(random.nextInt(1, 101));

		}
		return listaOrdinata;
	}

	public static List<Integer> listaSpecchiata(List<Integer> listaOriginale) {
		List<Integer> listaSpecchiata = new ArrayList<Integer>();
		for (int i = 0; i < listaOriginale.size(); i++) {
			listaSpecchiata.add(listaOriginale.get(i));
		}
		for (int a = listaOriginale.size() - 1; a >= 0; a--) {
			listaSpecchiata.add(listaOriginale.get(a));
		}
		return listaSpecchiata;
	}

	public static void stampaParziale(List<Integer> listaOriginale, boolean controllo) {
		for (int i = 0; i < listaOriginale.size(); i++) {
			if (controllo == true) {
				if (i % 2 == 0) {
					System.out.print(listaOriginale.get(i) + ", ");
				}
			} else {
				if (i % 2 != 0) {
					System.out.print(listaOriginale.get(i) + ", ");
				}
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> listaOttenuta = new ArrayList<Integer>();
		listaOttenuta = creaLista(5, listaOttenuta);
		System.out.println(listaOttenuta);

		List<Integer> listaOttenutaDoppia = new ArrayList<Integer>();
		listaOttenutaDoppia = listaSpecchiata(listaOttenuta);
		System.out.println(listaOttenutaDoppia);

		stampaParziale(listaOttenutaDoppia, true);
		System.out.println("");
		stampaParziale(listaOttenutaDoppia, false);
	}

}
