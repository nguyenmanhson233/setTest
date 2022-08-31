package levunguyen.thucydides.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import levunguyen.thucydides.cucumber.steps.serenity.PhoneSerenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PhoneSteps {
    @Steps
    PhoneSerenity phoneSerenity;
    @Given("^Open home page$")
    public void openHomePage() {
        phoneSerenity.open_Home_Page();
    }

    @Then("^The website display Galaxy in phone category correct with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteDisplayGalaxyInPhoneCategoryCorrectWithAnd(String name,String price) throws Throwable {
        Assert.assertEquals(phoneSerenity.getGalaxyS6Name(),name);
        Assert.assertEquals(phoneSerenity.getGalaxyS6Price(),price);
    }

    @When("^Click on galaxy name$")
    public void clickOnGalaxyName() {
        phoneSerenity.click_Galaxy_Name();
    }

    @Then("^The website navigate to galaxy detail page correct with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteNavigateToGalaxyDetailPageCorrectWithAnd(String name, String description) throws Throwable {
        Assert.assertEquals(phoneSerenity.getGalaxyS6DetailsName(),name);
        Assert.assertEquals(phoneSerenity.getGalaxyS6Description(),description);
    }
}
