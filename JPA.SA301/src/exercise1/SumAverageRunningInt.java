package exercise1;

public class SumAverageRunningInt {
    public static void main(String[] args){
        int length = 100;
        int sum = 0;
        int[] arr = new int[length];
        for (int i = 1; i < length;i++){
            arr[i] = i;
            sum += i;
        }
        System.out.println("Average of all 100 first number is:" + (double)(sum/length));

    }
}
