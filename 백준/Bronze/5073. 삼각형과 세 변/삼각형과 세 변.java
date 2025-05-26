import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
         
        while(true) {
            
           int[] arr = new int[3];
           arr[0] = sc.nextInt();
           arr[1] = sc.nextInt();
           arr[2] = sc.nextInt();
            
            Arrays.sort(arr); // 정렬: arr[2]가 가장 긴 변
            
            if (arr[0]==0 && arr[1]==0 && arr[2]==0){
                break;
            }
        
            if (arr[2]>=arr[0]+arr[1]) {
                System.out.println("Invalid");
            } else if (arr[0]==arr[1] && arr[1]==arr[2]){
                System.out.println("Equilateral");
            } else if (arr[0]==arr[1] || arr[0]==arr[2] || arr[2]==arr[1]){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            } 
        }
        
    }
}

/*
Equilateral :  세 변의 길이가 모두 같은 경우
Isosceles : 두 변의 길이만 같은 경우
Scalene : 세 변의 길이가 모두 다른 경우

단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다.
예를 들어 6, 3, 2가 이 경우에 해당한다.
가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.

세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
*/