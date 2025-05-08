import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);        
        while(true){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a==0 && b==0){
                break;
            }
            
            if (b%a==0){
                System.out.println("factor");
            } else if (a%b==0){
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
            
        }
    }
}

//각 테스트 케이스마다
//첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.