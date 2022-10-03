package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class SendHugTest extends BaseTest {

    @Test
    public void sendHugTest() {
        LoginPage loginPage = new LoginPage();
        String actualButtonText =
        loginPage.login(Credentials.EMAIL, Credentials.PASSWORD)
                .sendHug()
                .getSentHug();

        Assert.assertEquals(actualButtonText, "Hug sent");
    }
}
