package demo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions; 



public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
    /*
     *  1. Launch the chrome browser 
        2. Go to the driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform")
        Google Forms by using driver.get() method.
        3. write this xpath //div[@class=\"rFrNMe k3kHxc RdH0ib yqQS1 zKHdkd\"]/div[1]/div[1]/div[1]/input to locate and enter name and covert a epoch time to current time
        4. get the Locator for How much experience do you have in Automation Testing
        5. execte x path for this Which of the following have you learned in Crio.Do for Automation Testing with ID: i22,i30,i33,i36
        6. Scroll down to the question How should you be addressed and find element for to type MR.
        7.Scroll down to the question What was the date 7 days ago and select calander and convert today's date to -7.
        8.find element for What is the time right now and sendkeys the current time.
        9.And print the sumit button using this element //span[contains(text(),'Submit')]" .
        10.Finally print the Thanks for your response, Automation Wizard! message in console.
     */

    
    public  void testCase01() throws InterruptedException{

        System.out.println("Start Test case: testCase01");
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
        System.out.println("end Test case: testCase01");
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.xpath("//div[@class=\"rFrNMe k3kHxc RdH0ib yqQS1 zKHdkd\"]/div[1]/div[1]/div[1]/input"));
        name.sendKeys("sai charan k");
       
       
        WebElement  practicingAutomation = driver.findElement(By.xpath("//textarea[@class='KHxj8b tL9Q4c']"));
        Long date=1715515721L;

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String convertedDate = sdf.format(new java.util.Date (date*1000));


        practicingAutomation.sendKeys("I want to be the best QA Engineer! " + convertedDate);
        

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,500)");

        driver.findElement(By.id("i22")).click();

        driver.findElement(By.id("i30")).click();
        driver.findElement(By.id("i33")).click();
        driver.findElement(By.id("i36")).click();
        driver.findElement(By.id("i39")).click();
     
        Thread.sleep(2000);

        WebElement addresed =  driver.findElement(By.xpath("//div[@class = 'MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']"));
        addresed.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Mr']")).click();

        Thread.sleep(2000);


        js.executeScript("window.scrollTo(0,900)");

        Thread.sleep(2000);


        Actions actions = new Actions(driver);

        long timtam 
        = 1715515721L;
          
        
        long mlisec 
        = timtam * 1000;
        
    
        long neTimta
         = mlisec-(7*24*60*
        60*1000);
        
        Date newDte = new Date(neTimta);
        
        SimpleDateFormat sd 
        = 
        new
         SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String convertDate 
        = sd.format(newDte);

        actions.moveToElement(driver.findElement(By.xpath("//div[@class='rFrNMe yqQS1 hatWr zKHdkd']")))
        
        .click().sendKeys("2024").sendKeys(Keys.ARROW_LEFT).sendKeys("05").sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(convertDate).click().perform();
        
        driver.findElement(By.xpath("//div[@class='A6uyJd']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@jscontroller = 'OZjhxc']")).click();

        actions.moveToElement(driver.findElement(By.xpath("//input[@aria-label='Hour']"))).click().sendKeys("10").sendKeys(Keys.TAB).sendKeys("15").sendKeys(Keys.TAB).perform(); 


        Thread.sleep(2000);

        
        driver.get("https://www.amazon.in/");

        driver.switchTo().alert().dismiss();
        
        js.executeScript("window.scrollTo(0,900)");

        
        driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
        
        Thread.sleep(2000);

        System.out.println("Thanks for your response, Automation Wizard!");


    }


}

