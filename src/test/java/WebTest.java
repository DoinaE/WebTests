import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
    @Test
    public void testFirst() throws InterruptedException {
        //Arrange

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/doinita/browser_driver/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        //Act

        driver.get(url);
        Thread.sleep(3000);
        String actualResult = driver.getCurrentUrl();

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
        driver.close();
        driver.quit();


    }


}

