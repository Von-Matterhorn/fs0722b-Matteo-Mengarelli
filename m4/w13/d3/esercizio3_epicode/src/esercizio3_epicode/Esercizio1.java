package esercizio3_epicode;

public class Esercizio1 {

	public static boolean stringaPariDispari(String str) {
		if (str.length() % 2 == 0) {
			return true;
		} else {
			return true;
		}
	}

	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(stringaPariDispari("ciao"));
		System.out.println(annoBisestile(2023));
	}

}
