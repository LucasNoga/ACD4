package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EssaiTest {
	Essai essai1;
	Essai essai2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("début de test\n");
		essai1 = new Essai(5);
		essai2 = new Essai(2);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("fin du test\n");
	}
	
	@Test
	public void testGetVal(){
		System.out.println("Test d'égalité pour essai 1\n");
		assertEquals(5, essai1.getVal());
	}
	
	@Test
	public void testGetVal2(){
		System.out.println("Test d'égalité pour essai 2\n");
		assertEquals(2, essai2.getVal());
	}
	
	@Test
	public void testGetVal3(){
		System.out.println("Test de variable NULL\n");
		assertNotNull(essai1);
	}

	@Test
	public void testSetVal(){
		System.out.println("Test de la méthode setVal\n");
		essai1.setVal(6);
		assertEquals(6, essai1.getVal());
	}
	
	@Test (expected = ArithmeticException.class)
	public void testinv(){
		System.out.println("test pour l'inverse du nombre avec un positif\n");
		essai1.setVal(0);
		assertEquals(1/5, essai1.inv(), 0.0001);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testinv2(){
		System.out.println("test faux\n");
		essai1.setVal(42);
		assertEquals(1/42, essai1.inv(), 0.0001);
	}

}
