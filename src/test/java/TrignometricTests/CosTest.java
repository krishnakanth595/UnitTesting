package TrignometricTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.CalBase;

public class CosTest extends CalBase{

	
	@Test(dataProvider ="CospositivetiveDataProvider",groups={"Trigonometric","positive"})
	public void cospositiveTest(double a,double expected) {
		double cosValue=cal.cos(a);
		Assert.assertEquals(cosValue, expected, "Method 'cosTest' did not return expected value");
	}
	
	@Test(dataProvider ="CosnegativeDataProvider",groups={"Trigonometric","negative"})
	public void cosnegativeTest(double a,double expected) {
		double cosValue=cal.cos(a);
		Assert.assertEquals(cosValue, expected, "Method 'cosTest' did not return expected value");
	}
	
	 @DataProvider(name="CospositivetiveDataProvider")
	 public static Object[][] CospositiveDataProvider() {
	        return new Object[][]{
	        	{Math.PI, -1},
                {Math.PI / 2, 0},
	        };
	    }
	 @DataProvider(name="CosnegativeDataProvider")
	 public static Object[][] CosnegativeDataProvider() {
	        return new Object[][]{
                {-Math.PI / 3, -0.5},
	        	{2*Math.PI, 1}
	        };
	    }
}
