import java.util.ArrayList;
import java.util.Scanner;

// A. Next Round
public class Problem5 {
    public static void main(String[] args) {
        int n, k, inScore;
        int passed = 0;
        ArrayList<Integer> scores = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();

        if(k >= 1 && n >= k && 50 >= n) {
            for(int i = 0; i < n; i++) {
                inScore = scan.nextInt();

                if(inScore >= 0 && inScore <= 100) {
                    scores.add(i, inScore);
                }
            }

            for(int j = 0; j < scores.size(); j++) {
                if(scores.get(j) >= scores.get(k - 1) && scores.get(j) > 0) {
                    passed++;
                }
            }
            System.out.println(passed);
        }
    }
}
