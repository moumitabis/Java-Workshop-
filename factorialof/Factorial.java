package factorialof;

public class Factorial {
        public static void main(String[] args) {
            int i,fact=1;
            int num=5;
            for(i = 1; i<= num; ++i)
            {
                fact=fact*i;
            }
            System.out.printf("Factorial of %d = %d", num, fact);
        }
    }


