package MQclasses;

public class ArraySwap {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // swapping index 1 and index 3
        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        // print updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}