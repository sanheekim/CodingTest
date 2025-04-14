import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        
        int tmp = 1;
        int result = 0;
        for (int i=N.length()-1;i>=0;i--){
            char c = N.charAt(i);
            if (c>='A' && c<= 'Z') {
                result += (c-55)*tmp;
            } else {
                result += (c-48)*tmp;
            }
            tmp *= B;
        }
        System.out.println(result);
        sc.close();
    }
}




/*
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
*/