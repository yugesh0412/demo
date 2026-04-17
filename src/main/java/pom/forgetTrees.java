package pom;

import Base.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.baseclass.driver;

public class forgetTrees extends baseclass {

    public forgetTrees(WebDriver driver) {
          this.driver = driver;
          PageFactory.initElements(driver,this);
        }
        @FindBy(xpath="//input[@type='text']")
        public WebElement mobileNoFeild;

        @FindBy(xpath ="//span[text()='Continue']")
        public WebElement continueButton;

        public void entermoblienum(){
            mobileNoFeild.sendKeys("12345678901");
        }
        public void setContinueButton(){
            continueButton.click();
        }
}