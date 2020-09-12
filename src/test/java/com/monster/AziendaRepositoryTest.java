package com.monster;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.monster.persistence.entity.Azienda;
import com.monster.repository.AziendaRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AziendaRepositoryTest extends AbstractRepositoryTest{

	private static final Logger logger = LoggerFactory.getLogger(AziendaRepositoryTest.class);

	@Autowired
	private AziendaRepository aziendaRT;
	
	@BeforeEach
	@AfterEach
    public void initializeAziendaTest() {
    	logger.info("AziendaRepositoryTest.initializeAziendaTest - START");    	
    	aziendaRT.deleteAll();

		logger.info("AziendaRepositoryTest.initializeAziendaTest - END");
    }
	
	
	@Test
    public void testSelectAllFilled(){
    	logger.info("AziendaRepositoryTest.testSelectAllFilled() - START");    	
    	getFakeAzienda();
    	System.out.println(aziendaRT.count());
    	Assertions.assertTrue(aziendaRT.count() == 1);
    	logger.info("AziendaRepositoryTest.testSelectAllFilled() - END");
    }
	
	
	@Test
    public void testSelectAllEmpty(){
    	logger.info("AziendaRepositoryTest.testSelectAllEmpty() - START");    	
    	Assertions.assertTrue(aziendaRT.count()==0);
		logger.info("AziendaRepositoryTest.testSelectAllEmpty() - END");
    }
	
	
	
	
	
	
	
	
	@Test
	public void testInsert() {
    	logger.info("AziendaRepositoryTest.testInsert() - START");    	
    	Assertions.assertTrue(aziendaRT.count()==0);
    	getFakeAzienda();
		Assertions.assertTrue(aziendaRT.count()==1);
		logger.info("AziendaRepositoryTest.testInsert() - END");
	}
//	
//	@Test
//	public void testSelectById() {
//    	logger.info("AziendaRepositoryTest.testSelectById() - START");    	
//    	Azienda currentAzienda = getFakeAzienda();
//    	Assertions.assertTrue(aziendaRT.findById(currentAzienda.getId()).isPresent());	
//		logger.info("AziendaRepositoryTest.testSelectById() - END");
//	}
////	
//	@Test
//	public void testSelectByName() {
//    	logger.info("AziendaRepositoryTest.testSelectByCodeOk() - START");
//    	String code = "test_code_" + random ;
//    	getFakeCoursePageWithCode(code);
//		Assertions.assertTrue(aziendaRT.findByCode(code)!=null);	
//		logger.info("AziendaRepositoryTest.testSelectByCodeOk() - END");
//	}
//	
//	@Test
//	public void testSelectByCodeKo() {
//    	logger.info("AziendaRepositoryTest.testSelectByCodeKo() - START");
//    	int random = (int)(Math.random() * 10000);
//    	String code = "test_code_" + random ;
//    	String fakeCode = code + "X" ;
//    	getFakeCoursePageWithCode(code);
//		Assertions.assertTrue(aziendaRT.findByCode(fakeCode)==null);	
//		logger.info("AziendaRepositoryTest.testSelectByCodeKo() - END");
//	}
//	
//	@Test
//	public void testUpdate() {
//		logger.info("AziendaRepositoryTest.testUpdate() - START");
//		CoursePage currentCoursePage = getFakeCoursePage();
//		currentCoursePage.setFileName("testUpdate");
//		aziendaRT.save(currentCoursePage);
//		Assertions.assertTrue(aziendaRT.findById(currentCoursePage.getId()).isPresent());	
//		Assertions.assertTrue(aziendaRT.findById(currentCoursePage.getId()).get().getFileName().equals("testUpdate"));
//	}
//	@Test
//	public void testDeleteById() {
//    	logger.info("AziendaRepositoryTest.testDeleteById() - START");    	
//    	CoursePage currentCoursePage = getFakeCoursePage();
//    	Assertions.assertTrue(aziendaRT.count()==1);
//    	aziendaRT.deleteById(currentCoursePage.getId());
//    	Assertions.assertTrue(aziendaRT.count()==0);
//    	logger.info("AziendaRepositoryTest.testDeleteById() - END");
//	}
//	
//	@Test
//	public void testDeleteAll () {
//    	logger.info("AziendaRepositoryTest.testDeleteAll() - START");    	
//    	getFakeCoursePage();
//    	Assertions.assertTrue(aziendaRT.count()==1);
//    	aziendaRT.deleteAll();
//		Assertions.assertTrue(aziendaRT.count()==0);
//		logger.info("AziendaRepositoryTest.testDeleteAll() - END");
//	}
	
	
}