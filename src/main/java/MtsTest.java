import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.MtsPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {
 private WebDriver driver;
 private MtsPage mtsPage;

 @BeforeEach
 public void setUp() {
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://mts.by");
 mtsPage = new MtsPage(driver);
 }

@Test
public void testMtsPlaceholders() {
 mtsPage.clickConnectionServices();
 assertTrue(driver.getCurrentUrl().contains("mts.by"));

 mtsPage.clickHomeInternet();
 assertTrue(driver.getCurrentUrl().contains("mts.by"));
 }

 @Test
 public void testMtsPayment() {
 mtsPage.clickConnectionServices()
 .enterPhone("297777777")
 .enterEmail("test@mail.ru")
 .enterSum("10")
 .clickContinue();
 }

 @AfterEach
 public void tearDown() {
if (driver != null) {
 driver.quit();
 }
 }
}
