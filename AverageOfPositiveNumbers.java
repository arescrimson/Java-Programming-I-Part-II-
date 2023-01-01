
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageOfPositiveNumbers = 0;
        double numberSum = 0;
        double positiveNumberCount = 0;

        while (true) {
            double input = Double.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input > 0) {
                numberSum = numberSum + input;
                positiveNumberCount = positiveNumberCount + 1;
                averageOfPositiveNumbers = numberSum / positiveNumberCount;
            } 

        }
        if (positiveNumberCount == 0) {
            System.out.println("Cannot calculate the average");

        } else {
            System.out.println(averageOfPositiveNumbers);
        }
    }
}
