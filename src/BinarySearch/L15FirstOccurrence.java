package BinarySearch;

public class L15FirstOccurrence {
    public int firstOccur(int[] array, int target) {
        // Write your solution here
        // corner case ------------------------------------
        if (array == null || array.length == 0) return -1;
        //core --------------------------------------------
        int left = 0, right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (target <= array[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (array[left] == target) return left;
        if (array[right] == target) {
            return right;
        } else return -1;
    }
}
