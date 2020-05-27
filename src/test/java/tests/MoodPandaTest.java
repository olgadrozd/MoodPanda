package tests;


import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    @Test()
    public void login() {
        loginPage
                .openPage()
                .login("bird@mailinator.com", "gbaljv")
                .openRateHappinessModal()
                .updateMood(5)
                .goToMyDiary();
    }
}
