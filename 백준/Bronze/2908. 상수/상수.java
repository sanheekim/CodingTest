import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
            int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
            int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        
            System.out.print(A>B?A:B);
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}