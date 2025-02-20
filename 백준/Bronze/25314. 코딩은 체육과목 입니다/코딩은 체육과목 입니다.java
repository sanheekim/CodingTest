import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int div = a/4;
        String str = "";
        
        for (int i = 0; i < div; i++){
            str += "long ";
        }
        System.out.println(str+"int");
    }
}





/*
long을 하나씩 더 붙일 때마다 
$4$바이트씩

혜아가 
$N$바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은 무엇일까?

입력 : 4
출력 : long int

입력 : 20
출력 : long long long long long int

*/