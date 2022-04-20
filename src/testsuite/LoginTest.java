package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // Find the username field element
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        // Sending email to email field element
        usernameField.sendKeys("Prime123@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        // Sending Password to password field element
        passwordField.sendKeys("Prime123");

        //Find the login button and click on it
        WebElement loginButton1 = driver.findElement(By.xpath("//input[@class='button']"));
        loginButton1.click();

        String expectedMessage = "Accounts Overview";
        WebElement message = driver.findElement(By.xpath("//h1[@class='title']"));
        String actualMessage = message.getText();
        Assert.assertEquals("Accounts Overview is not displayed", expectedMessage, actualMessage);
    }
@Test
        public void verifyTheErrorMessage(){
    // Find the username field element
    WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
    // Sending email to email field element
    usernameField.sendKeys("Prime12@gmail.com");

    // Find the password field element
    WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
    // Sending Password to password field element
    passwordField.sendKeys("Prime12");

    //Find the login button and click on it
    WebElement loginButton1 = driver.findElement(By.xpath("//input[@class='button']"));
    loginButton1.click();

    String expectedMessage = "The username and password could not be verified.";
    WebElement message = driver.findElement(By.xpath("//p[contains(text(),'The username and password could not be verified.')]"));
    String actualMessage = message.getText();
    Assert.assertEquals("Accounts Overview is displayed", expectedMessage, actualMessage);
}
@Test
    public void userShouldLogOutSuccessfully(){
    // Find the username field element
    WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
    // Sending email to email field element
    usernameField.sendKeys("Prime123@gmail.com");

    // Find the password field element
    WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
    // Sending Password to password field element
    passwordField.sendKeys("Prime123");

    //Find the login button and click on it
    WebElement loginButton1 = driver.findElement(By.xpath("//input[@class='button']"));
    loginButton1.click();

    //find the logout button and click on it
    WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
    logout.click();

   // customer login page display
    String expectedMessage = "Customer Login";
    WebElement message = driver.findElement(By.xpath("//h2[contains(text(),'Customer Login')]"));
    String actualMessage = message.getText();
    Assert.assertEquals("Customer Login is not displayed", expectedMessage, actualMessage);
}
}






