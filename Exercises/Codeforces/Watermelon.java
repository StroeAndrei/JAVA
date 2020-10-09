import java.util.Scanner;

// A. Watermelon Problem
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value % 2 == 0 && value > 2 && value <= 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
