# AutoTyper

## Description

AutoTyper is a Java project that automates typing by simulating keypress events. The project uses the AWT (Abstract Window Toolkit) library to achieve this functionality. It provides a simple way to automatically type out a given text by converting each character into its corresponding key event.

## Usage

To use AutoTyper, follow these steps:

1. Open the `Main` class.
2. Set the text you want to be typed automatically by modifying the `x` variable:

    ```bash
    var x = "Babies are born without knee caps. They don't appear until the child reaches 2-6 years of age. Modern records do not compare with that of St. Simon the Younger called stylists. A monk who spent the final 45 years of his life living at the top of a stone pillar on the Syrian Antioch in Syria! 14% of all facts and statistics are made up and 27% of people know that fact.";
    ```

3. Run the program. The robot will simulate keypress events to type out the provided text.

## Dependencies

This project relies on the Java AWT library for handling keyboard events.

## How to Run

1. Ensure you have Java installed on your system.
2. Compile the `Main` class.
3. Run the compiled bytecode.

## Important Notes

- The project uses the `Robot` class from AWT to simulate keypress events. Ensure that the application has the necessary permissions to control the keyboard.
- Adjust the delay values in the code (`robot.delay(2000)` and `robot.delay(10)`) if needed to optimize the typing speed.

## Contribution

Feel free to contribute to the project by submitting pull requests or reporting issues.
