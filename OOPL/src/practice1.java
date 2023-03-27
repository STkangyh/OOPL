import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list: ");
        int[] list = new int[num];
        for(int i=0;i<num;i++){
            list[i]=scanner.nextInt();
        }

        partitions(list);
        System.out.print("After the partition, the list is");
        for (int i : list) {
            System.out.print(" " + i);
        }
    }
    public static int partitions(int[] list) {
        int pivot=0;
        for (int i=1;i<list.length;i++) {
            for (int j = 1; j < list.length; j++) {
                if (list[j] > list[list.length - i]) {
                    int temp = list[list.length - i];
                    list[list.length - i] = list[j];
                    list[j] = temp;
                }
            }
            if (i == list.length - i){
                int temp=list[pivot];
                list[pivot]=list[i];
                list[i]=list[pivot];
            }
        }
        return pivot;
    }
}

