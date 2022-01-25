package utilities;

import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;

public class CalBase {
	
    protected Calculator cal;

   
    @BeforeClass(description = "Before class preparations")
    public void beforeClass() {
        System.out.println("Class started: " + getClass());
        System.out.println("Create instance of Calculator");
         cal = new Calculator();
    }
}
