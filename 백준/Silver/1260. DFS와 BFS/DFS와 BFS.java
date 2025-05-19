import java.util.*;
import java.io.*;

public class Main{
    
    static int[][] graph;
    static boolean[] visit;
    static int N, M, V;

    static Stack<Integer> st = new Stack<>(); // DFS
	static Queue<Integer> q = new LinkedList<>(); // BFS
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        graph = new int[N+1][N+1]; // 좌표를 있는 그대로 가져오고자 함
        visit = new boolean[N+1]; // 방문 여부 확인, false로 초기화
        
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        
        DFS(V);
		visit = new boolean[N+1];
		System.out.println();
		BFS(V);
    }
    
    public static void DFS(int V) {
        visit[V] = true;
        System.out.print(V + " ");
        for (int i = 1; i <= N; i++) {
            if (graph[V][i] == 1 && !visit[i]) {
                DFS(i);
            }
        }
    }
	
	public static void BFS(int V) { // 큐를 활용해서 
		q.add(V);
		visit[V] = true;
		while(!q.isEmpty()) {
			int pt = q.poll();
			System.out.print(pt + " ");
			for(int i = 1 ; i <= N ; i++) {
				if(graph[pt][i] == 1 && !visit[i]) {
					q.add(i);
					visit[i] = true;				
				}
			}
		}
	}
}

/*
입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
탐색을 시작할 정점의 번호 V가 주어진다.
다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다.
V부터 방문된 점을 순서대로 출력하면 된다.
*/