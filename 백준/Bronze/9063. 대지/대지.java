import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int max = sc.nextInt();
        
        int[] x = new int[max];
        int[] y = new int[max];
        for(int i=0;i<max;i++){
            int xNum = sc.nextInt();
            x[i] = xNum;
            int yNum = sc.nextInt();
            y[i] = yNum;
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        if (max==1) { System.out.println(0); }
        else {
            int multiple = (x[max-1]-x[0]) * (y[max-1]-y[0]);
            System.out.println(multiple);
        }
        
    }
}

/*
예를 들어 위와 같이 (2, 1), (3, 2), (5, 2), (3, 4) 네 점에서 옥구슬을 발견하였다면,
임씨에게 돌아갈 대지는 (2, 1), (5, 1), (2, 4), (5, 4)를 네 꼭짓점으로 하는 직사각형이며,
넓이는 (5 - 2) × (4 - 1) = 9 가 된다. 
*/