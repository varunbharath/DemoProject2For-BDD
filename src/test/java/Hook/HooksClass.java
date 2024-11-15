package Hook;

import driver.driverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class HooksClass extends driverInstance {
    @Before
    public void browsersetup(Scenario scenario){

        System.setProperty("webdriver.chrome.driver","C:\\BDD_Chrome\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.mycontactform.com/samples.php");
    }
    @After
    public void stopbroswer(Scenario scenario) throws IOException, InterruptedException
    {
        boolean failed = scenario.isFailed();
        System.out.println("Is failed: "+failed);
        if(!scenario.isFailed())
        {        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshot);

            scenario.attach(fileContent, "image/png", scenario.getName());
        }

        Thread.sleep(3000);
        driver.quit();
}}
