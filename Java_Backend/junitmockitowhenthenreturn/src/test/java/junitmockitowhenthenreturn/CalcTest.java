package junitmockitowhenthenreturn;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class CalcTest {
	
	static Calculator mockCalcObject;
	static int a,b;
	@BeforeClass
	public static void init() {

		// set EmployeeDAO mock object
		mockCalcObject = mock(Calculator.class);
//		a=5;
//		b=2;
		//when(mockCalcObject.add(a,b)).thenReturn(a+b);
		when(mockCalcObject.sub(a,b)).thenReturn(5);
	}
	
	
	 
//	@Test
//	public void addTest() 
//	{
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		assertSame(mockCalcObject.add(a, b),5);
//		//assertEquals(mockCalcObject.add(a, b),5);
//		
//	}
	
	@Test
	public void subTest() {
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		assertSame(mockCalcObject.sub(a, b),5);
		//assertEquals(mockCalcObject.add(a, b),5);
	
	}
}