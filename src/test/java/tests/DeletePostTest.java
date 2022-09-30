package tests;


import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MoodUpdatedPage;

public class DeletePostTest extends BaseTest {


    @BeforeMethod
    public void createPost() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.EMAIL, Credentials.PASSWORD)
                .clickPostUpdate()
                .clickTimeSaver()
                .clickUpdateTo5Button();
    }

    @Test
    public void deletePostTest() {
        MoodUpdatedPage moodUpdatedPage = new MoodUpdatedPage();
        String message =
                moodUpdatedPage.navigateToYourDiary()
                        .deletePost()
                        .getText();
        Assert.assertEquals(message, "Your post was deleted. It may take a minute or so to update the feeds");

    }

}
