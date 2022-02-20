public class Main {
   public static void main(String[] args) {
       int arr[] = {2,3,4,10,40};
        int x = 10;
        
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }

    } // end main 

    // Iterative Binary Search on Array
    
    // Returns index of x if present in array
   // else returns -1

   static int binarySearch(int arr[], int x) {
       int l = 0;
       int r = arr.length - 1;

       while (l <= r) {
           int m = l + (r-l)/2;

           // Check if x present in the middle
           if (arr[m] == x) {
               return m;
           }

           // if x is greater, ignore left half
           if (arr[m] < x) {
               l = m + 1;
           } else {
               r = m - 1;
           }

       } // end while

       return -1;

   } // end method

} // end class
