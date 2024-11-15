package Input_Steps;

import driver.driverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class inputfields extends driverInstance {
    @Given("User click on Marketing Department")
    public void user_click_on_marketing_department() {
driver.findElement(By.xpath("//input[@value=0]")).click();
    }
    @Given("User should able to click on Sales")
    public void user_should_able_to_click_on_sales() {
driver.findElement(By.xpath("//input[@value=1]")).click();
    }
    @Given("User should ble to click on Customer Service")
    public void user_should_ble_to_click_on_customer_service() {
        driver.findElement(By.xpath("//input[@value=2]")).click();

    }
    @Given("User should enter the Subject as {string}")
    public void user_should_enter_the_subject_as(String Subject) {
driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(Subject);
    }
    @Given("User should enter the E-mail Addres as {string}")
    public void user_should_enter_the_e_mail_addres_as(String mailid1) {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mailid1);

    }
    @Given("User should enter the Text Box Field as {string}")
    public void user_should_enter_the_text_box_field_as(String textboxfield) {
driver.findElement(By.xpath("//input[@name='q1']")).sendKeys(textboxfield);
    }
    @Given("User should enter the Text Box - Multi Line {string}")
    public void user_should_enter_the_text_box_multi_line(String multiline) {
       driver.findElement(By.xpath("//textarea[@name='q2']")).sendKeys(multiline);


    }
    @Given("User should select the dropdown")
    public void user_should_select_the_dropdown() {

        WebElement drop=driver.findElement(By.xpath("//select[@id='q3']"));
        Select value=new Select(drop);
        value.selectByIndex(3);
        System.out.println("value of the first dropdown"+value);

    }
    @Given("User Should Select the date")
    public void user_should_select_the_date() {
  // WebElement picker=driver.findElement(By.xpath("//input[@id='q7']")).sendKeys(a);
        Date currentdate=new Date();
        SimpleDateFormat stored=new SimpleDateFormat("dd-MM-YYYY");
        String a=stored.format(currentdate);
        System.out.println(a);
        WebElement picker= driver.findElement(By.xpath("//input[@id='q7']"));
        picker.sendKeys(a);
    }
    @When("User Click on Submitbutton")
    public void user_click_on_submitbutton() {
      WebElement submitbutton= driver.findElement(By.xpath("//input[@name='submit']"));
        boolean check=submitbutton.isEnabled();
        if(check==true) {
            System.out.println("Submit Button is enabled");
        }
        else {
            System.out.println("Submit Button is notenabled");
        }
    }
}
