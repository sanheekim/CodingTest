import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i=0;i<arr.length;i++){
            int num = sc.nextInt();
            h.add(num%42);
        }
        System.out.println(h.size());
    }
}