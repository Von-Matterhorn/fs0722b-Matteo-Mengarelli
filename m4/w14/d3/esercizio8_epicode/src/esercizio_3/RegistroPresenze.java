package esercizio_3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	

	public RegistroPresenze() {
	}

	public static void scrivi(Map<String, Integer> presenze,String path) throws IOException {
		File file=new File(path);
		String stampare = "";
		for (String a : presenze.keySet()) {
			stampare += a + "@" + presenze.get(a) + "#";
		}
		stampare = stampare.substring(0, stampare.length() - 1);
		FileUtils.writeStringToFile(file, stampare, "UTF-8");
	}

	public static Map<String, Integer> leggi(String path) throws IOException {
		File file=new File(path);
		Map<String, Integer> presenzeLette = new HashMap<String, Integer>();
		String leggere = FileUtils.readFileToString(file, "UTF-8");

		String nome = "";
		int numero = 0;
		boolean controllo = false;
		for (int i = 0; i < leggere.length(); i++) {
			if (leggere.charAt(i) == '@') {
				controllo = true;
			} else if (controllo == true) {
				if (leggere.charAt(i) == '#' || i == leggere.length() - 1) {
					if (i == leggere.length() - 1) {
						numero = Character.getNumericValue(leggere.charAt(i));
					}
					presenzeLette.put(nome, numero);
					nome = "";
					numero = 0;
					controllo = false;
				} else {
					numero = Character.getNumericValue(leggere.charAt(i));
				}
			} else {
				nome += leggere.charAt(i);
			}
		}
		return presenzeLette;
	}

}
