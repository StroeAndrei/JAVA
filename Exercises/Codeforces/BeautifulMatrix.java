import java.util.Scanner;

// A. Beautiful Matrix
public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int positionOfOneOnTheRow = 0;
        int positionOfOneOnTheColumn = 0;
        int necessaryMoves;

        for(int rows = 0; rows < 5; rows++) {
            for(int cols = 0; cols < 5; cols++) {
                matrix[rows][cols] = scan.nextInt();
                if(matrix[rows][cols] == 1) {
                    positionOfOneOnTheColumn = cols + 1;
                    positionOfOneOnTheRow = rows + 1;
                }
            }
        }

        necessaryMoves = Math.abs(3 - positionOfOneOnTheRow) + Math.abs(3 - positionOfOneOnTheColumn);
        System.out.println(necessaryMoves);

    }
}
