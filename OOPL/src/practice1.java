public class practice1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(1,2);
        // Display the max circle
        Circle circle = (Circle)GeometricObjectComparable.max(circle1, circle2);
        Rectangle rectangle = (Rectangle)GeometricObjectComparable.max(rectangle1, rectangle2);
        System.out.println("The max circle's area is " + circle.getArea());
        System.out.println("The max rectangle's area is " + rectangle.getArea());
        System.out.println(circle);
        System.out.println(rectangle);
    }

    public static interface Comparable {
    }

    // practice1.GeometricObject.java: The abstract practice1.GeometricObject class
    public abstract static class GeometricObject{
      private String color = "white";
      private boolean filled;

      /**Default construct*/
      protected GeometricObject() {
      }

      /**Construct a geometric object*/
      protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
      }

      /**Getter method for color*/
      public String getColor() {
        return color;
      }

      /**Setter method for color*/
      public void setColor(String color) {
        this.color = color;
      }

      /**Getter method for filled. Since filled is boolean,
         so, the get method name is isFilled*/
      public boolean isFilled() {
        return filled;
      }

      /**Setter method for filled*/
      public void setFilled(boolean filled) {
        this.filled = filled;
      }

      /**Abstract method findArea*/
      public abstract double getArea();

      /**Abstract method getPerimeter*/
      public abstract double getPerimeter();

    }

    public static class GeometricObjectComparable extends GeometricObject implements Comparable, practice2.Colorable {
        public double getArea() {
            return 0;
        }

        @Override
        public double getPerimeter() {
            return 0;
        }

        public static String compareTo(GeometricObject x, GeometricObject y) {
            if (x.getArea() > y.getArea())
                return "x";
            else if (x.getArea() < y.getArea())
                return "y";
            else if (x.getPerimeter() > y.getPerimeter())
                return "x";
            else if (x.getPerimeter() < y.getPerimeter())
                return "y";
            else
                return "same";
        }
        public static GeometricObject max(GeometricObject x, GeometricObject y) {
          if (compareTo(x,y)=="x")
            return x;
          else return y;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides");
        }
    }

    public static class Rectangle extends GeometricObjectComparable implements practice2.Colorable {
        private double width;
        private double height;
        public double getArea() {
            return getWidth() * getHeight();
        }
        public double getPerimeter() {
            return 2 * (getWidth() + getHeight());
        }
        @Override
        public boolean equals(Object rect) {
            return this.width == ((Rectangle)rect).getWidth() &&
                    this.height == ((Rectangle)rect).getHeight();
        }

        @Override
        public String toString() {
            return "[rectangle] width: " + width + " height: " + height;
        }
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
            setFilled(true);
        }

        /** Return width */
        public double getWidth() {
            return width;
        }

        /** Set a new width */
        public void setWidth(double width) {
            this.width = width;
        }

        /** Return height */
        public double getHeight() {
            return height;
        }

        /** Set a new height */
        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides");
        }
    }

    public static class Circle extends GeometricObjectComparable implements practice2.Colorable {
        public Circle(double r){
            setRadius(r);
            setFilled(true);
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }
        protected double radius;

        // Construct circle with specified radius

        // Construct a circle with specified radius, weight, and color
        public Circle(double radius, String color, double weight) {

            this.radius = radius;
        }

        // Getter method for radius
        public double getRadius() {
            return radius;
        }

        // Setter method for radius
        public void setRadius(double radius) {
            this.radius = radius;
        }


        // Override the equals() method defined in the Object class
        @Override
        public boolean equals(Object circle) {
            return this.radius == ((Circle)circle).getRadius();
        }

        @Override
        public String toString() {
            return "[practice1.Circle] radius = " + radius;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides");
        }
    }
}