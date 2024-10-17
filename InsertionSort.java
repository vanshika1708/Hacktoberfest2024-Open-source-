public class InsertionSort {
    
    // Method to perform insertion sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        // Iterate through each element starting from the second element
        for (int i = 1; i < n; i++) {
            int key = array[i];  // The element to be inserted
            int j = i - 1;
            
            // Shift elements of array[0...i-1] that are greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];  // Shift the element
                j = j - 1;
            }
            array[j + 1] = key;  // Insert the key at the correct position
        }
    }
    
    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Example array to be sorted
        int[] array = {12, 11, 13, 5, 6};
        
        // Print the original array
        System.out.println("Original Array:");
        printArray(array);
        
        // Perform insertion sort
        insertionSort(array);
        
        // Print the sorted array
        System.out.println("Sorted Array:");
        printArray(array);
    }
}
