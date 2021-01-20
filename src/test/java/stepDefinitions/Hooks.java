package stepDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class Hooks {

    //cleanup part
    //will be executed after every test scenario
    //to close browser

    @Before
    public void setup() throws InterruptedException {
        //String url = ConfigurationReader.getProperty("url");
        //getDriver().get(url);//to open login page

    }



    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()){
            final byte[] screenshot =((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png",scenario.getName());
        }
        System.out.println("Closing browser");
        Driver.closeDriver();
    }
}
