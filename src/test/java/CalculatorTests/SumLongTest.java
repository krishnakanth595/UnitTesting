package CalculatorTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.CalBase;

public class SumLongTest extends CalBase {
	
	@Test(dataProvider ="sumpositiveLongData",groups={"Addition","positive"})
	public void sumpositiveTestLong(long a,long b,long expected) {
		long sum=cal.sum(a, b);
		Assert.assertEquals(sum, expected, "Method 'SumTestLong' did not return expected value");
	}
	@Test(dataProvider ="sumnegativeLongData",groups={"Addition","positive"})
	public void sumnegativeTestLong(long a,long b,long expected) {
		long sum=cal.sum(a, b);
		Assert.assertEquals(sum, expected, "Method 'SumTestLong' did not return expected value");
	}
	
	 @DataProvider(name="sumpositiveLongData")
	 public static Object[][] sumpositiveLongData() {
	        return new Object[][]{
	                {1, 1, 2},
	                {5,2,7}
	        };
	    }
	 @DataProvider(name="sumnegativeLongData")
	 public static Object[][] sumnegativeLongData() {
	        return new Object[][]{
	                {1, -1, 0},
	                {-1, -1, -2}
	        };
	    }
}
