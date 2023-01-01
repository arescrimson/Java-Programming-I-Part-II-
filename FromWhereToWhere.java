
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int inputTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?"); 
        int inputFrom = Integer.valueOf(scanner.nextLine()); 

        if (inputTo > inputFrom) {
            for (int i = inputFrom; i <= inputTo; i++ ) {
                System.out.println(i);
            }
        } else if (inputFrom > inputTo) {
            System.out.println(""); 
        } else if (inputFrom == inputTo) {
            System.out.println(inputFrom);
        }
    }
}
