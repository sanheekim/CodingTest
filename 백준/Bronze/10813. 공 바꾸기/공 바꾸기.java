import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int tmp;
        
        for(int i=0;i<N;i++){
            arr[i]=i+1;
        }
        for(int j=0;j<M;j++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            
            tmp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = tmp;
        }
        for(int k=0;k<N;k++){
            System.out.print(arr[k]+" ");
        }
    }
}