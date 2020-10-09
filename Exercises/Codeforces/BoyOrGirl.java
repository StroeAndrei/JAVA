import java.util.InputMismatchException;
import java.util.Scanner;

// A. Boy or Girl
public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            String name = scan.next();
            int identicalCharacters = 0;
            int distinctCharacters = 0;

            char[] nameChars = new char[name.length()];

            for(int i = 0; i < name.length(); i++) {
                nameChars[i] = name.charAt(i);
            }

            if(name.length() <= 100) {
                for(int i = 0; i < nameChars.length; i++) {
                    for(int j = i + 1; j < nameChars.length; j++) {
                        if(name.charAt(i) == nameChars[j]) {
                            identicalCharacters++;
                            nameChars[j] = '0';
                        }
                    }
                }
            }

            distinctCharacters = nameChars.length - identicalCharacters;

            if(distinctCharacters % 2 != 0) {
                System.out.println("IGNORE HIM!");
            } else {
                System.out.println("CHAT WITH HER!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Insert a name (string)");
        }

    }
}
