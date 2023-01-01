

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number) {
        int numberCount = 1; 
        while (numberCount <= number) {
            System.out.println(number);
            number--;
            
        }
    }
}
