public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        // here we want to use a for loop and initialize i to 1.
        //  i is smaller than the arr.length while i increment.
        // if the arr [i] is smaller than arr [i-1], it will return false 
        // as [i-1] will cause the starting point of the array to be higher and therefore not in order.
        //otherwise return true as
        for (int i =1; i < arr.length; i++) {
            if (arr [i] < arr [i-1])
            return false;
        }
        return true;
    }
}


