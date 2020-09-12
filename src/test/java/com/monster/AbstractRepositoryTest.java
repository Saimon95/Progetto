package com.monster;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.monster.persistence.entity.Azienda;
import com.monster.repository.AziendaRepository;

public abstract class AbstractRepositoryTest {
	
	private static final Logger logger = LoggerFactory.getLogger(AbstractRepositoryTest.class);
	
	@Autowired
	private AziendaRepository aziendaRepository;
	
	
	

//	protected Azienda getFakeAzienda() {
//		int random = (int) (Math.random() * 10000);
//		return getFakeAziendaWithNameAndEmail("nameRandom"+random,"emailRandom"+random);
//	}
//	
//	protected Azienda getFakeAziendaWithEmail(String email) {
//		int random = (int) (Math.random() * 10000);
//		return getFakeAziendaWithNameAndEmail("nameRandom"+random,email);
//	}
//	protected Azienda getFakeAziendaWithName(String name) {
//		int random = (int) (Math.random() * 10000);
//		return getFakeAziendaWithNameAndEmail(name,"emailRandom"+random);
//	}
//	
//	protected Azienda getFakeAziendaWithNameAndEmail(String name,String email) {
//		Azienda testAzienda = new Azienda();
//		int random = (int) (Math.random() * 10000);
//		testAzienda.setEmail(email);
//		testAzienda.setPassword("pswTest");
//		testAzienda.setNome(name);
//		testAzienda.setDecrizione("descrizione azienda");
//		testAzienda.setNumeroDipendenti(random);
//		testAzienda.setLink("testLinkAzienda");
//		testAzienda.setLogo("testLogoAzienda");
//		long timestamp = System.currentTimeMillis();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = new Date(timestamp);
//		testAzienda.setAnnoFondazione(date);
//		testAzienda.setSettore("testSettoreAzienda");
//		System.out.println("arriva+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		aziendaRepository.save(testAzienda);
//		System.out.println("salva+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		return testAzienda;
//	}
//	
	
	protected Azienda getFakeAzienda() {
		Azienda testAzienda = new Azienda();
		int random = (int) (Math.random() * 10000);
		testAzienda.setEmail(random+"email");
		testAzienda.setPassword("pswTest");
		testAzienda.setNome(random+"enail");
		testAzienda.setDecrizione("descrizione azienda");
		testAzienda.setNumeroDipendenti(random);
		testAzienda.setLink("testLinkAzienda");
		testAzienda.setLogo("testLogoAzienda");
		long timestamp = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date(timestamp);
		testAzienda.setAnnoFondazione(date);
		testAzienda.setSettore("testSettoreAzienda");
		System.out.println("arriva+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		aziendaRepository.save(testAzienda);
		System.out.println("salva+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return testAzienda;
	}
	
	
}
