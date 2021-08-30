package testjk;  //this is sample

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testjkns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	}

}
