package com.app.capstone;

import com.app.capstone.model.catalogo;
import com.app.capstone.model.catalogoDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CapstoneApplicationTests {

	@Autowired
	private catalogoDao CatalogoDao;

	@Test
	void addCatalogoTest() {
		catalogo Catalogo = new catalogo(1, "Persona 5 Royal", "/assets/games/Persona 5.webp", "1", "Gioco di ruolo", "59.99", "PS5", "31/3/2020", "SEGA", "Giapponese, Inglese", "Francese, Inglese, Italiano, Spagnolo, Tedesco", "Indossa la maschera. Mostra la tua verità. Preparati per un'esperienza GDR rinnovata su Persona®5 Royal, il più recente episodio della pluripremiata serie Persona®! Vesti la maschera di Joker e unisciti ai Ladri Fantasma di Cuori. Liberati dalle catene della società moderna e organizza colpi dentro le menti dei corrotti per risvegliare il loro cuore!");

	}

}
