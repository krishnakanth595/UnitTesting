package CalculatorTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.CalBase;

public class SumDoubleTest extends CalBase{

	
	@Test(dataProvider ="sumpositiveDoubleData", groups={"Addition","positive"})
	public void sumpositiveTestDouble(double a,double b,double expected) {
		double sum=cal.sum(a, b);
		System.out.println(sum);
		Assert.assertEquals(sum, expected, "Method 'SumTestDouble' did not return expected value");
	}
	@Test(dataProvider ="sumnegativeDoubleData", groups={"Addition","negative"})
	public void sumnegativeTestDouble(double a,double b,double expected) {
		double sum=cal.sum(a, b);
		System.out.println(sum);
		Assert.assertEquals(sum, expected, "Method 'SumTestDouble' did not return expected value");
	}
	
	 @DataProvider(name="sumpositiveDoubleData")
	 public static Object[][] sumpositiveDoubleData() {
	        return new Object[][]{
	                {1.5, 2.5, 4.0},
	                {0, 0, 0.0}               
	        };
	    }
	 @DataProvider(name="sumnegativeDoubleData")
	 public static Object[][] sumnegativeDoubleData() {
	        return new Object[][]{
	                {-1.5, -2.5, -4.0},
	                {1.5, -2.5, -1.0}               
	        };
	    }
}
