import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int I = sc.nextInt();
        for(int i=1;i<=I;i++){
            for(int j=0;j<I-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=I-1;i>=0;i--){
            for(int j=0;j<I-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
입력:5
출력:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/