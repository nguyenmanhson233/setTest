package levunguyen.thucydides.cucumber.steps.serenity;

import levunguyen.thucydides.cucumber.pages.PhonePage;
import net.thucydides.core.steps.ScenarioSteps;


public class PhoneSerenity extends ScenarioSteps {
    PhonePage phonePage;

    public void open_Home_Page(){

        phonePage.open();
    }
    public String getGalaxyS6Name() {
       return phonePage.getGalaxyS6Name();
    }

    public String getGalaxyS6Price() {
        return phonePage.getGalaxyS6Price();
    }

    public String getGalaxyS6DetailsName(){
        return phonePage.getGalaxyS6DetailsName();
    }


    public String getGalaxyS6Description() {
        return phonePage.getGalaxyS6Description();
    }

    public void click_Galaxy_Name(){

        phonePage.click_Galaxy_Name();
    }

}
