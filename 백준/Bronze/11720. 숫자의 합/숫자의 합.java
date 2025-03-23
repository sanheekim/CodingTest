import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        String s = sc.next();
        int total = 0;
        for(int i=0;i<max;i++){
            total += s.charAt(i)-'0';
        }
        System.out.println(total);
    }
}