package arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={3,2,5,11,1,6,12,23,4,14};
        int n=arr.length;
        for (int i = 1; i < n; i++) {
          int temp=arr[i];
          int j=i-1;
          while (j>=0 && arr[j] >temp){
           arr[j+1]=arr[j];
           j--;
          }
            arr[j + 1] = temp;
        }
        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
}
