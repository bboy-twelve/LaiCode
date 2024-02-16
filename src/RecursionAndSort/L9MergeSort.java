package RecursionAndSort;

public class L9MergeSort {
    public int[] mergeSort(int[] array) {
        // Write your solution here
        //check null array first
        if (array == null) {
            return array;
        }
        //core ----------------------
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }

    //mergeSort
    private void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);
    }

    // merge.       sort
    private void merge(int[] array, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }
        int leftIndex = left;
        int rightInex = mid + 1;
        while (leftIndex <= mid && rightInex <= right) {
            if (helper[leftIndex] <= helper[rightInex]) {
                array[left++] = helper[leftIndex++];
            } else {
                array[left++] = helper[rightInex++];
            }
        }
        while (leftIndex <= mid) {
            array[left++] = helper[leftIndex++];
        }
    }
}
