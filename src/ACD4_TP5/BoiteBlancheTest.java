package ACD4_TP5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoiteBlancheTest {
	BoiteBlanche b1, b2, b3, b4, b5, b6, b7, b8;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("avant chaque test");
		b1 = new BoiteBlanche(-5, -2);
		b2 = new BoiteBlanche(-2, -5);
		b3 = new BoiteBlanche(5, 2);
		b4 = new BoiteBlanche(2, 5);
		b5 = new BoiteBlanche(-5, 2);
		b6 = new BoiteBlanche(-2, 5);
		b7 = new BoiteBlanche(5, -2);
		b8 = new BoiteBlanche(2, -5);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("après chaque test");
	}

	@Test
	public void test() {
		System.out.println("test du couple(-5, -2)");
		System.out.println(""+ b1.execute());
		assertEquals(0, b1.execute());
	}
	
	@Test
	public void test1() {
		System.out.println("test du couple(-2, -5)");
		System.out.println(b2.execute());
		assertEquals(0, b2.execute());
	}
	
	@Test
	public void test2() {
		System.out.println("test du couple(5, 2)");
		System.out.println(b3.execute());
		assertEquals(0, b3.execute());
	}
	
	@Test
	public void test3() {
		System.out.println("test du couple(2, 5)");
		System.out.println(b4.execute());
		assertEquals(0, b4.execute());	
	}
	
	@Test
	public void test4(){
		System.out.println("test du couple(-5, 2)");
		System.out.println(b5.execute());
		assertEquals(0, b5.execute());
	}
	
	@Test
	public void test5(){
		System.out.println("test du couple(-2, 5)");
		System.out.println(b6.execute());
		assertEquals(0, b6.execute());
	}
	
	@Test
	public void test6(){
		System.out.println("test du couple(5, -2)");
		System.out.println(b7.execute());
		assertEquals(0, b7.execute());
	}
	
	@Test
	public void test7(){
		System.out.println("test du couple(2, -5)");
		System.out.println(b8.execute());
		assertEquals(0, b8.execute());
	}
}
