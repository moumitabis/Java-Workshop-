package factorialof;


public class ArmstrongNumber {
 public static void main(String[] args) {
     int a=0,b,temp;
     int d=153;
     temp=d;
     while(d>0) {
          b=d%10;
          d=d/10;
          a=a+(b*b*b);

     }
     if(temp==a) {
         System.out.printf("armstrong number");}
     else {
         System.out.printf("not an armstrong number");
     }

     }


 }

