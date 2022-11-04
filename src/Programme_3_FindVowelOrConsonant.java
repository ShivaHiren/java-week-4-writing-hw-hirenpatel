import java.util.Locale;
import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {
    /* Write a java program that takes the user to provide a single character from the alphabet.
    Print vowel of consonant depending on the user input. if the user input os not a letter (between a to z
    or A to Z)
    for eg:
    Input an alphabet:
    Excepted output:
    Input letter is consonant */

    public static void checkVowelOrConsonant(String letter) {
        // check lenght of String
        // if user enters more that 1 character as error message is printed
        if (letter.length() > 1) {
            System.out.println("Error. Not a single character");
            //if user enters symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error.Not a letter.Enter uppercase or lowercase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o")
                || letter.equals("u")) {
            System.out.println("Input letter is a consonant");

        }
    }

    //This method will check is it a letter or not?
    public static boolean isItALetter(String l) {
        return l. charAt(0) > 96 && l. charAt(0) < 123;

    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from sonsole
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String str = scanner.next().toLowerCase();
        //calling static method directly
        checkVowelOrConsonant(str);
        //closing the scanner object
        scanner.close();
    }

}
