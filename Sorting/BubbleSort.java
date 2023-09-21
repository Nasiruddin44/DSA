
/* 
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int n, i, k, a[], ptr, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter Elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (k = 0; k < n - i - 1; k++) {
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println("Sorted Elements:" + a[i]);
        }

    }

}
/* 
public class BubbleSort {
    public static void main(String[] args) {
        for (int turn = 0; turn < arr.length - 1; i++) {
            for(int j=0;j<arr.length-1-turn;j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;

                }
            }

        }
    }
    public static voidArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
           System.out.print(arr[i]+" ");           
        }
        System.out.println();
    }
    public static void main(String[]) {
        int arr[]={5,4,1,3,2};
        BubbleSort(arr);
        printArr(arr);
    }
}

public class BubbleSort {
    public static void BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        BubbleSort(arr);
        printArr(arr);
    }
}
*/
import java.util.*;

public class BubbleSort {
    public static int search(int arr[], int X, int N) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 56, 2, 45, 789, 63 };
        int X = 56;
        // Function call
        int result = search(arr, arr.length, X);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index" + result);
        }
    }
}