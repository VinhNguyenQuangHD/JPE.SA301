package exercise4;

public class ArrayReverse {
    public static void main(String[] args){
        int[] arr = {1,5,89,9,10,71,77};
        System.out.print("Original array:");
        for (int a : arr
             ) {
            System.out.print(a + " ");
        }
        int leng = arr.length;
        int i = leng -1, j = 0;
        int []arr_reverse = new int[leng];
        for (int a: arr
             ) {
            arr_reverse[j] = arr[i];
            j++;i--;
        }
        System.out.print("\nReverse array:");
        for (int a : arr_reverse
        ) {
            System.out.print(a + " ");
        }
    }
}
