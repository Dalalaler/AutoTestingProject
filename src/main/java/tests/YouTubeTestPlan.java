package tests;

import org.openqa.selenium.WebDriver;

public class YouTubeTestPlan extends PageObject {

    public YouTubeTestPlan(WebDriver driver) {
        super(driver);
    }

    @Override
    public void startTest() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
