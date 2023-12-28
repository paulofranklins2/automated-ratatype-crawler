import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageInteraction {
    private static final String TEXT_ELEMENT_ID = "testText";

    public static String getTextContent(WebDriver driver) {
        var wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(TEXT_ELEMENT_ID)));
        try {
            WebElement typingArea = driver.findElement(By.id(TEXT_ELEMENT_ID));
            typingArea.click();
            return typingArea.getText();
        } catch (Exception e) {
            System.out.println("Error retrieving text content: " + e.getMessage());
            return "";
        }
    }

    public static void closeTooltipLanguage(WebDriver webDriver) {
        try {

            var wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/button")));
            WebElement tooltipLanguage =
                    webDriver.findElement(By.xpath("/html/body/div[3]/div/div/button"));

            if (tooltipLanguage != null) {
                Thread.sleep(1000);

                tooltipLanguage.click();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
