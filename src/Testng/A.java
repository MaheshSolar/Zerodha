package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void TC() {
		Reporter.log("Hiii", true);
	}

}
