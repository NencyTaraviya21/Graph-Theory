import java.util.Stack;

public class DFStraversal {
    public static void main(String[] args) {
        int edgs[][]={{0,1},{1,2},{2,0}};
        // int edgs2[][]={{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};
       DFStraversal dfs = new DFStraversal();
       dfs.dfsTraversal(edgs); 
    //    dfs.dfsTraversal(edgs2);
    }

    void dfsTraversal(int arr [][]){
        int size=arr.length;
        int [][] adjmatrix = new int[size][size];

        for(int[]edge:arr){
            int u = edge[0];
            int v = edge[1];
            adjmatrix[u][v]=1;
            adjmatrix[v][u]=1;

        }

        Stack<Integer> stack = new Stack<>();
        boolean [] visited = new boolean[size];

        stack.push(0);

        while(!stack.isEmpty()){
            int curr = stack.pop();
            
            if(!visited[curr]){
                visited[curr]=true;
                System.out.print(curr+"");

            for(int i=size-1;i>=0;i--){
                if(adjmatrix[curr][i]==1 && !visited[i]){
                    stack.push(i);
                }
            }
        }
        }
    }
}
