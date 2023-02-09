package esercizio_1;

public class esercizio1_main {

	public static void main(String[] args) {

		esercizio_1 thread1 = new esercizio_1("*");
		esercizio_1 thread2 = new esercizio_1("#");

		thread1.start();
		thread2.start();

	}

}
