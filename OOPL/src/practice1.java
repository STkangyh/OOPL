import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isPalindrome(number))
            System.out.println("Number you entered is a palindrome");
        else System.out.println("Number you entered is not a palindrome");
    }
    public static int reverse(int number){ //Return the reversal of an integer, i.e. reverse(456) return 654
        String rev = "" + number;
        StringBuilder sb = new StringBuilder(rev);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
    public static boolean isPalindrome(int number){ //Return true if number is a palindrome
        return number == reverse(number);
    }
}
