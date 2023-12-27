import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TypingTestAutomation {
    private static final String CHROME_DRIVER_PATH = "/usr/local/bin/chromedriver";
    private static final String TARGET_URL = "https://www.ratatype.com/typing-test/";
    private static final String TEXT_ELEMENT_ID = "testText";

    public static void main(String[] args) throws AWTException {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

        // Initialize WebDriver, StringBuilder, and Robot
        var driver = new ChromeDriver();
        var textContent = new StringBuilder();
        var robot = new Robot();

        // Connect to the website
        driver.get(TARGET_URL);

        // Wait for the text element to be visible
        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(TEXT_ELEMENT_ID)));
        // Retrieve text content from the web page
        try {
            textContent.append(driver.findElement(By.id(TEXT_ELEMENT_ID)).getText());
        } catch (Exception e) {
            System.out.println("Error retrieving text content: " + e.getMessage());
        }

        // Print the retrieved text content
        System.out.println("Text Content: " + textContent);

        // Pause for 5 seconds
        robot.delay(5000);

        // Type the text content using the Robot class
        typeTextWithRobot(robot, textContent.toString());

        // Quit the WebDriver
//        driver.quit();
    }

    private static void typeTextWithRobot(Robot robot, String text) {
        boolean shiftPressed = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isUpperCase(currentChar) && !shiftPressed) {
                robot.keyPress(KeyEvent.VK_SHIFT);
                shiftPressed = true;
            } else if (!Character.isUpperCase(currentChar) && shiftPressed) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
                shiftPressed = false;
            }

            int keyCode = KeyEvent.getExtendedKeyCodeForChar(currentChar);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }

        if (shiftPressed) {
            robot.keyRelease(KeyEvent.VK_SHIFT);
        }
    }
}
