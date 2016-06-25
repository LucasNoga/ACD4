package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DichoTest {
	Dicho a;
	Dicho b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("début des test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("fin des test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("début de test");
		a = new Dicho();
		b = new Dicho();
		a.n = 5; 
		b.n = 5;
		a.tab[0] = 12;
		a.tab[1] = 16;
		a.tab[2] = 20;
		a.tab[3] = 45;
		a.tab[4] = 39;
		
		for(int i = 0; i < b.tab.length; i++)
			b.tab[i] = i;
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("fin du test\n");
	}

	@Test
	public void testCherche(){
		System.out.println("test sur le tableau a\n");
		assertEquals(3, a.cherche(45));
	}
	
	@Test
	public void testCherche2(){
		System.out.println("test sur le tableau b");
		
		System.out.println(""+a.cherche(2));
		System.out.println(a.tab[1]);
		assertEquals(3, a.cherche(2));	
	}

}
