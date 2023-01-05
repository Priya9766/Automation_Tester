package demoTestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	@Test
	public void method1()
	{
		System.out.println("Method1");
	}
	@BeforeMethod
public void method2()
{
	System.out.println("method2");
	}
	@AfterMethod
	public void method3()
	{
		System.out.println("Method3");
	}
	}
	


