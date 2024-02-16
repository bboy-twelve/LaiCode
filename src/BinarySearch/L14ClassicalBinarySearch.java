package BinarySearch;

public class L14ClassicalBinarySearch {
    /**
     *
     * @param array
     * @param target
     * @return if exit return  index else return -1;
     *  binary Search   everytime  we throw half of array
     *  if target < array[mid]  mid = right
     *  else if target > array[mid]  mid = left
     *  else return  index
     */
    public int binarySearch(int[] array, int target) {
        // Write your solution here
        //corner case---------------------
        if (array == null || array.length == 0) return  -1;

        //core ----------------------------------------
        int left = 0, right = array.length - 1;
        //
        while(left <= right){
            int mid = left +  (right - left) / 2;
            if(target < array[mid]){
                right = mid - 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            }else{
                return mid;
            }

        }
        return -1;

    }
}
