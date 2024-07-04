
public class binarysearch {
    public static int binarysearch1(int arr[], int item) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] < item) {
                lo = mid + 1;
            } else if (arr[mid] > item) {
                hi = mid - 1;
            } else {
                return mid; // Item found
            }
        }

        return -1; // Item not found
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int result = binarysearch1(arr, 70);
        System.out.println(result); // It should print 6, the index of 70
    }
}
