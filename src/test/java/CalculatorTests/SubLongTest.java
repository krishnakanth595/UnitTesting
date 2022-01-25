package CalculatorTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.CalBase;

public class SubLongTest extends CalBase {
	
	@Test(dataProvider ="subpositiveLongData",groups={"Subtraction","positive"})
	public void subpositiveTestLong(long a,long b,long expected) {
		long sub=cal.sub(a, b);
		Assert.assertEquals(sub, expected, "Method 'SubTestLong' did not return expected value");
	}
	@Test(dataProvider ="subnegativeLongData",groups={"Subtraction","negative"})
	public void subnegativeTestLong(long a,long b,long expected) {
		long sub=cal.sub(a, b);
		Assert.assertEquals(sub, expected, "Method 'SubTestLong' did not return expected value");
	}
	
	 @DataProvider(name="subpositiveLongData")
	 public static Object[][] subpositiveLongData() {
	        return new Object[][]{
	                {1, 1, 0},
	                {5,2,3}
	        };
	    }
	 @DataProvider(name="subnegativeLongData")
	 public static Object[][] subnegativeLongData() {
	        return new Object[][]{
	                {1, -1, 2},
	                {-1, -1, 0}
	        };
	    }
}
