package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utilits.FakeMessageGenerator;

import static com.codeborne.selenide.Selenide.$;


public class YourDashboardEditProfilePage {

    private SelenideElement firstNameInput = $(By.xpath("//input[@placeholder='e.g Jake']"));
    private SelenideElement lastNameInitialInput = $(By.xpath("//input[@placeholder='e.g. S']"));
    private SelenideElement saveIdentityButton = $(By.xpath("//button[contains(text(), 'Save identity')]"));

    private SelenideElement infoMessageEdit = $(By.xpath("//div[text()='Your identity was updated']"));

    public YourDashboardEditProfilePage editFirstName() {
        firstNameInput.clear();
        firstNameInput.sendKeys(FakeMessageGenerator.generateFirstName());
        saveIdentityButton.click();
        return this;
    }

    public YourDashboardEditProfilePage editLastNameInitial() {
        lastNameInitialInput.clear();
        lastNameInitialInput.sendKeys(FakeMessageGenerator.generateLastNameInitial());
        saveIdentityButton.click();
        return this;
    }

    public String getText() {
        return infoMessageEdit.getText();
    }


}
