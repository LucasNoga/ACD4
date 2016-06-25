package junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDicho {
	static Dicho a;
	static Dicho b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("avant tout");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("fin des test");
	}

	@Before
	public void setUp() throws Exception {
		a = new Dicho();
		b = new Dicho();
		a.n = 4;
		b.n = 9;
		a.tab[0] = 12;
		a.tab[1] = 14;
		a.tab[2] = 20;
		a.tab[3] = 25;
			
		for(int i = 0; i < 9; i++)
				b.tab[i] = i;	
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("fin du test\n");
	}
		
	@Test
	public void testcherche1(){
		System.out.println("recherche de 20 dans le tableau a");
		assertEquals(3, a.cherche(20));
	}
		
	@Test
	public void testcherche2(){
		System.out.println("recherche de 3 dans le tableau b");
		assertEquals(3, b.cherche(2));
	 }

}
