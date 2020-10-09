import java.util.InputMismatchException;
import java.util.Scanner;

// A. Stones on the Table
public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repetitions = 0;

        try {
            int numberOfStones = scan.nextInt();

            if(numberOfStones >= 1 && numberOfStones <= 50) {
                String stoneSequence = scan.next();

                for (int i = 0; i < numberOfStones - 1; i++) {
                    if (stoneSequence.charAt(i) == stoneSequence.charAt(i + 1)) {
                        repetitions++;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Types do not match on first line. Expecting an integer.");
        }
        System.out.println(repetitions);

    }
}
