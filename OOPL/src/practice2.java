import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        int n;
        int m;
        int v;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        Queue queue = new Queue(n,v);
        int[][] array = new int[n][n];

        for (int i=0; i<m; i++){    // 간선 배열에 값을 넣는다.
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            array[a][b]=1;
            array[b][a]=1;
        }
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();*/

        for (int i=0;i<n;i++){
            for (int j=0; j<n; j++){
                if (array[i][j]==1) {
                    queue.addQueue(j+1);
                    array[i][j]=0; array[j][i]=0;   // 이미 접근했던 array 데이터 접근을 막기 위해 값 재정의
                }
                //System.out.print(queue.data[j]+" ");
            }
            //System.out.println();
        }
        //System.out.println();

        for (int i = 0; i < n; i++) {
            queue.deleteQueue();
        }
    }

    public static class Queue{
        private final int[] data;
        private int front=0;
        private final int dataMax;
        public Queue(int n, int v){
            data=new int[n*n];
            data[0]=v;
            front++;
            dataMax=n-1;
        }
        public void addQueue(int e){
            data[front]=e;
            if (front<=dataMax)
                front++;
            else
                front--;
        }
        public void deleteQueue(){   // k는 값을 리턴할 배열의 개수
            System.out.print(data[0]+" ");
            for (int i=0;i< data.length-1;i++){
                data[i]=data[i+1];
            }
        }
    }
}