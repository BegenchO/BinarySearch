public class Main {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4};
        int x = 100;
        
        // Iterative Binary Search:
        //int result = binarySearch(arr, x);


        // Recursive Binary Search:
        int result = binarySearchRecursive(arr, x, 0, arr.length - 1);


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

        System.out.println(String.format("X: %d, Array length: %d", x, arr.length));

        while (l <= r) {

            //int m = l + (r-l)/2;
            int m = (l + r) / 2;

            System.out.println(String.format("Left: %d, Middle: %d, Right: %d", l, m, r));

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


        // Element not found
        return -1;

    } // end method





    // Recursive Binary Search
    // Returns the index of x
    // If not found, returns -1

    static int binarySearchRecursive(int[] arr, int x, int l, int r) {
        if (r >= l) {
            int m = (l + r)/2;

            System.out.println(String.format("Left: %d, Middle: %d, Right: %d", l, m, r));

            if (arr[m] == x) {
                return m;
            }

            if (arr[m] > x) {
                r = m - 1;
                return binarySearchRecursive(arr, x, l, r);
            }

            if (arr[m] < x) {
                l = m + 1;
                return binarySearchRecursive(arr, x, l, r);
            }
        }
        

        return -1;

    } // end method



} // end class
