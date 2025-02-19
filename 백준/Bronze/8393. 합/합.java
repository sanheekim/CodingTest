import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        
        for (int i=1; i<=n; i++){
            total += i;
        }
        System.out.println(total);
    }
}


// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.