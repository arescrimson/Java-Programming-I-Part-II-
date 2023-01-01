
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbersOfNumbers = 0;
        double average = 0;
        int evenCount = 0; 
        int oddCount  = 0; 
         
        
        while(true) { 
            System.out.println("Give numbers:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (input != -1) { 
                sum += input; 
                numbersOfNumbers++;
                average = (double) sum / numbersOfNumbers; 
                if (input % 2 == 0) { 
                    evenCount++;
                }else if ( input % 2 != 0) { 
                    oddCount++;
                }             
                continue; 
            } 
        } 
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersOfNumbers); 
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);


        
    }
        

    
}
