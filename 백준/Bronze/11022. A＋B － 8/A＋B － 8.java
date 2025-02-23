import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int max = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=max; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #"+i+": "
                     +a
                     +" + "
                     +b
                     +" = "
                     +(a+b)
                     ).append("\n");
        }
        
        br.close();
        System.out.println(sb);
        
    }
}




// 1 1
// Case #1: 1 + 1 = 2