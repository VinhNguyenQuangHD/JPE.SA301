package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequentNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("Input value:");
            n = sc.nextInt();
        }while (n <=0);
        int[] arr = new int[n];
        int a = 0;
        for (int i : arr
             ) {
            System.out.println("Input a:");
            i = sc.nextInt();
            arr[a] = i;
            a++;
        }

        int frequency = 0;
        ArrayList<Integer> position = new ArrayList<Integer>();
        System.out.println("Input frequency value:");
        frequency = sc.nextInt();
        int count  = 0, j = 0;
        for (int i : arr
             ) {
            if( arr[j] == frequency){
                count++;
                position.add(j);
            }
            j++;
        }


        System.out.print("\n" + "Amount of frequence:" + count );

        System.out.print("\n" + "Index:" );
        for (int  c: position
             ) {
            System.out.println(c + " ");
        }
    }
}
