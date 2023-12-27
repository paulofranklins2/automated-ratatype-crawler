import java.awt.*;

import org.openqa.selenium.WebDriver;

public class TypingTestAutomation {

    public static void main(String[] args) throws AWTException {
        var driver = WebDriverManager.initializeWebDriver();
        var textContent = PageInteraction.getTextContent(driver);
        var robot = new Robot();

        System.out.println("Text Content: " + textContent);

        robot.delay(5000);
        TypingHandler.typeTextWithRobot(robot, textContent);

        // Uncomment the line below when you want to quit the WebDriver
        // driver.quit();
    }
}
