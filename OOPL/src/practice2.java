import java.util.Random;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        int computer = 0, You = 0;
        while (You-computer<2 || computer-You<2){
            Random r = new Random();
            int com = r.nextInt(3);
            switch (com) {
            case 0:
                System.out.println("computer is scissor.");
                break;
            case 1:
                System.out.println("computer is rock.");
                break;
            case 2:
                System.out.println("computer is paper.");
                break;
            }

            System.out.print("scissor (0), rock (1), paper(2): ");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();

            if(user == 1) {
                if(com == 2) {
                    System.out.println("You lost");
                    computer++;
                }
                else if(com == 0) {
                    System.out.println("You won");
                    You++;
                }
                else {
                    System.out.println("You drew");
                }
            }
            else if(user == 2) {
                if(com == 2) {
                    System.out.println("You drew");
                }
                else if(com == 0) {
                    System.out.println("You lost");
                    computer++;
                }
                else {
                    System.out.println("You won");
                    You++;
                }
            }
            else if(user == 0) {
                if(com == 2) {
                    System.out.println("You won");
                    You++;
                }
                else if(com == 0) {
                    System.out.println("You drew");
                }
                else {
                    System.out.println("You lost");
                    computer++;
                }
            }
            if(You-computer==2) {
                System.out.println("You won more than two times");
                break;
            }
            else if (computer-You==2) {
                System.out.println("You lost more than two times");
                break;
            }
            else continue;
        }
    }
}

