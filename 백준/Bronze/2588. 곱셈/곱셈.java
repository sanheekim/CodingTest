import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        a = sc.nextInt();
        b = sc.next();
        
        sc.close();
        
        System.out.println(a*(b.charAt(2)-'0'));
        System.out.println(a*(b.charAt(1)-'0'));
        System.out.println(a*(b.charAt(0)-'0'));
        System.out.println(a*Integer.parseInt(b));
    }
}