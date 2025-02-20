import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;
        
        for (int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a*b;
        }
        
        if (X == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}


/*
첫째 줄에는 영수증에 적힌 총 금액 
$X$가 주어진다.

둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 
$N$이 주어진다.

이후 
$N$개의 줄에는 각 물건의 가격 
$a$와 개수 
$b$가 공백을 사이에 두고 주어진다.

입력
260000
4
20000 5
30000 2
10000 6
5000 8

출력
Yes
*/