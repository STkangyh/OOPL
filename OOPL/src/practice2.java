
public class practice2 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i <=20; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
    public static class Queue{
        private int[] element;
        private int size=0;
        public Queue(){
            element = new int[8];
        }
        public void enqueue(int v){
            if (size>=getSize()){
                int[] temp = new int[element.length*2];
                System.arraycopy(element,0,temp,0,element.length);
                element=temp;
            }
            element[size++]=v;
        }
        public int dequeue(){
            int temp;
            for(int i=0;i<size;i++){
                temp=element[i];
                element[i]=element[i+1];
                element[i+1]=temp;
            }
            return element[size-1];
        }
        public boolean empty(){
            return element[0]==element[element.length-1];
        }
        public int getSize(){
            return element.length;
        }
    }
}