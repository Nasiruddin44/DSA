
/* 
import java.util.*;

public class Arrayyyy {
    static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int deleteElement(int arr[], int n, int key) {
        // Findto be position of element
        // deleted
        int pos = findElement(arr, n, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        // Deleting element
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 50, 30, 40, 20 };
        int n = arr.length;
        int key = 30;
        System.out.println("Array before deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // function call
        n = deleteElement(arr, n, key);
        System.out.println("\n\nArray after deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
*/
/* 
import java.util.*;

public class Arrayyyy {
    // Binary search
    static int BinarySearch(int arr[], int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return BinarySearch(arr, (mid + 1), high, key);
        }
        return BinarySearch(arr, low, (mid - 1), key);
    }

    static int deleteElement(int arr[], int n, int key) {
        int pos = BinarySearch(arr, 0, n - 1, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        // Deleting elements
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int key = 30;
        System.out.println("Array before deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        // Function call
        n = deleteElement(arr, n, key);
        System.out.println("\n\nArray after deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
*/
import java.util.*;

public class Arrayyyy {
    public static int search(int arr[], int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // function call
        int result = search(arr, arr.length, x);
        if (result == -1) {
            System.out.print(
                    "Element is not present in array");
        } else {
            System.out.print("Element is present at index "
                    + result);
        }
    }
}