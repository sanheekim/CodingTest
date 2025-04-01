import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int king = 1;
        int queen = 1;
        int look = 2;
        int bs = 2;
        int knight = 2;
        int pawn = 8;
        
        king = king-Integer.parseInt(st.nextToken());
        queen = queen-Integer.parseInt(st.nextToken());
        look = look-Integer.parseInt(st.nextToken());
        bs = bs-Integer.parseInt(st.nextToken());
        knight = knight-Integer.parseInt(st.nextToken());
        pawn = pawn-Integer.parseInt(st.nextToken());
        
        System.out.print(king+" "+queen+" "+look+" "+bs+" "+knight+" "+pawn+" ");
    }
}
/*
킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
*/