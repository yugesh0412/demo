package pom;

import Base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage extends baseclass {
    public By userName = By.name("email");
    public By enterthepassword = By.name("pass");
    public By loginbtn = By.xpath("//span[text()='Log in']");
    public By createnewacc = By.xpath("//span[text()='Create new account']");

    public void enterUserName(){
        WebElement name = driver.findElement(userName);
        name.sendKeys("yugeshwaran P");
    }

    public void enterthepassword(){
        WebElement pass = driver.findElement(enterthepassword);
        pass.sendKeys("12345678901");
    }
    public void enterUserName1(String uname){
        WebElement name = driver.findElement(userName);
        name.sendKeys(uname);
    }

    public void enterthepassword1(String pwd){
        WebElement pass = driver.findElement(enterthepassword);
        pass.sendKeys(pwd);
    }
    public void clicktheloginBtn(){
        WebElement login = driver.findElement(loginbtn);
        login.click();
    }
    public void createNewAcc(){
        WebElement clicknew = driver.findElement(createnewacc);
        clicknew.click();
    }
}
