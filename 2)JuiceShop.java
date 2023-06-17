package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class JuiceShop {
	public static WebDriver driver;
	String URL = ("https://juice-shop.herokuapp.com/#/register");
	
	String email = "testjuiceshop71@gmail.com";
	By dissmissBtn = By.xpath("//span[text()='Dismiss']");
	By mewantitcookie = By.xpath("//a[text()='Me want it!']");
	By emailTxtBox = By.id("emailControl");
	By pwdTxtBox = By.id("passwordControl");
	By rptPwdTxtBox = By.id("repeatPasswordControl");
	By secQtnDropDown = By.xpath("//div[@id='mat-select-value-1']/span");
	By secQtnAns = By.xpath("//span[text()=' Your favorite book? ']");
	By ansTxtBox = By.id("securityAnswerControl");
	By registerBtn = By.id("registerButton");
	By emailbox = By.xpath("//input[@id='email']");
	By pwdbox = By.xpath("//input[@id='password']");
	By loginbtn = By.id("loginButton");
	By appju = By.xpath("//div[text()=' Apple Juice (1000ml) ']/../../..//span[text()='Add to Basket']");
	By carrot = By.xpath("//div[text()=' Carrot Juice (1000ml) ']/../../..//span[text()='Add to Basket']");
	By nextBtn = By.xpath("//button[@aria-label='Next page']");
	By girlietshirt = By.xpath("//div[text()=' OWASP Juice Shop CTF Girlie-Shirt ']/../../..//span[text()='Add to Basket']");
	By temptatoos = By.xpath("//div[text()=' OWASP Juice Shop Temporary Tattoos (16pcs) ']/../../..//span[text()='Add to Basket']");
	By yourBasket = By.xpath("//mat-icon[text()=' shopping_cart ']/..//span[text()=' Your Basket']");
	By addAppjuBtn = By.xpath("//img[@alt='Apple Juice (1000ml)']/../../mat-cell[3]/button[2][@class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted']");
	By addCarrotBtn = By.xpath("//img[@alt='Carrot Juice (1000ml)']/../../mat-cell[3]/button[2][@class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted']");
	By addGirlieTshirtBtn = By.xpath("//img[@alt='OWASP Juice Shop CTF Girlie-Shirt']/../../mat-cell[3]/button[2][@class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted']");
	By addTemptatoosBtn = By.xpath("//img[@alt='OWASP Juice Shop Temporary Tattoos (16pcs)']/../../mat-cell[3]/button[2][@class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted']");
	By checkoutBtn = By.id("checkoutButton");
	By newAddressBtn = By.xpath("//button[@class='mat-focus-indicator btn btn-new-address mat-button mat-raised-button mat-button-base mat-primary']");
	By countryTxtBox = By.xpath("//input[@ id='mat-input-7']");
	By nameTxtBox = By.xpath("//input[@ id='mat-input-8']");
	By mobileTxtBox = By.xpath("//input[@ id='mat-input-9']");
	By zipCodeTxtBox = By.xpath("//input[@ id='mat-input-10']");
	By addressTxtBox = By.id("address");
	By cityTxtBox = By.xpath("//input[@ id='mat-input-12']");
	By stateTxtBox = By.xpath("//input[@ id='mat-input-13']");
	By submitBtn = By.id("submitButton");
	By radioBtn = By.id("mat-radio-42");
	By continueBtn = By.xpath("//span[text()='Continue']");
	By deliveryRadioBtn=By.xpath("//label[@for='mat-radio-43-input']");
	By addNewCardDropDown = By.xpath("//mat-panel-title[text()=' Add new card ']");
	By nameOnCardTxtBox = By.xpath("//input[@ id='mat-input-14']");
	By cardNumberTxtBox = By.xpath("//input[@ id='mat-input-15']");
	By expiryMonthDropDown = By.xpath("//select[@ id='mat-input-16']");
	By expiryYearDropDown = By.xpath("//select[@ id='mat-input-17']");
	By addCoupon = By.xpath("//mat-panel-title[text()=' Add a coupon ']");
	By couponTxtBox = By.id("coupon");
	By redeemBtn = By.id("applyCouponButton");
	By radioSelectPayment = By.id("mat-radio-46");
	By accountButton = By.id("navbarAccount");
	By orderPaymentBtn = By.xpath("//button[@aria-label='Show Orders and Payment Menu']");
	By orderHistoryBtn = By.xpath("//span[text()=' Order History ']");
	By trackOrderBtn = By.xpath("//mat-icon[text()=' local_shipping ']");
	By printConfirmationBtn = By.xpath("//mat-icon[text()=' note ']");
	By logOutBtn = By.id("navbarLogoutButton");
	
	JuiceShop(WebDriver d){
		driver = d;
	}
	
	public void register() throws InterruptedException {
		driver.findElement(dissmissBtn).click();
		driver.findElement(mewantitcookie).click();
		driver.findElement(emailTxtBox).sendKeys(email);
		driver.findElement(pwdTxtBox).sendKeys("P@ssword4");
		driver.findElement(rptPwdTxtBox).sendKeys("P@ssword4");
		//Thread.sleep(500);
		driver.findElement(secQtnDropDown).click();
		driver.findElement(secQtnAns).click();
		driver.findElement(ansTxtBox).sendKeys("PS");
		driver.findElement(registerBtn).click();
		
	}
	public void login() {
		driver.findElement(emailbox).sendKeys(email);
		driver.findElement(pwdbox).sendKeys("P@ssword4");
		driver.findElement(loginbtn).click();
		
	}
	
	public void addItems() throws InterruptedException {
		driver.findElement(appju).click();
		//Thread.sleep(5000);
		scrollTo();
		driver.findElement(nextBtn).click();
		//Thread.sleep(5000);
		scrollUp(driver);
		driver.findElement(carrot).click();
		//Thread.sleep(5000);
		driver.findElement(girlietshirt).click();
		//Thread.sleep(2000);
		driver.findElement(nextBtn).click();
		//Thread.sleep(2000);
		scrollUp(driver);
		driver.findElement(temptatoos).click();
		//Thread.sleep(2000);
		driver.findElement(yourBasket).click();
		//Thread.sleep(2000);
		driver.findElement(addAppjuBtn).click();
		//Thread.sleep(1000);
		driver.findElement(addCarrotBtn).click();
		//Thread.sleep(1000);
		driver.findElement(addGirlieTshirtBtn).click();
		Thread.sleep(1000);
		driver.findElement(addTemptatoosBtn).click();
		//Thread.sleep(1000);
		driver.findElement(checkoutBtn).click();
		//Thread.sleep(1000);
		driver.findElement(newAddressBtn).click();
		//Thread.sleep(2000);
	}
	
	public void addAddress() throws InterruptedException {
		driver.findElement(countryTxtBox).sendKeys("USA");
		driver.findElement(nameTxtBox).sendKeys("Aadhira");
		driver.findElement(mobileTxtBox).sendKeys("9876543210");
		driver.findElement(zipCodeTxtBox).sendKeys("33332");
		driver.findElement(addressTxtBox).sendKeys("SW  65th St");
		driver.findElement(cityTxtBox).sendKeys("FLL");
		driver.findElement(stateTxtBox).sendKeys("FL");
		driver.findElement(submitBtn).click();
		//Thread.sleep(2000);
	}
		
	public void selectAddress() throws InterruptedException {	
		driver.findElement(radioBtn).click();
		driver.findElement(continueBtn).click();
		driver.findElement(deliveryRadioBtn).click();
		driver.findElement(continueBtn).click();
	}
	
	public void paymentOptions() throws InterruptedException {
		driver.findElement(addNewCardDropDown).click();
		driver.findElement(nameOnCardTxtBox).sendKeys("Aadhira");
		driver.findElement(cardNumberTxtBox).sendKeys("9754678935271629");
		//driver.findElement(expiryMonthDropDown).click();
		//expiryMonthDD.selectByVisibleText("7");
		Select expiryMonthDD = new Select (driver.findElement(expiryMonthDropDown));
		expiryMonthDD.selectByVisibleText("7");
		Select expiryYr = new Select (driver.findElement(expiryYearDropDown));
		expiryYr.selectByVisibleText("2083");
		driver.findElement(submitBtn).click();
		//Thread.sleep(1000);
		driver.findElement(addCoupon).click();
		driver.findElement(couponTxtBox).sendKeys("1234567891");
		driver.findElement(redeemBtn).click();
		scrollUp(driver);
		driver.findElement(radioSelectPayment).click();
		driver.findElement(continueBtn).click();
		driver.findElement(checkoutBtn).click();
		
	}
	
	public void accountVerification() throws InterruptedException {
		driver.findElement(accountButton).click();
		driver.findElement(orderPaymentBtn).click();
		driver.findElement(orderHistoryBtn).click();
		driver.findElement(trackOrderBtn).click();
		//Thread.sleep(1000);
		driver.navigate().back();
		//String Url1 = driver.getCurrentUrl();
		//System.out.println(Url1);
		String originalHandle = driver.getWindowHandle();
		driver.findElement(printConfirmationBtn).click();
		//Thread.sleep(2000);
		for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            driver.close();
	        }
	    }
		driver.switchTo().window(originalHandle);
		driver.findElement(accountButton).click();
		//Thread.sleep(1000);
		driver.findElement(logOutBtn).click();  
		
	}
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,-500)", "");
	}
	
	public void scrollTo() {
		WebElement scrollto = driver.findElement(nextBtn);
        new Actions(driver)
                .scrollToElement(scrollto)
                .perform();
	}

}
