package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	MyInteger testnumber = new MyInteger(3);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_get_iValue() {
		assertEquals(testnumber.getiValue(), 3);
	}
	
	@Test
	public void test_isEven() {
		assertFalse(testnumber.isEven());
	}
	
	@Test
	public void test_isOdd() {
		assertTrue(testnumber.isOdd());
	}
	
	@Test
	public void test_isPrime() {
		assertTrue(testnumber.isPrime());
	}
	
	@Test
	public void test_isEven_Static() {
		assertTrue(MyInteger.isEven(-52));
		assertFalse(MyInteger.isEven(13));
		assertTrue(MyInteger.isEven(1002));
		assertFalse(MyInteger.isEven(1003));
	}
	
	@Test
	public void test_isOdd_Static(){
		assertFalse(MyInteger.isOdd(-12));
		assertTrue(MyInteger.isOdd(313));
		assertFalse(MyInteger.isOdd(12));
		assertTrue(MyInteger.isOdd(-131));
	}
	
	@Test
	public void test_isPrime_Static() {
		assertFalse(MyInteger.isPrime(4));
		assertTrue(MyInteger.isPrime(31));
		assertFalse(MyInteger.isPrime(52));
		assertTrue(MyInteger.isPrime(59));
	}
	
	@Test
	public void test_isEven_MyInt() {
		assertFalse(MyInteger.isEven(testnumber));	
	}
	
	@Test
	public void test_isOdd_MyInt() {
		assertTrue(MyInteger.isOdd(testnumber));
	}
	
	@Test
	public void test_isPrime_MyInt() {
		assertTrue(MyInteger.isPrime(testnumber));
	}
	
	@Test
	public void test_equals() {
		assertTrue(MyInteger.equals(3));
		assertFalse(MyInteger.equals(4));
	} 
	
	@Test
	public void test_equals_MyInt() {
		assertTrue(MyInteger.equals(testnumber));
	}
}