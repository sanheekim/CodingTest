import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        String s = sc.next();
        int total = 0;
        for(int i=0;i<max;i++){
            total += s.charAt(i)-'0';
        }
        sc.close();
        System.out.println(total);
    }
}




/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
입력으로 주어진 숫자 N개의 합을 출력한다.
*/