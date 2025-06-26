import java.util.*;
public class question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price : ");
        int cp =  sc.nextInt();
        System.out.println("enter the selling price : ");
        int sp = sc.nextInt();
        int profit = sp - cp;
        int prof_prc = (profit/cp) * 100;
        System.out.println("profit: " + profit);
        System.out.println("prof_prc: " + prof_prc);
    }
}
