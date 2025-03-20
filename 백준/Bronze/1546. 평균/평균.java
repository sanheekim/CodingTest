import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();
        double[] arr = new double[subject];
        double max = 0;
        double average = 0;
        
        for (int i=0;i<arr.length;i++){
            double score = sc.nextInt();
            arr[i] = score;
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int j=0;j<arr.length;j++){
            average += (arr[j]/max*100)/subject;
        }
        System.out.println(average);
    }
}


//점수/M*100