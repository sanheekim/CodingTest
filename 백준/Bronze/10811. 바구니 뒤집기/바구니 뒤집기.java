import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int temp;
        
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int j=0;j<M;j++){
            int I = sc.nextInt()-1;
            int J = sc.nextInt()-1;
            
            while(I<J){
                temp = arr[I];
                arr[I]=arr[J];
                arr[J]=temp;
                I++;
                J--;
            }
        }
        sc.close();
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}