package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MtsPage {
 private WebDriver driver;

 private By connectionServicesTab = By.xpath("//span[text()='Услуги связи']");
 private By homeInternetTab = By.xpath("//span[text()='Домашний интернет']");
 private By installmentTab = By.xpath("//span[text()='Рассрочка']");
 private By arrearsTab = By.xpath("//span[text()='Задолженность']");

 private By phoneNumberInput = By.id("connection-phone");
 private By emailInput = By.id("connection-email");
 private By sumInput = By.id("connection-sum");
 private By continueButton = By.xpath("//button[text()='Продолжить']");

 public MtsPage(WebDriver driver) {
 this.driver = driver;
 }

 public MtsPage clickConnectionServices() {
 driver.findElement(connectionServicesTab).click();
 return this;
 }

 public MtsPage clickHomeInternet() {
 driver.findElement(homeInternetTab).click();
 return this;
 }

 public MtsPage clickInstallment() {
 driver.findElement(installmentTab).click();
 return this;
 }

 public MtsPage clickArrears() {
 driver.findElement(arrearsTab).click();
 return this;
 }

 public MtsPage enterPhone(String phone) {
 driver.findElement(phoneNumberInput).sendKeys(phone);
 return this;
 }
 public MtsPage enterEmail(String email) {
 driver.findElement(emailInput).sendKeys(email);
 return this;
 }

 public MtsPage enterSum(String sum) {
 driver.findElement(sumInput).sendKeys(sum);
 return this;
 }

 public void clickContinue() {
 driver.findElement(continueButton).click();
 }
}

