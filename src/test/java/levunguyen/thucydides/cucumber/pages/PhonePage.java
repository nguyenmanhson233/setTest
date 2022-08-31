package levunguyen.thucydides.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class PhonePage extends PageObject {
    @FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
    WebElementFacade galaxyS6Name;
    @FindBy(xpath = "//h5[contains(text(),'$360')]")
    WebElementFacade galaxyS6Cost;
    @FindBy(xpath = "//h2[contains(text(),'Samsung galaxy s6')]")
    WebElementFacade galaxyS6DetailName;
    @FindBy(xpath = "//p[contains(text(),'The Samsung Galaxy S6 is powered by 1.5GHz octa-co')]")
    WebElementFacade galaxyS6Description;

    public String getGalaxyS6Name(){
        return galaxyS6Name.getTextValue();
    }

    public String getGalaxyS6Price(){
        return galaxyS6Cost.getTextValue();
    }
    public void click_Galaxy_Name(){

        galaxyS6Name.click();
    }

    public String getGalaxyS6DetailsName() {
        return galaxyS6DetailName.getTextValue();
    }

    public String getGalaxyS6Description() {
        return galaxyS6Description.getTextValue();

    }
}
