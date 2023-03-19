package com.GestioneIncendiAzienda.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestioneIncendiAzienda.factories.SondaFactory;
import com.GestioneIncendiAzienda.models.CentroControllo;
import com.GestioneIncendiAzienda.models.Sonda;
import com.GestioneIncendiAzienda.services.CentroControlloService;
import com.GestioneIncendiAzienda.services.SondaService;

@Component
public class MainRunner implements ApplicationRunner {

	@Autowired
	SondaService sondasr;
	@Autowired
	CentroControlloService centrosr;
	@Autowired
	SondaFactory sondafct/* = new SondaFactory() */;

	@Override

	public void run(ApplicationArguments args) throws Exception {
		System.out.println("hello");
		System.out.println("speram");

		// sezione test, scommentare una volta per creare un centro e 3 sonde

		CentroControllo cn1 = new CentroControllo();
		// centrosr.centroCrea(cn1);

		CentroControllo cn11 = centrosr.centroTrovaTramiteId(1L);

		Sonda sn1 = (Sonda) sondafct.create();
		sn1.setLatitudine(10);
		sn1.setLongitudine(20);
		sn1.setLivelloFumo(0);
		sn1.setCentro(cn11);
		// sondasr.sondaCrea(sn1);

		Sonda sn2 = (Sonda) sondafct.create();
		sn2.setLatitudine(30);
		sn2.setLongitudine(40);
		sn2.setLivelloFumo(0);
		sn2.setCentro(cn11);
		// sondasr.sondaCrea(sn2);

		Sonda sn3 = (Sonda) sondafct.create();
		sn3.setLatitudine(15);
		sn3.setLongitudine(25);
		sn3.setLivelloFumo(0);
		sn3.setCentro(cn11);
		// sondasr.sondaCrea(sn3);

		// sezione test, scommentare una volta per aggiornare il livello fumo di una
		// sonda e vedere in console il messaggio di allarme

		Sonda sn3Updated = sondasr.sondaTrovaTramiteId(2L);
		 sn3Updated.setLivelloFumo(7);
		// sondasr.sondaUpdate(sn3Updated);

	}

}
