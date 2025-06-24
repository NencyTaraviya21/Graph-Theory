class DFStraversalRecurrsion{
    public static void main(String[] args) {
        int[][] edgs = new int[][] {
            {1, 2},         
            {0, 2},         
            {0, 1, 3, 4},   
            {2},            
            {2}             
        };

        int n = edgs.length;
        boolean[] visited = new boolean[n];
        DFStraversalRecurrsion dfs = new DFStraversalRecurrsion();
        dfs.dfsRecursive(0, visited, edgs);  
    
    }

 void dfsRecursive(int node, boolean[] visited, int[][] graph) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited, graph);
            }
        }
    }

}