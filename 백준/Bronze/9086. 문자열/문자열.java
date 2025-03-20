import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] arr = new String[t];
        
        for(int i=0;i<arr.length;i++){
            String s = sc.next();
            arr[i] = s;
            System.out.println(s.substring(0,1)+s.substring(s.length()-1,s.length()));
        }
    }
}