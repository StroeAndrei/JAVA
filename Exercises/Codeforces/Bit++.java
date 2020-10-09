import java.util.Scanner;

// A. Bit++
public class Problem6 {
    public static void main(String[] args) {
        int onlyVariable = 0;

        Scanner scan = new Scanner(System.in);
        int numberOfStatements = scan.nextInt();

        if(numberOfStatements >= 1 && numberOfStatements <= 150) {
            for(int i = 0; i < numberOfStatements; i++) {
                String instruction = scan.next();

                switch(instruction.toUpperCase()) {
                    case "++X":
                        ++onlyVariable;
                        break;
                    case "X++":
                        onlyVariable++;
                        break;
                    case "--X":
                        --onlyVariable;
                        break;
                    case "X--":
                        onlyVariable--;
                        break;
                }
            }
        }
        System.out.println(onlyVariable);
    }
}
