import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws AWTException {

//        var x = "Dentists have recommended that a toothbrush be kept at least 6 feet away from a toilet to avoid airborne particles resulting from the flush. The plastic things on the end of shoelaces are called aglets. Richard Millhouse Nixon was the first US president whose name contains all the letters from the word 'criminal'. The second was William Jefferson Clinton. A crocodile cannot stick its tongue out.";
//        var x = "When Thomas Jefferson became U.S. President in 1801, 20 percent of all people in the young nation were slaves. Early Egyptians wore sandals made from woven papyrus leaves. The Marquis de Lafayette, America's Revolutionary War ally, named his only son George Washington Lafayette. Karl Marx and Friedrich Engels, the fathers of communism, wrote 500 articles for the New York Tribune from 1851 to 1862.";
//        var x = "Traffic engineering was not noted road but rather in an ancient Rome. The Romans, of course, were noted road builders. The Appian Way, for example, stretched 350 miles from the Eternal City to Brundisium.";
//        var x = "China was the first first country to introduce paper money (in 812), but it wasn't until 1661 that a bank (Banque-Sedlar of Sweden) issued banknotes. If the arm of King Henry I of England had been 42 inches long, the standard foot should be one-third length: 12 inches.";
//        var x = "Combined. The Guinness Book of Records holds the record for being the book most often borrowed from public libraries. If you removed the stomach, the spleen, 75% of the liver, 80% of the intestines, one kidney, one lung, and a litre of blood from the average human body, it would still be able to survive. In 10 minutes, a hurricane releases more energy than all of the world's nuclear weapons combined.";
        var x = "Babies are born without knee caps. They don't appear until the child reaches 2-6 years of age. Modern records do not compare with that of St. Simon the Younger called stylists. A monk who spent the final 45 years of his life living at the top of a stone pillar on the Syrian Antioch in Syria! 14% of all facts and statistics are made up and 27% of people know that fact.";
//        var x = "Mail-in entire building has been illegally in the U.S. since 1916 when a man mailed a 40,000-ton brick house across Utah to avoid high freight rates. Snoring is prohibited in Massachusetts unless all bedroom windows are closed. It is also illegal to go to bed having a full bath. Women in Florida may be fined for falling asleep under a hairdryer, as can the salon owner.";
//        var x = "It is legal in North Dakota to shoot an Indian on horseback, provided you are in a covered wagon. The mummified hand of a notary public figure, chopped off for falsely certifying of a document, has been on display in the city hall of Munster, Germany, as a warning to others notaries for 400 years. The curtain or veil'";


        var robot = new Robot();

        robot.delay(2000);
        for (int i = 0; i < x.length(); i++) {
            char currentChar = x.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                robot.keyPress(KeyEvent.VK_SHIFT);
            }

            // Convert the character to its corresponding KeyEvent constant
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(currentChar);

            // Press and release the key
            robot.keyPress(keyCode);
            robot.delay(10);
            robot.keyRelease(keyCode);

            if (Character.isUpperCase(currentChar)) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
        }
    }
}