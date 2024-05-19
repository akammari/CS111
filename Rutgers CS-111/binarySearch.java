public class binarySearch {
    
    public static int binarySearch (int[] arr, int target, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] > target) return binarySearch(arr, left, mid - 1, target);

            return binarySearch(arr, left, mid + 1, target);
        }

        return -1;
    }
}
