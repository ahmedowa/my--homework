
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {
 private WebDriver driver;

 @BeforeEach
 public void setUp() {
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://mts.by");
}

 @Test
public void testBlockTitle() {
 WebElement title = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
 assertTrue(title.isDisplayed());
 }

 @Test
 public void testPaymentLogos() {
 WebElement belkart = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
 WebElement visa = driver.findElement(By.xpath("//img[@alt='Visa']"));
 WebElement verifiedByVisa = driver.findElement(By.xpath("//img[@alt='Verified by Visa']"));
 WebElement mastercard = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
 WebElement mastercardSecureCode = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));

 assertTrue(belkart.isDisplayed());
 assertTrue(visa.isDisplayed());
 assertTrue(verifiedByVisa.isDisplayed());
 assertTrue(mastercard.isDisplayed());
 assertTrue(mastercardSecureCode.isDisplayed());
 }

 @Test
public void testServiceLink() {
 WebElement link = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
 assertTrue(link.isDisplayed());
 link.click();
}

 @Test
 public void testSubmitForm() {
 driver.findElement(By.xpath("//input[@placeholder='Номер телефона']")).sendKeys("297777777");
 driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']")).sendKeys("test@mail.ru");
 driver.findElement(By.xpath("//input[@placeholder='Сумма']")).sendKeys("10");

 WebElement continueButton = driver.findElement(By.xpath("//button[text()='Продолжить']"));
 assertTrue(continueButton.isDisplayed());
 continueButton.click();
 }

 @AfterEach
 public void tearDown() {
 if (driver != null) {
 driver.quit();
 }
}
}
