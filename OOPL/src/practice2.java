import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int[][] employee=new int[7][8];
        int[] time=new int[8];

        System.out.println("           Su M T W Th F Sa");
        for (int i=0;i<8;i++){
            System.out.print("Employee "+i+" ");
            for (int j=0;j<7;j++){
                employee[j][i]= sc1.nextInt();
                time[i]+=employee[j][i];
            }
        }

        ArrayList temp = new ArrayList<>();
        for(int i=0;i<8;i++){
            temp.add(time[i]);
        }


        for(int i = time.length-1; i>=0; i--){
            Arrays.sort(time); //오름차순으로 정렬

            String x = "Employee " + temp.indexOf(time[i]) + ": " + time[i];
            System.out.println(x);
        }
    }
}