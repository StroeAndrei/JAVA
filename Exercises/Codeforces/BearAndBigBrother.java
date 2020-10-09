import java.util.Scanner;

// A. Bear and Big Brother
public class Problem12 {
    public static void main(String[] args) {
        int limakWeight, bobWeight;
        int nrOfYears = 0;
        Scanner scan = new Scanner(System.in);
        limakWeight = scan.nextInt();
        bobWeight =  scan.nextInt();

        if(limakWeight >= 1 && limakWeight <= bobWeight && bobWeight <= 10) {
            while(limakWeight <= bobWeight) {
                limakWeight *= 3;
                bobWeight *= 2;
                nrOfYears++;
            }
        }

        System.out.println(nrOfYears);
    }
}
