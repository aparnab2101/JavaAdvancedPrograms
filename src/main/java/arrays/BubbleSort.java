package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 6, 15,7, 9, 1, 2, 4};
        int n=arr.length,temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        // Print sorted array
        System.out.println("After Sorting");
        for (int ar : arr) {
            System.out.println(ar);
        }
    }
}
