import java.util.Scanner;
public class bfs {

    static int total;
    static int [][] graph = new int[20][20] ;
    static int visited[] = new int[20];

    public static void main(String args[]) {
        try {
            int i, j;
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("\n Enter the size of the adjacency matrix::-");
            total = sc.nextInt();
            System.out.println("\n Enter the adjacency matrix::-");
            for (i = 0; i < total; i++) {
                for (j = 0; j < total; j++) {
                    graph[i][j] = sc1.nextInt();
                }
            }

            for (i = 0; i < total; i++) {
                visited[i] = 0;
            }

            /*for ( i:visited) {
                visited[i] = 0;
            }*/
            System.out.println("\n The Bfs Traversal is given by::");
            bfs(0);

        }
        catch (Exception ob){
            System.out.println("\n An error occured "+ob);
        }
    }
    static void bfs(int vertex) {
        try {
            int j;
            System.out.print(vertex + "\t");
            visited[vertex] = 1;
            for (j = 0; j < total; j++) {
                if (!(visited[j] == 1) && graph[vertex][j] == 1) {
                    bfs(j);
                }
            }
        }
        catch (Exception ob){
            System.out.println("\n AN error occurred in the bfs function...");
        }
    }


}
