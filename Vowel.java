package homeworks;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Word:");
        String word = x.nextLine();


        int vowel = 0;
        int conc=0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
        }
        for (int j = 0; j < word.length(); j++) {
            char b = word.charAt(j);
            if (b == 'b' ||b == 'c' ||b == 'd' ||b == 'f' ||b == 'g' ||b == 'h' ||b == 'j' ||b == 'k' ||b == 'l' || b == 'm'||b == 'n' ||b == 'o' ||b == 'p' ||b == 'q' ||b == 'r' ||b == 's' ||b == 't' ||b == 'v' ||b == 'w' ||b == 'x' ||b == 'y' ||b == 'z' ) {
                conc++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowel);
        System.out.println("Number of concent in the string: " + conc);
    }
}
