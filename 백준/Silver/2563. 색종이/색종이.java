import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        
        int count = sc.nextInt();
        
        for(int i=0;i<count;i++){
            int w = sc.nextInt();
            int h = sc.nextInt();
            for(int j=w;j<w+10;j++){
                for(int k=h;k<h+10;k++){
                    arr[k][j]=1;
                }
            }
        }
        
        int res = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if (arr[i][j] == 1) {
                    res += arr[i][j];
                }
            }
        }
        System.out.println(res);
    }
}