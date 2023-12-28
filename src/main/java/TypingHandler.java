import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.awt.Robot;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TypingHandler {
    public static void typeTextWithRobot(Robot robot, String text, WebDriver driver) throws InterruptedException {
        var shiftPressed = false;
        String old = "";
        int qt = 8;
        // digitar até  o certificado ou o texto do certificado aparecer na tela
        while (qt != 0) {
            Thread.sleep(10000);
            if (qt != 8) {
                System.out.println("-------");
                System.out.println("old");
                System.out.println(old.replace("\r\n",""));
                text = PageInteraction.getTextContent(driver);
                text = text.replace(old,"");
                System.out.println("New Text");
                System.out.println(text);
            }
            for (int i = 0; i < text.length(); i++) {
                var currentChar = text.charAt(i);

                if (Character.isUpperCase(currentChar) && !shiftPressed) {
                    robot.keyPress(java.awt.event.KeyEvent.VK_SHIFT);
                    shiftPressed = true;
                } else if (!Character.isUpperCase(currentChar) && shiftPressed) {
                    robot.keyRelease(java.awt.event.KeyEvent.VK_SHIFT);
                    shiftPressed = false;
                }

                var keyCode = java.awt.event.KeyEvent.getExtendedKeyCodeForChar(currentChar);
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                Thread.sleep(10);
            }

            old += text;
            qt--;
        }


        if (shiftPressed) {
            robot.keyRelease(java.awt.event.KeyEvent.VK_SHIFT);
        }
    }
}
