package ACD4_TP5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	
	Triangle triangle;
	int max, min;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		triangle = new Triangle(0,0,0);
		min = Integer.MIN_VALUE;
		max = Integer.MAX_VALUE;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1(){
		System.out.println("test avec une valeur négative");
		assertEquals(0, triangle.triangleM(-2,5,7));
		System.out.println("attendu 0: " + triangle.triangleM(-2,5,7));
	}
	@Test
	public void test2(){
		System.out.println("test avec des nombres nulles");
		assertEquals(0, triangle.triangleM(0,0,0));
		System.out.println("attendu 0: " + triangle.triangleM(0,0,0));
	}
	
	
	@Test
	public void test3(){
		System.out.println("test un tringle equilatéral");
		assertEquals(1, triangle.triangleM(2,2,2));
		System.out.println("attendu 1: " + triangle.triangleM(2,2,2));
	}
	@Test
	public void test4(){
		System.out.println("test un tringle quelconque");
		assertEquals(3, triangle.triangleM(3,5,7));
		System.out.println("attendu 3: " + triangle.triangleM(2,5,7));
	}
	@Test
	public void test5(){
		System.out.println("test un triangle isocèle");
		assertEquals(2, triangle.triangleM(3,5,3));
		System.out.println("attendu 2: " + triangle.triangleM(3,5,3));
	}
	@Test
	public void test6(){
		System.out.println("test un triangle isocèle");
		assertEquals(2, triangle.triangleM(5,5,7));
		System.out.println("attendu 2: " + triangle.triangleM(5,5,7));
	}
	
	@Test
	public void test7(){
		System.out.println("test avec une valeur trop grande pour b");
		assertEquals(0, triangle.triangleM(2,20,7));
		System.out.println("attendu 0: " + triangle.triangleM(2,20,7));
	}
	@Test
	public void test8(){
		System.out.println("test avec une trop grande pour c");
		assertEquals(0, triangle.triangleM(2,5,20));
		System.out.println("attendu 0: " + triangle.triangleM(2,5,20));
	}
	@Test
	public void test9(){
		System.out.println("test avec une valeur trop grande pour a");
		assertEquals(0, triangle.triangleM(29,5,7));
		System.out.println("attendu 0: " + triangle.triangleM(29,5,7));
	}
	
	@Test
	public void test10(){
		System.out.println("test avec a = 0");
		assertEquals(0, triangle.triangleM(0,1,1));
		System.out.println("attendu 0: " + triangle.triangleM(0,1,1));
	}
	@Test
	public void tes11(){
		System.out.println("test avec b = 0");
		assertEquals(0, triangle.triangleM(1,1,0));
		System.out.println("attendu 0: " + triangle.triangleM(1,1,0));
	}
	@Test
	public void test12(){
		System.out.println("test avec c = 0");
		assertEquals(0, triangle.triangleM(1,0,1));
		System.out.println("attendu 0: " + triangle.triangleM(1,0,1));
	}
	@Test
	public void test13(){
		System.out.println("test un triangle equilateral avec les valeurs max");
		assertEquals(1, triangle.triangleM(max,max,max));
		System.out.println("attendu 1: " + triangle.triangleM(max,max,max));
	}
	@Test
	public void test14(){
		System.out.println("test un triangle equilatéral avec les valeurs min");
		assertEquals(0, triangle.triangleM(min,min,min));
		System.out.println("attendu 0: " + triangle.triangleM(min,min,min));
	}
	@Test
	public void test15(){
		System.out.println("test un triangle isocele avec les valeurs maximales");
		assertEquals(2, triangle.triangleM(max,max,3));
		System.out.println("attendu 2: " + triangle.triangleM(max,max,3));
	}
	@Test
	public void test16(){
		System.out.println("test un triangle isocele avec les valeus minimales");
		assertEquals(0, triangle.triangleM(min,min,3));
		System.out.println("attendu 0: " + triangle.triangleM(min,min,3));
	}
	@Test
	public void test17(){
		System.out.println("test un triangle isocele avec les valeus maximales");
		assertEquals(2, triangle.triangleM(max,3,max));
		System.out.println("attendu 2: " + triangle.triangleM(max,3,max));
	}
	@Test
	public void test18(){
		System.out.println("test un triangle isocele avec les valeus maximales");
		assertEquals(2, triangle.triangleM(max,max,3));
		System.out.println("attendu 2: " + triangle.triangleM(max,max,3));
	}
	@Test
	public void test19(){
		System.out.println("test un triangle isocele avec les valeus maximales");
		assertEquals(2, triangle.triangleM(3,max,max));
		System.out.println("attendu 2: " + triangle.triangleM(3,max,max));
	}
	@Test
	public void test20(){
		System.out.println("test un triangle isocel avec les valeus minimales");
		assertEquals(0, triangle.triangleM(min,3,min));
		System.out.println("attendu 0: " + triangle.triangleM(min,3,min));
	}
	@Test
	public void test21(){
		System.out.println("test un triangle isocele avec les valeus minimales");
		assertEquals(0, triangle.triangleM(3,min,min));
		System.out.println("attendu 0: " + triangle.triangleM(3,min,min));
	}
	

}
