package TrignometricTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.CalBase;

public class SinTest extends CalBase{

	
	@Test(dataProvider ="SinpositivetiveDataProvider",groups={"Trigonometric","positive"})
	public void sinpositiveTest(double a,double expected) {
		double sinValue=cal.sin(a);
		Assert.assertEquals(sinValue, expected, "Method 'sinTest' did not return expected value");
	}
	
	@Test(dataProvider ="SinnegativeDataProvider",groups={"Trigonometric","negative"})
	public void sinnegativeTest(double a,double expected) {
		double sinValue=cal.sin(a);
		Assert.assertEquals(sinValue, expected, "Method 'sinTest' did not return expected value");
	}
	
	 @DataProvider(name="SinpositivetiveDataProvider")
	 public static Object[][] SinpositivetiveDataProvider() {
	        return new Object[][]{
	        	{Math.PI, 0},
                {Math.PI / 2, 1},
	        };
	    }
	 @DataProvider(name="SinnegativeDataProvider")
	 public static Object[][] SinnegativeDataProvider() {
	        return new Object[][]{
                {-Math.PI / 2, -1},
	        	{2*Math.PI, 0}
	        };
	    }
}
