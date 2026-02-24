package steps;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSteps {
	
	WebDriver driver;
	
	@Given("I open Google")
	public void openGoogle(){
		
		driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		
		System.out.println("openGoogle method Running in Jenkins");
	}
	
	
	@Then("I verify the title contains {string}")
	public void verifyTitle(String expected){
		
		System.out.println("Test running...");
		Assert.assertTrue(driver.getTitle().contains(expected));
		
		System.out.println(driver.getTitle());
		System.out.println("Test closed by Ms. V");
		driver.quit();
		
	}
	
	

}
