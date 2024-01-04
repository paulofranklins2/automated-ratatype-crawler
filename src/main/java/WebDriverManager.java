import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    private static final String CHROME_DRIVER_PATH = "C:\\Users\\vitor\\Documents\\digitalbricklayer\\conteudo\\automated-ratatype-crawler\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe";

    public static WebDriver initializeWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setBinary("C:\\Users\\vitor\\Documents" +
                "\\digitalbricklayer\\automacao-tico-teco" +
                "\\src\\main\\resources\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        return new ChromeDriver(chromeOptions);
    }
}
