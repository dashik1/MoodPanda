package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utilits.FakeMessageGenerator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreatePostPage {

    private ElementsCollection timeSaverButtons = $$(By.xpath("//button[@class='is-small button is-light']"));
    private SelenideElement updateTo5 = $(By.xpath("//a[@class='button is-rounded is-pulled-right is-warning']"));


    public CreatePostPage clickTimeSaver() {
        timeSaverButtons.get(FakeMessageGenerator.generateTag()).click();
        return this;
    }

    public MoodUpdatedPage clickUpdateTo5Button() {
        updateTo5.click();
        return new MoodUpdatedPage();
    }
}
