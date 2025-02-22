import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i=1; i<=max; i++){
            st = new StringTokenizer(br.readLine()," ");
            sb.append("Case #"+ i +": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}