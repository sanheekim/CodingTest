import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();
        
        int min = 60*a+b+c;
        int hour = (min/60)%24;
        min = min%60;
        
        System.out.println(hour+" "+min);
    }
}