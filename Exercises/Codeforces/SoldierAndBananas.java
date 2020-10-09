import java.util.Scanner;

// A. Soldier and Bananas
public class Problem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(); // cost of the first banana
        int n = scan.nextInt(); // init number of dollars he has
        int w = scan.nextInt(); // number of bananas he wants
        int totalRequired = 0;
        int moneyToBorrow;

        if(k >= 1 && w <= 1000 && (n >= 0 && n <= 1000000000)) {
            for(int i = 1; i <= w; i++) {
                totalRequired += i * k;
            }
        }

        moneyToBorrow = totalRequired - n;

        if(moneyToBorrow <= 0) {
            System.out.println(0);
        } else {
            System.out.println(moneyToBorrow);
        }

    }
}
