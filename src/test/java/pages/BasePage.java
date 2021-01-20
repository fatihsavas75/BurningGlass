package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static utilities.ConfigurationReader.getProperty;
import static utilities.Driver.getDriver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void openBasePage() {
        String url = getProperty("url");
        getDriver().get(url);
        getDriver().manage().window().fullscreen();
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void scrollToFrames(List<WebElement> iframes) throws InterruptedException {
        Actions action=new Actions(getDriver());
        action.moveToElement(iframes.get(1)).perform();
        Thread.sleep(2000);
    }

    public void click(WebElement element){
    element.click();
    }

}
