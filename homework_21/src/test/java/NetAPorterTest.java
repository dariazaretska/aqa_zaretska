import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.*;

public class NetAPorterTest {
    private static WebDriver driver;
    private final String baseUrl = "https://www.net-a-porter.com/";
    @BeforeTest
    public static void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void acceptCookiesClosePopup() {
        driver.get(baseUrl);
        WebElement closePopup = driver.findElement(By.xpath("//button[@id='footer_tc_privacy_button_2']"));
        closePopup.click();
    }

    @Test
    public void searchItems() throws InterruptedException {
        driver.get(baseUrl);
        WebElement tapSearch = driver.findElement(By.xpath("//div[@class='SearchPanel2__wrapper']"));
        tapSearch.click();
        Thread.sleep(3000);
        WebElement inputSearch = driver.findElement(By.xpath("//input[@class='SearchOverlay2__input']"));
        inputSearch.sendKeys("fffffff");
        Thread.sleep(3000);
        WebElement errorText = driver.findElement(By.xpath
                ("//div[@class='NoSearchResults2__content NoSearchResults2__content--title']"));
        assertTrue(errorText.isDisplayed());
        assertEquals(errorText.getText(), "Sorry, there are no results for" );
    }

    @Test
    public void itemsContainsPrices() throws InterruptedException {
        driver.get(baseUrl);
        WebElement tapSearch = driver.findElement(By.xpath("//div[@class='SearchPanel2__wrapper']"));
        tapSearch.click();
        Thread.sleep(3000);
        WebElement inputSearch = driver.findElement(By.xpath("//input[@class='SearchOverlay2__input']"));
        inputSearch.sendKeys("dress");
        Thread.sleep(3000);
        List<WebElement> price = driver.findElements(By.xpath("//span[@itemprop='price']"));
        boolean allPricesContainEuro = price.stream()
                .map(WebElement::getText)
                .allMatch(priceText -> priceText.contains("€"));
        assert allPricesContainEuro : "Not all prices contain € sign.";
    }

    @Test
    public void testAddToCartWithoutSelectedSize() throws InterruptedException {
        driver.get("https://www.net-a-porter.com/en-cz/shop/product/max-mara/clothing/long/nuevo-teddy-oversized-double-breasted-alpaca-cashmere-and-silk-blend-coat/1647597320324760");
        WebElement closePopup = driver.findElement(By.xpath("//button[@id='footer_tc_privacy_button_3']"));
        closePopup.click();
        Thread.sleep(3000);
        WebElement addToCartButton = driver.findElement(By.xpath
                ("//button[@class='Button10 Button10--primary AsyncButton10 CTAButtons87__addToBag primaryButton']"));
        addToCartButton.click();
        Thread.sleep(3000);
        WebElement errorSizeSelectText = driver.findElement(By.xpath
                ("//span[@class='SizeSelect87__sizeHeadingSelectSizeError']"));
        assertTrue(errorSizeSelectText.isDisplayed());
        assertEquals(errorSizeSelectText.getText(), "Please select a size" );
    }
}
