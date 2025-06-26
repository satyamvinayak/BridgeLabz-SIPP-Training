import java.util.*;
public class question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometer = sc.nextInt();
        System.out.println("eneter the distance in km : " + kilometer);
        double miles = (kilometer * 1.6);
        System.out.println("distance in miles : " + miles);
    }
}