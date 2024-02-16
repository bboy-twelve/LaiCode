package BinarySearch;

public class L17ClosestInSortedArray {
    public int closest(int[] array, int target) {
        // Write your solution here
        //corner case --------------------------------------
        if(array == null || array.length == 0) return -1;
        //core ---------------------------------------------
        int left = 0, right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return Math.abs(array[left] - target) <= Math.abs(array[right] - target) ? left : right;
    }

}
