import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;


public class ChromeLinux {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        Configuration.browser = WebDriverRunner.CHROME;
        Selenide.open("https://www.google.com/");
        Selenide.close();
    }
}
