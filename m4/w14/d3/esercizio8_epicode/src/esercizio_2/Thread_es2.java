package esercizio_2;

import java.util.List;

public class Thread_es2 extends Thread {

	List<Integer> arr;
	int totale = 0;

	public Thread_es2(List<Integer> arr) {
		this.arr = arr;

	}

	@Override
	public void run() {
		for (int i = 0; i < arr.size(); i++) {
			this.totale += arr.get(i);
		}
		System.out.println(this.totale);
	}

}
