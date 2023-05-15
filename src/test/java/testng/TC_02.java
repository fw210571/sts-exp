package testng;

import org.testng.annotations.Test;

public class TC_02 {
	@Test(groups = {"smoke"})
	
	public void testing2(){
		System.out.println("from class name - 'tc_2' | where groups = {\"smoke\"}");
	}
	@Test()
	public void testing3() {
		System.out.println("___");
	}
}
