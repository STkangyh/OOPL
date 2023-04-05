import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation();
    }
    static class LinearEquation{
        private int a,b,c,d,e,f;
        public LinearEquation(){
            System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4");
            int[] r = new int[8];
            for (int i = 0; i < 8; i++) {
                r[i]=getter();
            }
            a=r[1]-r[3];
            b=r[0]-r[2];
            c=r[7]-r[5];
            d=r[6]-r[4];
            e=a*r[0]-b*r[1];
            f=c*r[4]-d*r[5];
            if (!isSolvable())
                System.out.println("The equation has no solution");
            else System.out.println("x is "+getX()+" and y is "+getY());
        }
        public int getter(){
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
        public boolean isSolvable() {
            return a * d - b * c != 0;
        }
        public double getX(){ return (a*d-b*c); }
        public double getY(){
            return (a*f-e*c)/(b*c-a*d);
        }
    }
}