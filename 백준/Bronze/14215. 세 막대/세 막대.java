import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        
        Arrays.sort(arr);
        
        if (arr[2]>=arr[0]+arr[1]){
            arr[2]=arr[0]+arr[1]-1;
        }        
        System.out.println(arr[0]+arr[1]+arr[2]);
    }
}

/*
각 막대의 길이는 양의 정수이다
세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
삼각형의 둘레를 최대로 해야 한다.
a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오. 
*/