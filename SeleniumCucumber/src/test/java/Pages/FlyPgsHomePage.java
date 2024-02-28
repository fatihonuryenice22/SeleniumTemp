package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverFactory;
import util.ElementHelper;

public class FlyPgsHomePage {

static WebDriver driver;
static ElementHelper elementHelper;
WebDriverWait wait;
static By acceptCookies= By.id("nxm2CookieSubmitButton");
static By oneWayFlight=By.xpath("//div[@id='search_cheap_one_way_button']");

    static By fromLocationt=By.xpath("//div[@class='nxm-360-search-selected-placeholder'][normalize-space()='Nereden']");
    static By iga=By.xpath("//li[@class='flySearch-airport-list-item-content nxm-360-search-select-airpot-list-li nxm-360-port_IST']//div[@class='nxm-360-search-select-airpot-list-area']//div[1]");
    static By toLocationt=By.xpath("//div[contains(text(),'Nereye')]");
    static By izmirAirportt=By.xpath("//ul[@class='flySearch-airport-list-content nxm-360-search-select-airpot-list-ul airports placeholder-loading']//div[@class='nxm-360-search-select-airpot-list-area-port'][contains(text(),'İzmir')]");
    static By searchButton=By.xpath("//button[@id='search_cheap_flight_search_button']");
    static By filterButton=By.xpath("//div[@class='flight-summary']//button[1]//div[1]");
    static By price=By.xpath("//span[normalize-space()='Fiyat']");
    static By firstFlight=By.xpath("//body/div[@id='root']/div[@id='page']/div[@class='page-content availability-page']/div[@id='boarding-card-body']/div[@id='availability-body']/div[@class='availability-body']/div[@class='flight-list departure-list']/div[@class='availability-list-container']/div[@id='availability-list']/div[1]/button[1]/div[1]/div[1]/div[1]/div[3]/div[2]");
    static By fromLocationTypeArea=By.xpath("//input[@id='deperture-input']");
    static By toLocationTypeArea=By.xpath("//input[@id='arrival-input']");
    static By arrivalDate=By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[4]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]");


public FlyPgsHomePage(WebDriver driver){
    this.driver = driver;
    this.wait= new WebDriverWait(driver,10);
    this.elementHelper= new ElementHelper(driver);
}

    public static void acceptinCookies() {
    elementHelper.click(acceptCookies);
    }

    public static void selectingOneWayFlight() {
    elementHelper.click(oneWayFlight);
    }

    public static void selectingToLocation() {
    elementHelper.click(fromLocationt);
    }

    public static void writeIGA() {

    elementHelper.findElement(fromLocationTypeArea).sendKeys("istanbul");
    }

    public static void selectingIGA() {
    elementHelper.click(iga);
    }

    public static void selectingToSection() {
    //elementHelper.click(toLocationt);
    }

    public static void writeIzmirAirport() {
    elementHelper.findElement(toLocationTypeArea).sendKeys("izmir");
    }

    public static void searchingFlights() {
    elementHelper.click(searchButton);
    }

    public static void clickTofilterIcons() {
    elementHelper.click(filterButton);
    }

    public static void selectingIzmirAirport() {
    elementHelper.click(izmirAirportt);
    elementHelper.click(arrivalDate);
    }

    public static void clickingPriceOption() {
    elementHelper.click(price);
    }

    public static void clickingFirstFlight() {
    elementHelper.click(firstFlight);

    }
}
