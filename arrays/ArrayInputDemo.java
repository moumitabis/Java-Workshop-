package arrays;

import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n = s.nextInt();

        int arr[] = new int[n];


        for (int i = 0; i < n; i++) {//for reading array
            System.out.print("enter element at " + i + ": ");

            arr[i] = s.nextInt();

        }

        for (int i : arr) { //for printing array

            System.out.println(i);

        }
    }
}



