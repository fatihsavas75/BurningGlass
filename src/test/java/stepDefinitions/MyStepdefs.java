package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IframePage;

public class MyStepdefs {

     IframePage iframePage=new IframePage();

    @Given("user opens iframe url")
    public void userOpensIframeUrl() {
        iframePage.openPage();
    }

    @When("user switch to first frame")
    public void userSwitchToFirstFrame() throws InterruptedException {
        iframePage.swithcToFrame();
    }

    @And("user should see {string} as a title")
    public void userShouldSeeAsATitle(String arg0) {
        iframePage.checkTitle(arg0);
    }

    @Then("user returns to main page")
    public void userReturnsToMainPage() {
        iframePage.switchToMainPage();
    }


    @And("user should see {int} frames in the page")
    public void userShouldSeeFramesInThePage(int arg0) {
        iframePage.countFrames(arg0);
    }

    @And("user scroll to second frame")
    public void userScrollToSecondFrame() throws InterruptedException {
        iframePage.scrollToFrame();
    }
}
