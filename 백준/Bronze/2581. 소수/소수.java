import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int M = sc.nextInt();
    	int N = sc.nextInt();
    	int sum = 0; // 합 변수
    	ArrayList <Integer> min = new ArrayList<>(); // 최소값을 구하기 위한 ArrayList
    	
    	for(int i=M; i<=N; i++) {
    		int num=0;    // 소수인지 판단하기 위해 선언한
    		if(i==1)      // i가 1이라면 소수가 아님
    			continue;
    		if(i==2) {    // i가 2라면 sum에 2를 더해주고 arraylist에 2 추가
    			sum+=2;
    			min.add(i);
    			continue;
    		}
    		// i가 만약에 2부터 i-1까지 중의 수와 나누었을때 나머지가 0이라면
    		// 1과 자기자신을 제외한 수로 나누어지는 것이므로 
    		// 소수가 아님
    		for(int j=2; j<i; j++) { // i가 1도 아니고 2도아닐 때 소수 구하기
    			if(i%j==0)           // 소수가 아닐 때
	    				num++;       // num 변수를 증가 시킴
    		} 
	    		if(num==0) {         // num변수가 만약에 0이 아니라면 소수가 아님
	    			sum+=i;          // 0이라면 소수임 따라서 sum에 더해주고
	    			min.add(i);      // ArrayList에 추가해줌
	   		}	
    	}
   
    	// 만약 arraylist가 비었다면 소수가 없다는 것이므로 -1출력
    	if(min.size()==0)
    		System.out.println(-1);
    	else {
    		System.out.println(sum);
    		System.out.println(min.get(0)); // 최소값은 arraylist에 가장먼저 add해준 값
    	}
    }
}

/*
입력
입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

출력
M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
*/