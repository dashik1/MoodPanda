package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import constants.Urls;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    private ElementsCollection hugButtons = $$(By.xpath("//a[text()='Hug']"));

    private ElementsCollection hugSentButtons = $$(By.xpath("//a[text()='Hug sent']"));



    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }

    public MainPage sendHug() {
        hugButtons.get(0).click();
        return this;
    }


    public String getSentHug() {
        return hugSentButtons.get(0).getText();
    }


    public CreatePostPage clickPostUpdate() {
        postUpdateButton.click();
        return new CreatePostPage();

    }

    public YourDashboardEditProfilePage navigateToYourDashboardEditProfileTab() {
        open(Urls.DASHBOARD_EDIT_PROFILE_URL);
        return new YourDashboardEditProfilePage();
    }
}
