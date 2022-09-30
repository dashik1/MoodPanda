package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class CreatePostTest extends BaseTest {

    @Test
    public void createPostTest() {
        LoginPage loginPage = new LoginPage();
        boolean isMoodUpdatedDisplayed = loginPage.login(Credentials.EMAIL, Credentials.PASSWORD)
                .clickPostUpdate()
                .clickTimeSaver()
                .clickUpdateTo5Button()
                .isTitleDisplayed();

        Assert.assertTrue(isMoodUpdatedDisplayed, "Post is not created!");
    }
}
