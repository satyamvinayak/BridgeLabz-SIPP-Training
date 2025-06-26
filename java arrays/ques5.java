import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        
        int[] multiplicationResult = new int[4]; 

        
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6); 
        }

        
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}
