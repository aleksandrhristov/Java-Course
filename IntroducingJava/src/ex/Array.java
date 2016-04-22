package ex;
/**
 * Created by clouway on 04.04.16.
 */
public class Array {
    private int arr[];

    public Array(int[] arr){
        this.arr = arr;
    }

    /**
     * Method that prints an array of integers.
     * @return
     */
    public String printArray(){
        String str = "";
        for(int i = 0; i< arr.length;i++){
            str += arr[i]+ " ";
        }
        return str;
    }

    /**
     * Method that returns the minimal value in an array of integers.
     * @return
     */
    public int getMinElement(){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Method that returns the sum value of an array of integers.
     * @return
     */
    public int getSum(){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    /**
     * Method that reverses the values of an array of integers.
     */
    public void reverseArray(){
        for(int i = 0; i < arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    /**
     * Sorting the array.
     */
    public void sort() {
        //low is first index and high is last index
        int low = 0, high = arr.length - 1;
        quickSort(low, high);
    }

    /**
     * QuickSort recursive function.
     * @param low
     * @param high
     */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        // pivot is middle index
        int pivot = arr[low + (high - low) / 2];
        // Divide into two arrays
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}