import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int total = 60*a+b;
        total = total + c;
        int hour = (total/60)%24;
        int min = total%60;
        
        System.out.println(hour+" "+min);
    }
}