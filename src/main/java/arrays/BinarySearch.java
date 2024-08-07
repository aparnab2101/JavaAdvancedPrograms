package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 9, 10};
        int target=10,left=0,right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target) {
                System.out.println(mid);
break;


            } else if (target<arr[mid]) {
                right=mid-1;
            }else {
                left=mid+1;
            }

        }
        if (left>right){
            System.out.println("not found");
        }

    }
}
