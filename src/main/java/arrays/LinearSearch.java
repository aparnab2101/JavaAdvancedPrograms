package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={3,12,4,6,7,1,19};
        int target=19;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                System.out.println(i);
            }
        }
    }

}
