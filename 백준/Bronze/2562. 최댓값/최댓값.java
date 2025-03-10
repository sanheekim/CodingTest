import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        
        int max = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            
            if(arr[i] > max){
                max = arr[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}





/*
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/