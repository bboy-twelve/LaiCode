package BinarySearch;

public class L267SearchInSortedMatrixI {
    /**
     * @param matrix
     * @param target
     * @return if target is exit return index[][]
     * else return {{-1,-1}}
     */
    public int[] search(int[][] matrix, int target) {
        // Write your solution here
        // corner case --------------------------------------
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }
        //core ----------------------------------------------
        int left = 0, right = matrix.length * matrix[0].length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int col = mid % matrix[0].length;
            int row = mid / matrix[0].length;
            if (target < matrix[row][col]) {
                right = mid - 1;
            } else if (target > matrix[row][col]) {
                left = mid + 1;

            } else {
                return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }

}
