package stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
		
	@Given("browser is open")
	//@Test
	public void browser_is_open() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String googleURL = driver.getCurrentUrl();
		System.out.println("URL loaded: " + !googleURL.isEmpty());
		driver.quit();
	}

	@And("user is on google search page")
	//@Test
	public void user_is_on_google_search_page() {
		System.out.println("on google search page");
	}

	//@Test
	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.quit();
	}

	//@Test
	@And("user hits enter")
	public void user_hits_enter() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
		
	}

	//@Test
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://www.google.com/search?q=Automation+Step+by+Step&source=hp&ei=KYXcYZHBK4OGtQb2hbmwCw&iflsig=ALs-wAMAAAAAYdyTOSpKpkY-0YSdq8L8Zk9Nf92upf3n&ved=0ahUKEwjR-Z738af1AhUDQ80KHfZCDrYQ4dUDCAg&oq=Automation+Step+by+Step&gs_lcp=Cgdnd3Mtd2l6EAwyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEUABYSmC6AWgAcAB4AYABXYgBxwKSAQE0mAEAoAEB&sclient=gws-wiz";
		assertTrue(url.equals(driver.getCurrentUrl()));
		driver.close();
		driver.quit();
	}
}
