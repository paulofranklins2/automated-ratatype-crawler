import java.awt.Robot;

public class TypingHandler {
    public static void typeTextWithRobot(Robot robot, String text) {
        var shiftPressed = false;

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
        }

        if (shiftPressed) {
            robot.keyRelease(java.awt.event.KeyEvent.VK_SHIFT);
        }
    }
}
