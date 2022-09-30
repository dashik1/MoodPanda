package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class YourDiaryPage {

    private ElementsCollection rightCardFooterButtons = $$(By.xpath("//div[@class='dropdown is-up is-right card-footer-item']"));
    private ElementsCollection deleteButton = $$(By.xpath("//a[contains(text(), 'Delete')]"));

    private SelenideElement infoMessageDelete = $(By.xpath("//div[text()='Your post was deleted. It may take a minute or so to update the feeds']"));


    public YourDiaryPage deletePost() {
        rightCardFooterButtons.get(0).click();
        deleteButton.get(0).click();
        return this;
    }

    public String getText() {
        return infoMessageDelete.getText();
    }


}
