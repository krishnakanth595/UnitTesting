package CalculatorTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import utilities.CalBase;

public class SubDoubleTest extends CalBase {

	
	@Test(dataProvider ="subpositiveDataProvider", groups={"Subtraction","positive"})
	public void subpositiveTestDouble(double a,double b,double expected) {
		double sub=cal.sub(a, b);
		Assert.assertEquals(sub, expected, "Method 'SubTestDouble' did not return expected value");
	}
	
	@Test(dataProvider ="subnegativeDataProvider", groups={"Subtraction","negative"})
	public void subnegativeTestDouble(double a,double b,double expected) {
		double sub=cal.sub(a, b);
		Assert.assertEquals(sub, expected, "Method 'SubTestDouble' did not return expected value");
	}
	
	 @DataProvider(name="subpositiveDataProvider")
	 public static Object[][] subpositiveDataProvider() {
	        return new Object[][]{
	                {2.5, 1.5, 1.0},
	                {3.0, 2.0, 1.0}               
	        };
	    }
	 
	 @DataProvider(name="subnegativeDataProvider")
	 public static Object[][] subnegativeDataProvider() {
	        return new Object[][]{
	                {1.5, 2.5, -1.0},
	                {-1.5, -2.5, 1.0}
	        };
	    }
}
