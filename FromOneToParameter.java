

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number) {
        int numberCount = 1; 
        while (numberCount <= number) { 
            System.out.println(numberCount);
            numberCount++;
        }
    }
}
