import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageInteraction {
    private static final String TARGET_URL = "https://www.ratatype.com/typing-test/";
    private static final String TEXT_ELEMENT_ID = "testText";
    public static String getTextContent(WebDriver driver) {
        driver.get(TARGET_URL);
        var wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(TEXT_ELEMENT_ID)));

        try {
            return driver.findElement(By.id(TEXT_ELEMENT_ID)).getText();
        } catch (Exception e) {
            System.out.println("Error retrieving text content: " + e.getMessage());
            return "";
        }
    }
}
