package factorialof;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 0, b, temp;
        int c=322;
        temp=c;
        while(c>0) {
            b=c%10;
            c=c/10;
            a=(a*10)+b;
        }
        if(temp==a) {
            System.out.printf("palindrome number");
        }
        else {
            System.out.printf("not a palindrome number");
        }
    }
}