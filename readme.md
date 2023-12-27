# Typing Test Automation

## Overview
This project is a simple automation script written in Java using Selenium and AWT Robot to perform typing tests on the website [Ratatype](https://www.ratatype.com/typing-test/). The script uses the ChromeDriver for WebDriver interactions and the Robot class to simulate keyboard input.

## Prerequisites
Before running the script, ensure you have the following components set up:
- **ChromeDriver:** Download and install ChromeDriver. The path to ChromeDriver should be correctly set in the script.
- **Java:** Make sure you have Java installed on your system.

## Dependencies
- **Selenium:** The script uses Selenium for web automation. Ensure you have the necessary Selenium libraries in your project.

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
</dependencies>
```

## Usage
1. Clone or download the project to your local machine.
2. Open the project in your preferred Java development environment.
3. Set the correct path for ChromeDriver in the `CHROME_DRIVER_PATH` variable.
4. Run the `TypingTestAutomation` class.

## Script Execution Flow
1. The script opens the Chrome browser and navigates to the specified URL (Ratatype typing test page).
2. It waits for the typing area to be visible using Selenium's WebDriverWait.
3. Retrieves the text content from the webpage.
4. Outputs the retrieved text content to the console.
5. Pauses for 5 seconds to give the user time to change the screen and click on the typing area.
6. Uses the AWT Robot class to simulate typing the text content.

## Important Note
- Comment or uncomment the `driver.quit();` line based on whether you want to close the browser after the script execution.

## Issues and Contributions
If you encounter any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

**Happy typing!**