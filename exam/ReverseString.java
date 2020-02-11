package exam;
import java.util.*;
public class ReverseString {
    public static void main(String args[])
    {
        String S, reverse = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        S = in.nextLine();
        int length = S.length();
        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + S.charAt(i);
        System.out.println("Reverse of the string: " + reverse);
    }
}


