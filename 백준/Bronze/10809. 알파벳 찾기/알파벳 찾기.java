import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        
        String s = sc.nextLine();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(arr[ch-'a']==-1){
                arr[ch-'a'] = j;
            }
        }
        
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}