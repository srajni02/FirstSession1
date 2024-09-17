package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchSteps {

    WebDriver driver;

    @Given("User Validates the navigation to the Amazon page")
    public void Amazonhomepage() {

        driver = new ChromeDriver();
        this.driver.get("https://www.amazon.com/amazonprime");
        driver.manage().window().maximize();

    }

    @When("User Search the products")

    public void Amazonsearch () {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("home appliances");

    }

    @And("User Clicks the Search button")

    public void Searchclick () {
        driver.findElement(By.xpath("//input[@value='Go']")).click();


    }

    @Then("Validate search result is displayed")

    public void result () {

      String result =  driver.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']")).getText();
      System.out.println(result);


    }

    @When("User extracts all the values from the drop down")

    public void extractvaluedropdown () throws InterruptedException {
        WebElement dropdownelement = driver.findElement(By.xpath("//div[@class='nav-search-facade']/following-sibling::select[@id='searchDropdownBox' ]"));
        int dropdownSize = dropdownelement.findElements(By.tagName("option")).size();

        for (int i = 0; i < dropdownSize; i++) {

           String dropdownValue = dropdownelement.findElements(By.tagName("option")).get(i).getText();

           System.out.println(dropdownValue);

        }
    }

    @Then("Validate that title of the page")

    public void titlepage () {




    }


}
