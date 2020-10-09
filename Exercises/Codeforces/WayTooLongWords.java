import java.util.ArrayList;
import java.util.Scanner;

// A. Way Too Long Words Problem
public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterations = scan.nextInt();
        int i = 0;

        if(iterations >= 1 && iterations <= 100) {
            ArrayList<String> words = new ArrayList<>();
            while(i < iterations) {
                String word = scan.next();
                words.add(i, word);
                i++;
            }

            for(String word : words) {
                if(word.length() <= 10) {
                    System.out.println(word);
                } else {
                    String inBetween = String.valueOf(word.length() - 2);
                    char firstLetter = word.charAt(0);
                    char lastLetter = word.charAt(word.length() - 1);
                    System.out.println(firstLetter + inBetween + lastLetter);
                }
            }
        }
    }
}
