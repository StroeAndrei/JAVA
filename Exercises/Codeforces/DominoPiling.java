import java.util.Scanner;

// A. Domino piling
public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int totalSquares = rows * columns;

        if(1 <= rows && rows <= columns && columns <= 16) {
            int numberOfDominoes = totalSquares / 2;
            System.out.println(numberOfDominoes);
        }
    }
}
