package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchMultipleBrowsers {
	public WebDriver driver;
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	}

	@Then("enter the url")
	public void enter_the_url() {
		driver.get("https://www.google.co.in");
	}
	
	@Then("close Browser")
	public void close_browser() {
	    driver.close();
	}

	@Given("launch edge browser")
	public void launch_edge_browser() {
	  WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();
	}
	
	@Given("launch firefox browser")
	public void launch_firefox_browser() {
	  WebDriverManager.firefoxdriver().setup();
	  driver= new FirefoxDriver();
	}



}
