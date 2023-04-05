import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation();
    }
    static class LinearEquation{
        private int a,b,c,d,e,f;
        public LinearEquation(){
            System.out.println("Enter a,b,c,d,e,f");
            a=getter();
            b=getter();
            c=getter();
            d=getter();
            e=getter();
            f=getter();
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
        public double getX(){
            return (e*d-b*f)/(a*d-b*c);
        }
        public double getY(){
            return (a*f-e*c)/(a*d-b*c);
        }
    }
}

