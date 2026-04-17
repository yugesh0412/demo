package stepDef;

import Base.baseclass;
import io.cucumber.java.en.*;
import pom.forgetTrees;
import pom.loginPage;
import pom.signupPage;

import java.io.IOException;

public class stepDefclass extends baseclass {
    loginPage login = new loginPage();
    signupPage uppage = new signupPage();
    forgetTrees restpage = new forgetTrees(driver);

    @Given("open the browser")
    public void open_the_browser() throws InterruptedException {
    }

    @Then("enter the url")
    public void enter_the_url() throws InterruptedException, IOException {
        url("https://www.instagram.com/");
        screenshot("inst");
    }

    @When("enter the username")
    public void enter_the_username() {
        login.enterUserName();
    }

    @When("enter the password")
    public void enter_the_password() {
        login.enterthepassword();
    }

    @Then("click the login button")
    public void click_the_login_button() throws InterruptedException {
        login.clicktheloginBtn();
        Thread1();
    }
    @Then("click the create the new account button")
    public void click_the_create_the_new_account_button() throws InterruptedException {
        login.createNewAcc();
        Thread1();
    }
    @Then("enter the alldetails")
    public void enter_the_alldetails() throws InterruptedException {
        Thread1();
        uppage.enteralldetail();
    }
    @Then("click the submitButton")
    public void click_the_submit_button() {
    }
    @Then("click the AlreadyButton")
    public void click_the_already_button() throws InterruptedException {
        Thread1();
        uppage.click();
    }
    @Then("enter the mobile")
    public void enter_the_mobile() throws InterruptedException {
         Thread1();
        restpage.entermoblienum();
    }
    @Then("click the continueButton")
    public void click_the_continue_button() {
         restpage.setContinueButton();
    }

   //2
    @When("enter the username {string}")
    public void enter_the_username(String string) {
       login.enterUserName1(string);
    }

    @When("enter the password {string}")
    public void enter_the_password(String string) {
        login.enterthepassword1(string);
    }

    @Then("verify the login result")
    public void verify_the_login_result() {

    }
}