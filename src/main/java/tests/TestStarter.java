package tests;

import enums.BrowserName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestStarter {
    private static String propertyDriver, pathDriver;
    private static WebDriver webDriver;
    public static void startChosenTest(BrowserName browserName){
        switch (browserName){
            case CHROME:
                System.setProperty(Utils.CHROME_DRIVER_PROPERTY, Utils.CHROME_DRIVER_WINDOWS_LOCATION);
                webDriver = new ChromeDriver();
                break;
            case OPERA:
                System.setProperty(Utils.OPERA_DRIVER_PROPERTY, Utils.OPERA_DRIVER_WINDOWS_LOCATION);
                webDriver = new OperaDriver();
                break;
            case FIREFOX:
                System.setProperty(Utils.FIREFOX_DRIVER_PROPERTY, Utils.FIREFOX_DRIVER_WINDOWS_LOCATION);
                webDriver = new FirefoxDriver();
                break;
            case EDGE:
                System.setProperty(Utils.EDGE_DRIVER_PROPERTY, Utils.EDGE_DRIVER_WINDOWS_LOCATION);
                webDriver = new EdgeDriver();
                break;
        }
        YouTubeTestPlan youTubeTestPlan = new YouTubeTestPlan(webDriver);
        youTubeTestPlan.startTest();
    }
}
