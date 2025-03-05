import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int[] arr = new int[max];
        
        for(int i=0;i<max;i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        int cnt = sc.nextInt();
        for(int j=0;j<max;j++){
            if (cnt==arr[j]){
                count++;
            }
        }
        
        System.out.println(count);
    }
}