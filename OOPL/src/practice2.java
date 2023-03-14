public class practice2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (count<=120){
            if(isEmirp(num)) {
                System.out.print(num + " ");
                ++count;
                ++num;
                if(count%10==0)
                    System.out.println(" ");
            }
            else ++num;
        }
    }
    public static boolean isEmirp(int number){
        return isPrime(number) && !practice1.isPalindrome(number) && isPrime(practice1.reverse(number));
    }
    public static boolean isPrime(int number){
        int i=2;
        boolean b = false;
        while(i<=number/2){
            if(number%i==0) {
                b=true;
                break;
            }
            else ++i;
        }
        return !b;
    }
}