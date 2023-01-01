
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.valueOf(scanner.nextLine()); 
        double input2 = Double.valueOf(scanner.nextLine());
        double sum = input + input2; 
        double squareRoot = Math.sqrt(sum); 
        System.out.println(squareRoot);
    }
}
