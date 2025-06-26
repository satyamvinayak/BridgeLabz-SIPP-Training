import java.util.*;
public class ques1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 10;
    int[] arr = new int[10];
    for(int i = 0;i<10;i++){
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    for(int i = 0;i<arr.length;i++){
        if(arr[i] == target){
            if(target >= 18){
                System.out.println("Age of student" + arr[i]);
            }else{
                System.out.println("invalid");
            }
        }
    }
    
}
}

