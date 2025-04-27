import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int range = 2;

        if(N==1){
            System.out.println(1);
        } else {
            while (range<=N){
                range = range + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}

/*
1: 1
2: 2~7 (6)
3: 8~19 (12)
4: 20~37 (18)
5: 38~61 (24)
...

N(1 ≤ N ≤ 1,000,000,000)
입력 13
출력 3

13%=6 +1

*/