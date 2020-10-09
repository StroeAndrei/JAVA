import java.util.Scanner;

// A. Team Problem
public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrOfProblems = scan.nextInt();
        int participants = 3;
        int[][] opinions = new int[nrOfProblems][participants];
        int willAnswer = 0;
        int[] decision = new int[nrOfProblems];
        int implementedProblems = 0;

        for(int row = 0; row < opinions.length; row++) {
            for(int col = 0; col < opinions[row].length; col++) {
                opinions[row][col] = scan.nextInt();
            }
        }

        for(int row = 0; row < opinions.length; row++) {
            for(int col = 0; col < opinions[row].length; col++) {
                if(opinions[row][col] == 1) {
                    willAnswer++;
                }
            }
            if(willAnswer >= 2) {
                decision[row] = 1;
            }
            willAnswer = 0;
        }

        for(int elem : decision) {
            implementedProblems += elem;
        }

        System.out.println(implementedProblems);
    }
}
