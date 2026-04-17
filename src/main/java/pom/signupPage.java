package pom;

import Base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signupPage extends baseclass {

    public By moblieusname = By.xpath("//input[@inputmode='text']");
    public By enterpassword = By.xpath("//input[@type='password']");
    public By month = By.xpath("//span[text()='Month']");
    public By months = By.xpath("//div[text()='April']");
    public By Day = By.xpath("//span[text()='Day']");
    public By Day1 = By.xpath("//div[text()='12']");
    public By Year = By.xpath("//span[text()='Year']");
    public By year1 = By.xpath("//div[text()='2001']");
    public By username = By.xpath("(//input[@type='text'])[2]");
    public By already = By.xpath("//span[text()='I already have an account']");


    public void enteralldetail() throws InterruptedException {
        //usrname
        WebElement name = driver.findElement(moblieusname);
        name.sendKeys("yugeshwaran@KPY.com");
        //password
        WebElement pass1 = driver.findElement(enterpassword);
        pass1.sendKeys("1@2#3$4%5^6&7*8(90)1!");
        //mont
        scrollto(0, 100);
        WebElement scr = driver.findElement(month);
        WebElement mont = driver.findElement(month);
        //month click
        scrollusingForClick(driver,month);
        scrollusingForClick(driver,months);
        //day
        WebElement d = driver.findElement(Day);
        WebElement d1 = driver.findElement(Day1);
        //day click
        scrollusingForClick(driver,Day);
        scrollusingForClick(driver,Day1);
        //year
        WebElement y = driver.findElement(Year);
        WebElement y1 = driver.findElement(year1);
        //year click
        scrollusingForClick(driver,Year);
        scrollusingForClick(driver,year1);
        //fullname
        WebElement name1 = driver.findElement(username);
        name1.sendKeys("YugeshWaran P");
        //already click another button
        WebElement alrhave = driver.findElement(already);
        scrollusingForClick(driver,already);
    }
    public void clickTheano() throws InterruptedException {
        WebElement already2 = driver.findElement(already);
        already2.click();
    }
    @FindBy(xpath="//input[@type='text']")
    public WebElement mobileNoFeild;

    @FindBy(xpath ="//span[text()='Continue']")
    public WebElement continueButton;

    public void entermoblienum() throws InterruptedException {
        Thread1();
        mobileNoFeild.sendKeys("12345678901");
    }
    public void setContinueButton(){
        continueButton.click();
    }

}
