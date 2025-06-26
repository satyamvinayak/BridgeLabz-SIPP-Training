import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter marks of Maths:");
    int maths = sc.nextInt();
    System.out.println("enter the marks of Physics:");
    int physics = sc.nextInt();
    System.out.println("enetr the marks pf Chemistry:");
    int chemistry = sc.nextInt();
    int average = (maths+physics+chemistry)/3;
    System.out.println("Averge" + average);

}
}
