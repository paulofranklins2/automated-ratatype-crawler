import java.awt.*;
import java.util.Locale;

import org.openqa.selenium.WebDriver;

public class TypingTestAutomation {

    static final String TARGET_URL = "https://www.ratatype.com/typing-test/";
    static final String URL_COMPLETE = "https://www.ratatype.com/typing-test/complete/";

    public static void main(String[] args) throws AWTException, InterruptedException {
        Locale.setDefault(Locale.ENGLISH);
        var driver = WebDriverManager.initializeWebDriver();
        driver.get(TARGET_URL);
        PageInteraction.closeTooltipLanguage(driver);
        var textContent = PageInteraction.getTextContent(driver);
        var robot = new Robot();

        System.out.println("Text Content: " + textContent);

        robot.delay(5000);
        TypingHandler.typeTextWithRobot(robot, textContent, driver);

        // Uncomment the line below when you want to quit the WebDriver

    }
}
