package esercizio_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class esercizio2_main {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 3000; i++) {
			arr.add(random.nextInt(1, 100));
		}

		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		List<Integer> arr3 = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			arr1.add(arr.get(i));
		}
		for (int i = 1000; i < 2000; i++) {
			arr2.add(arr.get(i));
		}
		for (int i = 2000; i < 3000; i++) {
			arr3.add(arr.get(i));
		}
		try {
			Thread_es2 primo = new Thread_es2(arr1);
			Thread_es2 secondo = new Thread_es2(arr2);
			Thread_es2 terzo = new Thread_es2(arr3);
			primo.start();
			primo.join();
			secondo.start();
			secondo.join();
			terzo.start();
			terzo.join();
			System.out.println(primo.totale + secondo.totale + terzo.totale);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
