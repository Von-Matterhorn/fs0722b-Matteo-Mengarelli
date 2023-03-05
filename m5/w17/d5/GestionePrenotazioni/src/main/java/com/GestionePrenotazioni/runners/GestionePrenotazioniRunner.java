package com.GestionePrenotazioni.runners;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.configurations.GestionePrenotazioniConfiguration;
import com.GestionePrenotazioni.models.Edificio;
import com.GestionePrenotazioni.models.Postazione;
import com.GestionePrenotazioni.models.Prenotazione;
import com.GestionePrenotazioni.models.Utente;
import com.GestionePrenotazioni.repositories.EdificioRepository;
import com.GestionePrenotazioni.repositories.PostazioneRepository;
import com.GestionePrenotazioni.repositories.PrenotazioneRepository;
import com.GestionePrenotazioni.repositories.UtenteRepository;
import com.GestionePrenotazioni.services.GestionePrenotazioniService;
import com.GestionePrenotazioni.utils.TipoPostazione;

@Component
public class GestionePrenotazioniRunner implements ApplicationRunner {

	AnnotationConfigApplicationContext appCtx;
	@Autowired
	GestionePrenotazioniService serv;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ti prego funziona runner");
		appCtx = new AnnotationConfigApplicationContext(GestionePrenotazioniConfiguration.class);

		// SEZIONE CREAZIONE UTENTI TEST
		Utente ut1 = (Utente) appCtx.getBean("utente", "vale", "Valentino Rossi", "vale.rossi46@gmail.com");
		Utente ut2 = (Utente) appCtx.getBean("utente", "pecco", "Francesco Bagnaia", "pecco.bagnaia63@gmail.com");
		Utente ut3 = (Utente) appCtx.getBean("utente", "bestia", "Enea Bastianini", "bestia.bastia23@gmail.com");
		Utente ut4 = (Utente) appCtx.getBean("utente", "bez", "Marco Bezzecchi", "marco.bez72@gmail.com");
		Utente ut5 = (Utente) appCtx.getBean("utente", "maro", "Luca Marini", "luca.marini10@gmail.com");

		// decommentare una volta per salvare gli utenti

		// serv.UtenteSalvaAggiorna(ut1);
		// serv.UtenteSalvaAggiorna(ut2);
		// serv.UtenteSalvaAggiorna(ut3);
		// serv.UtenteSalvaAggiorna(ut4);
		// serv.UtenteSalvaAggiorna(ut5);

		// SEZIONE CREAZIONE EDIFICI TEST
		Edificio ed1 = (Edificio) appCtx.getBean("edificio", "Tavullia", "Viale Vittoria", "Comune di Tavullia");
		Edificio ed2 = (Edificio) appCtx.getBean("edificio", "Pesaro", "Via XXV Aprile", "Comune di Pesaro");
		Edificio ed3 = (Edificio) appCtx.getBean("edificio", "Saludecio", "Via Rosa Bianca", "Comune di Saludecio");
		Edificio ed4 = (Edificio) appCtx.getBean("edificio", "Mondaino", "Via Sant'Agostino", "Comune di Mondaino");
		Edificio ed5 = (Edificio) appCtx.getBean("edificio", "Vallefoglia", "Corso Italia", "Comune di Vallefoglia");

		// decommentare una volta per salvare gli edifici

		// serv.EdificioSalvaAggiorna(ed1);
		// serv.EdificioSalvaAggiorna(ed2);
		// serv.EdificioSalvaAggiorna(ed3);
		// serv.EdificioSalvaAggiorna(ed4);
		// serv.EdificioSalvaAggiorna(ed5);

		// recupero gli utenti dal database per poterli usare per creare le prenotazioni

		Utente ut_1 = serv.UtenteGetById(1);
		Utente ut_2 = serv.UtenteGetById(2);
		Utente ut_3 = serv.UtenteGetById(3);
		Utente ut_4 = serv.UtenteGetById(4);
		Utente ut_5 = serv.UtenteGetById(5);

		// recupero gli edifici dal database per poterli usare per creare le postazioni

		Edificio ed_1 = serv.EdificioGetById(1);
		Edificio ed_2 = serv.EdificioGetById(2);
		Edificio ed_3 = serv.EdificioGetById(3);
		Edificio ed_4 = serv.EdificioGetById(4);
		Edificio ed_5 = serv.EdificioGetById(5);

		// SEZIONE CREAZIONE POSTAZIONI TEST
		Postazione po1 = (Postazione) appCtx.getBean("postazione", ed_1, TipoPostazione.PRIVATO, "bellina", 15);
		Postazione po2 = (Postazione) appCtx.getBean("postazione", ed_3, TipoPostazione.SALA_RIUNIONI, "bellina", 15);
		Postazione po3 = (Postazione) appCtx.getBean("postazione", ed_3, TipoPostazione.SALA_RIUNIONI, "bellina", 15);
		Postazione po4 = (Postazione) appCtx.getBean("postazione", ed_2, TipoPostazione.PRIVATO, "bellina", 15);
		Postazione po5 = (Postazione) appCtx.getBean("postazione", ed_5, TipoPostazione.OPENSPACE, "bellina", 15);

		// decommentare una volta per salvare le postazioni

		// serv.PostazioneSalvaAggiorna(po1);
		// serv.PostazioneSalvaAggiorna(po2);
		// serv.PostazioneSalvaAggiorna(po3);
		// serv.PostazioneSalvaAggiorna(po4);
		// serv.PostazioneSalvaAggiorna(po5);

		// recupero le postazioni dal database per poterle usare per creare delle
		// prenotazioni

		Postazione po_1 = serv.PostazioneGetById(1);
		Postazione po_2 = serv.PostazioneGetById(2);
		Postazione po_3 = serv.PostazioneGetById(3);
		Postazione po_4 = serv.PostazioneGetById(4);
		Postazione po_5 = serv.PostazioneGetById(5);

		// SEZIONE CREAZIONE POSTAZIONI TEST
		Prenotazione pr1 = (Prenotazione) appCtx.getBean("prenotazione", ut_1, po_1, LocalDate.of(2023, 4, 15));
		Prenotazione pr2 = (Prenotazione) appCtx.getBean("prenotazione", ut_2, po_4, LocalDate.of(2023, 4, 10));
		Prenotazione pr3 = (Prenotazione) appCtx.getBean("prenotazione", ut_1, po_3, LocalDate.of(2023, 4, 02));
		Prenotazione pr4 = (Prenotazione) appCtx.getBean("prenotazione", ut_2, po_5, LocalDate.of(2023, 4, 25));
		Prenotazione pr5 = (Prenotazione) appCtx.getBean("prenotazione", ut_4, po_1, LocalDate.of(2023, 2, 20));

		// decommentare una volta per salvare le prenotazioni
		// serv.PrenotazioneSalvaAggiorna(pr1);
		// serv.PrenotazioneSalvaAggiorna(pr2);
		// serv.PrenotazioneSalvaAggiorna(pr3);
		// serv.PrenotazioneSalvaAggiorna(pr4);
		// serv.PrenotazioneSalvaAggiorna(pr5);

		// se provo a salvare questa prenotazione, sarò bloccato nel salvataggio perchè
		// "la postazione è già occupata questo giorno"
		Prenotazione pr6 = (Prenotazione) appCtx.getBean("prenotazione", ut_5, po_4, LocalDate.of(2023, 4, 10));

		// serv.PrenotazioneSalvaAggiorna(pr6);

		// provando a salvare questa seconda prenotazione non mi sarà salvata perchè
		// "l'utente ha già una prenotazione questo giorno"
		Prenotazione pr7 = (Prenotazione) appCtx.getBean("prenotazione", ut_1, po_5, LocalDate.of(2023, 4, 02));

		// serv.PrenotazioneSalvaAggiorna(pr7);

		// qua sotto qualche test del metodo che consente di trovare le postazioni
		// cercandole tramite città e tipo
		List<Postazione> postazioni_desiderate = serv.PostazioneGetByCittaAndTipo("Maranello", TipoPostazione.PRIVATO);
		List<Postazione> postazioni_desiderate_2 = serv.PostazioneGetByCittaAndTipo("Modena", TipoPostazione.SALA_RIUNIONI);

		System.out.println(postazioni_desiderate);
		System.out.println(postazioni_desiderate_2);

		appCtx.close();

	}
}
