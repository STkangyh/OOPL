import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Course course1 = new Course("course1");
        System.out.print("Number of students in course 1: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i<num; i++){
            Scanner sc1 = new Scanner(System.in);
            course1.addStudent(sc1.next());
        }
        System.out.println(course1.getStudents());
        System.out.println(course1.getNumberOfStudents());
        course1.dropStudent("Peter");
        System.out.println("Number of students in course1 after drop Anne: "+course1.getNumberOfStudents());
        System.out.println(course1.getStudents());
        course1.clear();
        System.out.println("Number of students in course1 after clear: "+course1.getNumberOfStudents());
        System.out.println(course1.getStudents());
        System.out.println(course1.getNumberOfStudents());
    }
    public static class Course {
        private String courseName;
        private String[] students = new String[10];
        private int numberOfStudents;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void addStudent(String student) {
            if(students.length<=numberOfStudents){
                String[] temp = new String[students.length*2];
                System.arraycopy(students, 0, temp, 0, students.length);
                students = temp;
            }
            students[numberOfStudents] = student;
            numberOfStudents++;
        }

        public int getStudents() {
            for (int i = 0; i<numberOfStudents; i++){
                System.out.print(students[i]+", ");
            }
            return 0;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public String getCourseName() {
            return courseName;
        }

        public void dropStudent(String student) {
            // Left as an exercise in Exercise 10.9
            numberOfStudents--;
        }
        public void clear(){
            students=null;
            numberOfStudents=0;
            courseName=null;
        }
    }
}

