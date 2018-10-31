import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void checkIfPracujPlTitleIsCorrect(){
        String baseUrl = "http://www.pracuj.pl";
        String expectedTitle = "Oferty pracy - Pracuj.pl";

        driver.get(baseUrl);

        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}