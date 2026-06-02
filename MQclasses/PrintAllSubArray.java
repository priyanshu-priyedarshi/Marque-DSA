package MQclasses;

public class PrintAllSubArray {

    public static void printSubarrays(int arr[]) {
        for(int i = 0; i < arr.length; i++) {   // chooses the starting index of subarray
            for (int j = i; j < arr.length; j++) {  // chooses the ending index of subarray

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");   // prints all elements from i to j
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3};
        printSubarrays(arr);
    }
}