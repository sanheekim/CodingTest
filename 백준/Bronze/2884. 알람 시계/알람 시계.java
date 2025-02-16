import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int min = sc.nextInt();
        sc.close();

        if (min < 45){
            hour = hour-1;
            min = 60-(45-min);
            if (hour < 0) { hour = 23; }
            System.out.println(hour+" "+min);
        } else {
            System.out.println(hour+" "+(min-45));
        }
        
    }
}

// 10 10 -> 9 15
// 23 45 -> 23 00