package esercizio_3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Esercizio3_main {

	public static void main(String[] args) throws IOException {
		RegistroPresenze reg = new RegistroPresenze();
		Map<String, Integer> presenzeDaStampare = new HashMap<String, Integer>();
		presenzeDaStampare.put("Francesco", 5);
		presenzeDaStampare.put("Stefano", 6);
		presenzeDaStampare.put("Luca", 7);
		presenzeDaStampare.put("Piero", 1);
		presenzeDaStampare.put("Maria", 3);
		presenzeDaStampare.put("Angelo", 6);
		reg.scrivi(presenzeDaStampare, "dirFile/test.txt");
		Map<String, Integer> presenzeDaRicevere = new HashMap<String, Integer>();

		presenzeDaRicevere = reg.leggi("dirFile/test2.txt");
		System.out.println(presenzeDaRicevere);
		presenzeDaRicevere = reg.leggi("dirFile/test.txt");
		System.out.println(presenzeDaRicevere);
		

	}

}
