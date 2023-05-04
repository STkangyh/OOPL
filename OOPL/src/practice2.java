import java.io.*;

public class practice2 {
    public static void main(String[] args) throws IOException {
        practice1.GeometricObjectComparable[] objects = {
                new Square(2), new practice1.Circle(5), new Square(5), new practice1.Rectangle(3, 4), new Square(4.5)
        };
        for (int i=0; i<5; i++){
            System.out.println("Area is "+objects[i].getArea());
            if (!objects[i].isFilled())
                objects[i].howToColor();
        }
    }

    public static interface Colorable {
        public abstract void howToColor();
    }

    public static class Square extends practice1.GeometricObjectComparable implements Colorable {
        protected double a;
        public Square(double a){
            this.a=a;
            setFilled(false);
        }
        public double getA() {
            return a;
        }

        @Override
        public double getArea() {
            return a*a;
        }

        public void setA(double a) {
            this.a = a;
        }

        @Override
        public double getPerimeter() {
            return 4*a;
        }

        public void howToColor() {
            System.out.println("Color all four sides");
        }

        @Override
        public void setColor(String color) {
            super.setColor(color);
        }

        @Override
        public String getColor() {
            return super.getColor();
        }
    }
}