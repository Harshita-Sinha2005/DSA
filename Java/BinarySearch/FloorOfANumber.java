public class FloorBinarySearch {

    // Function to find floor of x in arr[]
    public static int floor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;  // default if floor doesn't exist

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return arr[mid]; // exact match is the floor
            } else if (arr[mid] < x) {
                ans = arr[mid];   // potential floor
                low = mid + 1;    // try to find a bigger floor
            } else {
                high = mid - 1;   // mid > x, check left half
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int x = 5;

        int result = floor(arr, x);
        System.out.println("Floor of " + x + " is: " + result);
    }
}