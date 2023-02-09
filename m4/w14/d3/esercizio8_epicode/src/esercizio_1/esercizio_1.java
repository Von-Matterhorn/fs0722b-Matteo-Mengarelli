package esercizio_1;

public class esercizio_1 extends Thread {

	String message;

	public esercizio_1(String s) {
		message = s;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.message + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Errore durante l'esecuzione del thread");
		}
	}

}
