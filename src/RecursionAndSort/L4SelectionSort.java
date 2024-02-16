package RecursionAndSort;

public class L4SelectionSort {
    public int[] solve(int[] array) {
        // Write your solution here
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    swap(array, i, j);
                }
            }
        }
        return  array;
    }
    private void swap(int[] array, int a, int b){
        int tem = array[a];
        array[a] = array[b];
        array[b]= tem;
    }
}
