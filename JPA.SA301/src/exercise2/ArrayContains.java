package exercise2;

import java.util.Scanner;

public class ArrayContains {
    public static void main(String[] args){
        String[] arr = {"FPT","Fresher","Academy","2018"};
        Scanner sc = new Scanner(System.in);
        String sValue = null;
        System.out.println("Input sValue:");
        sValue = sc.nextLine();
        for (String c: arr
             ) {
            if(c.equals(sValue)){
                System.out.println("Contained !!");
                break;
            }else{
                System.out.println("Not contained !!");
            }
        }

    }
}
