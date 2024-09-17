package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceHomePageSteps {

    WebDriver driver;

    @Given("User navigates to the Sales Force Login Page")

    public void homePage (){


        driver = new ChromeDriver();
        this.driver.get("https://login.salesforce.com/");


    }

    @When("User enters the Username {string} and Password {string}")

    public void enterusernamepass (String Username, String Password) {

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);


    }

    @And("User Clicks the Login button")

    public void login () {

        driver.findElement(By.xpath("//input[@type='submit']")).click();


    }

    @Then("User Validates the navigation to the homepage")

    public void successlogin () {


    }

    @Then("User Validates the Error message")
    public void ValidateErrorMessage() {

        driver.findElement(By.xpath("//div[@class = 'loginError']")).getText();
        System.out.println("Error is displayed");

    }
}
