package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;


public class MoodUpdatedPage {

    private SelenideElement title = $(By.xpath("//p[@class='title' and text()='Mood updated']"));


    private SelenideElement yourDiaryButton = $(By.xpath("//a[contains(text(), 'Your diary')]"));

    public boolean isTitleDisplayed() {
        title.shouldBe(Condition.visible, Duration.ofSeconds(10));
        return title.exists();
    }


    public YourDiaryPage navigateToYourDiary() {
        yourDiaryButton.click();
        return new YourDiaryPage();
    }


}
