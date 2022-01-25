package CalculatorTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilities.CalBase;

public class DivTest extends CalBase{	
	
	@Test(dataProvider ="divpositiveLongData",groups={"Division","positive"})
	public void DivpositiveTestLong(long a,long b,long expected) {
		long sum=cal.div(a, b);
		Assert.assertEquals(sum, expected, "Method 'DivpositiveTestLong' did not return expected value");
	}
	
	@Test(expectedExceptions = NumberFormatException.class,groups={"Division","negative"})
	public void DivbyZero() {
		long sumdiv=cal.div(5, 0);
		System.out.println(sumdiv);
	}
	
	
	 @DataProvider(name="divpositiveLongData")
	 public static Object[][] divpositiveLongData() {
	        return new Object[][]{
	                {1, 1, 1},
	                {5,2,2}
	        };
	    }
	 
	
}
