import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        int x = 1;
        int y = 1;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        		
		System.out.println(max);
		System.out.println(x+" "+y);
        
        
    }
}