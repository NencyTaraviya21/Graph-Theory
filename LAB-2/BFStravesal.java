public class BFStravesal {
    public static void main(String[] args) {
        BFStravesal travesal = new BFStravesal();
        int edgs[][]={{0,1},{1,2},{2,0}};
        int edgs2[][]={{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};
        travesal.bfstraversal(edgs);
        travesal.bfstraversal(edgs2);

    }

    // void enqueue(int num){
    //     int [] Q = new int[10];
    //     int front = -1, rear=-1;
    //     if(rear>=9){
    //         System.out.println("queue overflow");
    //     }
    //     else{
    //         rear++;
    //         Q[rear]=num;
    //     }
    // }

    void bfstraversal(int arr[][]){
        int size = arr.length;
        int front = 0, rear=0;
        int [] queue = new int[size];
        boolean [] visited = new boolean[size];

        queue[rear++]=0;
        visited[0]=true;

        while(front<rear){
            int curr = queue[front++]; //deqeueu
            System.out.print(curr+" ");

            for(int i=0;i<arr[curr].length;i++){
                int neigbour = arr[curr][i];
                if(!visited[neigbour]){
                    visited[neigbour]=true;
                    queue[rear++]=neigbour;    
                }
            }
            
        }   
    }
}
