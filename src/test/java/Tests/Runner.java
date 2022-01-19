package Tests;

import TejaUtilities.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {
    WebDriver driver;
   @BeforeMethod
    public void before(){
       driver=DriverFactory.type("chrome");

      GetData getData=new GetData();
      getData.capture(driver,"chrome");

       String url="https://teja54-dev-ed--jbcxm.visualforce.com/apex/GSHome?sfdc.tabName=01r5g000000hlMe#/analyze/view/57b22b14-3dff-4493-88e4-12ad9504b5e8";
       System.out.println("User is on the login page");
       driver.get(url);
       driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("teja@gs.com");
       driver.findElement(By.id("password")).sendKeys("gainsight123");
       driver.findElement(By.id("Login")).click();
       try {
           Thread.sleep(30000);
       }catch (Exception e){

       }

   }
   @Test
    public void test(){

       System.out.println("Runninhg");



   }
}
