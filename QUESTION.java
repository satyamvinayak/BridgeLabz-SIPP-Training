import java.util.Scanner;

class QUESTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char operator = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(operator) {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("invalid");
            break;


        }
    }
}
