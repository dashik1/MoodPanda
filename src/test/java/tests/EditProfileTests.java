package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class EditProfileTests extends BaseTest {

    @Test
    public void updateFirstNameTest() {
        LoginPage loginPage = new LoginPage();
        String messageTextEdit = loginPage.login(Credentials.EMAIL, Credentials.PASSWORD)
                .navigateToYourDashboardEditProfileTab()
                .editFirstName()
                .getText();
        Assert.assertEquals(messageTextEdit, "Your identity was updated");

    }

    @Test
    public void updateLastNameInitialTest() {
        LoginPage loginPage = new LoginPage();
        String messageTextEdit = loginPage.login(Credentials.EMAIL, Credentials.PASSWORD)
                .navigateToYourDashboardEditProfileTab()
                .editLastNameInitial()
                .getText();
        Assert.assertEquals(messageTextEdit, "Your identity was updated");

    }
}
