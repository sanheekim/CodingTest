import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i=0;i<arr.length;i++){
            int N = sc.nextInt();
            h.add(N%42);
        }
        System.out.println(h.size());
    }
}



/*
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
*/