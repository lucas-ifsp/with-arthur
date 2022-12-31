import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        int smallerNumber = 1000000000;
        int higherNumber = 0;
        int[] integers = new int[5];

        //Prompt
        do {
            System.out.println("Write a Integer Number:");
            int typedInteger = scanner.nextInt();
            integers[totalNumbers] = typedInteger;
            totalNumbers++;
        } while (totalNumbers < 5);

        scanner.close();

        //Finding numbers
        for (int integer : integers){
            if (integer > higherNumber){
                higherNumber = integer;
            } else if (integer < smallerNumber){
                smallerNumber = integer;
            }
        }

        //Printing results
        System.out.println("Higher Number: " + higherNumber);
        System.out.println("Smaller Number: " + smallerNumber);
    }
}
