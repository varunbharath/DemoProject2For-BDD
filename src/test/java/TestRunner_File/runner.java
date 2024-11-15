package TestRunner_File;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features={"src\\test\\java\\FeatureFiles\\"},
        dryRun=false,

        glue = {"Input_Steps","Hook"},
        //tags = ("smoke"),

        monochrome = true,
        plugin = {"pretty",
                "html:report/Cucumber-results.html",
                "json:report/Cucumber/result.json",
                "junit:report/Cucumber/result.xml"}

        // plugin     = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

        //  tags = ("sanity")
)







public class runner extends AbstractTestNGCucumberTests {
}



