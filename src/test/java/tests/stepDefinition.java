package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition {
	public WebDriver driver;
	@Given("open chrome browser")
	public void open_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Then("enter the URL")
	public void enter_the_url() {
		driver.get("https://www.google.co.in");
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}


}
