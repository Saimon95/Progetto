package com.monster;


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
	
	
	

	protected Azienda getFakeAzienda() {
		logger.info("AbstractRepositoryTest.getFakeAzienda - START");    	
		int random = (int) (Math.random() * 10000);
		logger.info("AbstractRepositoryTest.getFakeAzienda - END");    	
		return getFakeAziendaWithNameAndEmail("nameRandom"+random,"emailRandom"+random);
		
	}
	
	protected Azienda getFakeAziendaWithEmail(String email) {
		logger.info("AbstractRepositoryTest.getFakeAziendaWithEmail - START");    	
		int random = (int) (Math.random() * 10000);
		logger.info("AbstractRepositoryTest.getFakeAziendaWithEmail - END");    	

		return getFakeAziendaWithNameAndEmail("nameRandom"+random,email);
	}
	protected Azienda getFakeAziendaWithName(String name) {
		logger.info("AbstractRepositoryTest.getFakeAziendaWithName - START");    	

		int random = (int) (Math.random() * 10000);
		logger.info("AbstractRepositoryTest.getFakeAziendaWithName - END");    	

		return getFakeAziendaWithNameAndEmail(name,"emailRandom"+random);
	}
	
	protected Azienda getFakeAziendaWithNameAndEmail(String name,String email) {
		logger.info("AbstractRepositoryTest.getFakeAziendaWithNameAndEmail - START");    	

		Azienda testAzienda = new Azienda();
		int random = (int) (Math.random() * 10000);
		testAzienda.setEmail(email);
		testAzienda.setPassword("pswTest");
		testAzienda.setNome(name);
		testAzienda.setDecrizione("descrizione azienda");
		testAzienda.setNumeroDipendenti(random);
		testAzienda.setLink("testLinkAzienda");
		testAzienda.setLogo("testLogoAzienda");
		long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
		testAzienda.setAnnoFondazione(date);
		testAzienda.setSettore("testSettoreAzienda");
		aziendaRepository.save(testAzienda);
		logger.error("AbstractRepositoryTest.getFakeAziendaWithNameAndEmail - Debug:"+testAzienda.getId()+"--"+testAzienda.getEmail());    	
		
		
		logger.info("AbstractRepositoryTest.getFakeAziendaWithNameAndEmail - END");    	
		return testAzienda;
	}
	
	
//	protected Azienda getFakeAzienda() {
//		Azienda testAzienda = new Azienda();
//		int random = (int) (Math.random() * 10000);
//		testAzienda.setEmail(random+"email");
//		testAzienda.setPassword("pswTest");
//		testAzienda.setNome(random+"enail");
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
	
}
