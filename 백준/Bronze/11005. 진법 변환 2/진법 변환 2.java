import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(Integer.toString(N, B).toUpperCase());
        
    }
}

/*
입력:
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

출력:
첫째 줄에 10진법 수 N을 B진법으로 출력한다.
*/