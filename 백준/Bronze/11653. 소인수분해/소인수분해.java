import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(N);i++){ // Math.sqrt(N) : N의 제곱근 구하기
            while(N%i==0){
                System.out.println(i);
                N/=i;
            }
        }
        if(N>1){
            System.out.println(N);
        }
    }
}