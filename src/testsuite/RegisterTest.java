package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest  {

        String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

        @Before

        public void setUp() {
            openBrowser(baseUrl);
        }

        @Test

        public  void verifyThatSigningUpPageDisplay() {
            //Find the Register button and click on it
            WebElement registerButton = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
            registerButton.click();

            //This is from requirement
            String expectedMessage = "Signing up is easy!";

            // Find the sign up is easy! text
            WebElement actuleMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
            String actualMessage = actuleMessageElement.getText();
            // Validate actual and expected message
            Assert.assertEquals("Not navigate to Register page", expectedMessage, actualMessage);
        }
            @Test

                   public void userShouldRegisterAccountSuccessfully() {

                driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
                driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Sanket");
                driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("desai");
                driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("2,Mayfield");
                driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Harrow");
                driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Essex");
                driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("AB1 2CD");
                driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("12378945691");
                driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("123456789");
                driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("ricoke8218@hhmel.com");
                driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Prime123");
                driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("Prime123");
                driver.findElement(By.xpath("//input[@class='button']")).click();


                String expectedMessage = "Your account was created successfully. You are now logged in.";
                WebElement message = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));
                String actualMessage = message.getText();
                Assert.assertEquals("Registration page is not displayed", expectedMessage, actualMessage);

            }

            @After


            public void tearDown() {
                closeBrowser();
            }
        }


