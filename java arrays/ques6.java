import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double[] heights = new double[11];

        
        System.out.println("Enter the heights (in cm or meters) of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double height : heights) {
            sum += height;
        }

        double mean = sum / heights.length;
        System.out.printf("The mean height of the football team is: %.2f\n", mean);

        sc.close();
    }
}
