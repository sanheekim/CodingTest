import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        String sReverse = sb.reverse().toString();
        System.out.println(s.equals(sReverse)?1:0);
    }
}

/*
첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
*/