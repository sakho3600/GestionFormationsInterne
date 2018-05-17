package gfi.psf.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import gfi.psf.model.Formation;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FormationRepositoryTest {
	
	@Autowired
	private FormationRepository formationRepository;

	@Test
	public void testFindAllFormations() {
		List<Formation> formations = formationRepository.findAllFormations();
		assertNotNull(formations);
		assertEquals("nomA",formations.get(0).getNom());
		assertEquals("nomB",formations.get(1).getNom());
		assertEquals("nomC",formations.get(2).getNom());
		assertEquals(3, formations.size());
	}

}
