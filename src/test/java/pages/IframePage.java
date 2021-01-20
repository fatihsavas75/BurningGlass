package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static utilities.ConfigurationReader.getProperty;
import static utilities.Driver.getDriver;

public class IframePage extends BasePage {

    @FindBy(tagName = "iframe")
    public List<WebElement> iframes;

    public void openPage(){
        openBasePage();
    }


    public void countFrames(int count){
        Assert.assertEquals(count,iframes.size());
    }

    public void swithcToFrame()  {

        WebDriverWait wait=new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframes.get(0)));
    }

    public void scrollToFrame() throws InterruptedException {
        scrollToFrames(iframes);
    }



    public void checkTitle(String title){
        String title1 = getDriver().getTitle();
        Assert.assertEquals(title,title1);
    }

    public void switchToMainPage(){
        getDriver().switchTo().defaultContent();
    }
}
