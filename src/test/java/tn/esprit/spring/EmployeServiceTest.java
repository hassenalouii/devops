/*package tn.esprit.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceTest {
	@Autowired
	IEmployeService es;
	
	@Test
	public void testAjouterEmploye() {
		Employe emp = new Employe("Aloui","Hassen","hassen@gmail.com");
		es.ajouterEmploye(emp);
		assertNotNull(emp.getId());
		es.deleteEmployeById(emp.getId());
	}

}*/
