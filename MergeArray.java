public class MergeArray {
    private static int[] mergeArrays(int [] arr1, int [] arr2) {
        int [] mergedArray = new int[arr1.length + arr2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        // Traverse both arrays
        while (i < arr1.length && j < arr2.length) {
            
            // Push 3 elements from 1st array
            
            mergedArray[k++] = arr1[i++];
            
            // Check for IndexOutOfBoundsException
            if (i < arr1.length) {
                mergedArray[k++] = arr1[i++];
            }
            
            // Check for IndexOutOfBoundsException
            if (i < arr1.length) {
                mergedArray[k++] = arr1[i++];
            }
            
            // Push 1 element from second array
            mergedArray[k++] = arr2[j++];
        }
        
        // Push remaining elements from 1st array if left
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        
        // Push remaining elements from 2nd array if left
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        
        return mergedArray;
    }
    
    private static void printElementsOfArray(int arr[]) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int n1 = 50;
        int start1 = 4;
        int arr1[] = new int[n1];
        for (int i=0;i<n1;i++) {
            arr1[i] = start1 * (i+1);
        }
        
        int n2 = 20;
        int start2 = 3;
        int arr2[] = new int[n2];
        
        for (int i=0;i<n2;i++) {
            arr2[i] = start2 * (i+1);
        }
        
        int [] mergedArray = mergeArrays(arr1, arr2);
        printElementsOfArray(mergedArray);
	}
}
