import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
    
        int count = 0;
        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            
            if (x==1) {
                count+=0;
                continue; // 잊지 말고
            }
            // 약수 구분하기
            int num = 0;
            for (int j=2;j<x;j++){ // 1은 약수가 될 수 없기 때문에 2부터 시작
                if(x%j==0){
                    num++;
                }
            }
            if (num==0){
                count++;
           }
        }
        System.out.println(count);
    }
}