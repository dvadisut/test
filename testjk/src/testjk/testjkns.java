package testjk;  //this is sampletest done by dhinakaran for jenkins testing DV DV DV DV

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

//@Test
public class testjkns {

	public static void main(String[] args)  {
		//System.out.println("This is my first commit message");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumeasy.com/test/basic-first-form-demo.html");
        System.out.println("This is completed");
		
	}
}
