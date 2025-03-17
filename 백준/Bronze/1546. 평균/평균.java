import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double max = 0;
        double avg = 0; 
        
        for(int i=0;i<arr.length;i++){
            double score = sc.nextInt();
            arr[i] = score;
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            avg += (arr[j]/max*100)/N;
        }
        System.out.println(avg);
    }
}