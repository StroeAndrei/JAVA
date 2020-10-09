import java.util.Scanner;

// A. Petya and Strings
public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstWord = scan.next();
        String secondWord = scan.next();

        if(firstWord.length() == secondWord.length()) {
            System.out.println(compare(firstWord, secondWord, firstWord.length()));
        }
    }

    public static int compare(String alfa, String beta, int len) {
        for (int i = 0; i < len; i++) {
            char alfaCh = alfa.charAt(i);
            char alfaChUp = Character.toUpperCase(alfaCh);

            char betaCh = beta.charAt(i);
            char betaChUp = Character.toUpperCase(betaCh);

            if((int) alfaChUp < (int) betaChUp) return -1;
            if((int) alfaChUp > (int) betaChUp) return 1;
        }
        return 0;
    }

}
