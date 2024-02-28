package StepDefinitions;

import Pages.FlyPgsHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import sun.text.resources.cldr.yav.FormatData_yav;
import util.DriverFactory;

public class FlyPgsTaskDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    FlyPgsHomePage flyPgsHomePage=new FlyPgsHomePage(driver);


    @Given("User is on Flypgs site")
    public void userIsOnFlypgsSite() {
        System.out.println("Before Action will do this step");

    }

    @When("Accept cookies")
    public void acceptCookies() {
        FlyPgsHomePage.acceptinCookies();
    }

    @When("Select One way flight")
    public void selectOneWayFlight() {
        FlyPgsHomePage.selectingOneWayFlight();
    }

    @When("Select from location")
    public void selectFromLocation() {
        FlyPgsHomePage.selectingToLocation();
    }

    @When("Type IGA")
    public void typeIGA() {
        FlyPgsHomePage.writeIGA();
    }

    @When("Select Istanbul airport")
    public void selectIstanbulAirport() {
        FlyPgsHomePage.selectingIGA();
    }

    @When("Select to location")
    public void selectToLocation() {
        FlyPgsHomePage.selectingToSection();
    }

    @When("Type Izmir")
    public void typeIzmir() {
        FlyPgsHomePage.writeIzmirAirport();
    }

    @When("Select Izmir airport")
    public void selectIzmirAirport() {
        FlyPgsHomePage.selectingIzmirAirport();
    }

    @When("Click to Search flights button")
    public void clickToSearchFlightsButton() {
        FlyPgsHomePage.searchingFlights();
    }

    @When("Click to Filter icon")
    public void clickToFilterIcon() {
        FlyPgsHomePage.clickTofilterIcons();
    }

    @When("Search Price option")
    public void searchPriceOption() {
        FlyPgsHomePage.clickingPriceOption();
    }

    @When("Select the first object")
    public void selectTheFirstObject() {
        FlyPgsHomePage.clickingFirstFlight();
    }
}
