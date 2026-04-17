package Base;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import static java.awt.SystemColor.text;

public class baseclass {
    public static WebDriver driver;
    public static Robot robot;
    public static Actions actions;
    public WebDriverWait wait;

    public static void openTheBrowser() {
        driver = new ChromeDriver();
    }

    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static void url(String url) {
        driver.get(url);
    }

    public static void implicityWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void screenshot(String img) throws IOException {
        TakesScreenshot ss = (TakesScreenshot) driver;
        File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
        File path = new File("C:\\Users\\Archana\\IdeaProjects\\cucumber25\\target\\Image\\" + img + ".png");
        Files.copy(screenshotAs, path);
    }

    public static void ssUsingWebelement(WebElement e, String img) throws IOException {
        File screenshotAs = e.getScreenshotAs(OutputType.FILE);
        File path = new File("C:\\Users\\Archana\\IdeaProjects\\cucumber25\\target\\Image\\" + img + ".png");
        Files.copy(screenshotAs, path);
    }
    public static void scrollby(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(a,b)");
    }
    public static void scrollto(int a,int b){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+a+","+b+")");
    }

    public static void scrollusingforelement(WebDriver driver,By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
    }
    public static void scrollusingForClick(WebDriver driver,By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);

    }

    public static void frameusingindex(int i){
        WebDriver frame = driver.switchTo().frame(i);
    }
    public static void frameusinglocator( WebDriver driver, By locator){
        WebElement framelo = driver.findElement(locator);
        driver.switchTo().frame(framelo);
    }

    public static void click() {
        WebElement element = driver.findElement(By.xpath("//p[text()='" + text + "']"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", element);
    }

    public static void sendkeyvalue(String value) {
        WebElement element = driver.findElement(By.id("dummy"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].value='arguments[1];", element, value);
    }

    public static void explicitwait(WebDriver driver, WebElement element) {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement product1 = wait1.until(ExpectedConditions.visibilityOf(element));
    }
    public static void Thread1() throws InterruptedException {
        Thread.sleep(3000);
    }
    public static void actionmouseover(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static void Actionclick() {
        actions = new Actions(driver);
        actions.click().perform();
    }

    public static void ActionContextclick() {
        actions = new Actions(driver);
        actions.contextClick().perform();
    }

    public static void ActionDoubleClick() {
        actions = new Actions(driver);
        actions.doubleClick().perform();
    }

    public static void ActionTribleClick() {
        actions = new Actions(driver);
        actions.doubleClick().click().perform();
    }

    public static void robotpress() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
    }

    public static void userName(String idpath) {
        driver.findElement(By.id(idpath)).sendKeys(Keys.ENTER);
    }
    public static void quit() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    //backtopage
    public static void backtopage(){
        driver.switchTo().defaultContent();
    }
    public static void simplealert(){

        Alert alert = driver.switchTo().alert();//dout
    }
}
