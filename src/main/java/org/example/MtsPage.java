package org.example;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MtsPage {
 private WebDriver driver;

 private By connectionServicesTab = By.xpath("//span[text()='Услуги связи']");
 private By homeInternetTab = By.xpath("//a[contains(@class, 'home-internet')]");
 private By installmentTab = By.xpath("//span[text()='Рассрочка']");
 private By arrearsTab = By.xpath("//span[text()='Задолженность']");

 private By phoneNumberInput = By.id("connection-phone");
 private By emailInput = By.id("connection-email");
 private By sumInput = By.id("connection-sum");
 private By continueButton = By.xpath("//button[text()='Продолжить']");

 public MtsPage(WebDriver driver) {
 this.driver = driver;
 }

 @Step("Клик по вкладке Услуги связи")
 public MtsPage clickConnectionServices() {
 driver.findElement(connectionServicesTab).click();
 return this;
 }

 @Step("Клик по вкладке Домашний интернет")
 public MtsPage clickHomeInternet() {
 driver.findElement(homeInternetTab).click();
 return this;
 }

 @Step("Клик по вкладке Рассрочка")
 public MtsPage clickInstallment() {
 driver.findElement(installmentTab).click();
 return this;
 }

 @Step("Клик по вкладке Задолженность")
 public MtsPage clickArrears() {
 driver.findElement(arrearsTab).click();
 return this;
 }

 @Step("Ввод номера телефона: {phone}")
 public MtsPage enterPhone(String phone) {
 driver.findElement(phoneNumberInput).sendKeys(phone);
 return this;
 }

 @Step("Ввод e-mail: {email}")
 public MtsPage enterEmail(String email) {
 driver.findElement(emailInput).sendKeys(email);
 return this;
 }

 @Step("Ввод суммы: {sum}")
 public MtsPage enterSum(String sum) {
 driver.findElement(sumInput).sendKeys(sum);
 return this;
 }

 @Step("Нажатие кнопки Продолжить")
public void clickContinue() {
 driver.findElement(continueButton).click();
 }
}
