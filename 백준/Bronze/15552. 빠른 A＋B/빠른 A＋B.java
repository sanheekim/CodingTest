import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i < max; i++){
            st = new StringTokenizer(br.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append('\n');
        }
        br.close();
        System.out.println(sb);
    }
}

/*
Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
*/