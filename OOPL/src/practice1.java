import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        while(true){
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter the number of the lines: ");
            int rows = ip.nextInt();
            System.out.println("");
            if(rows<10) {
                System.out.println("Number should be greater than 10");
                continue;
            }
            else
                for(int i=1;i<=rows;i++){
                    for(int space=1;space<=(rows-i)*2;space++)
                        System.out.print(" ");
                    for(int k=i;k>=1;k--)
                        System.out.print(" "+k);
                    for (int l=2;l<=i;l++)
                        System.out.print(" "+l);
                    System.out.println();
                }
                break;
        }
    }
}
