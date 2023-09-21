/* 
import java.util.Scanner;

public class Selectionsort {
 

    public static void main(String[] args) {
        int n, i, j, loc, a[], ptr, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter:");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter elements");

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        for (i = 0; i < n - 1; i++) {
            loc = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[loc]) {
                    loc = j;
                }
            }
            temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }

        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}


public class SelectionSort {
    public static void snkhan(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        snkhan(arr);
        printArr(arr);

    }
}
*/
public class Selectionsort {
    public static void Selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Selection(arr);
        printArr(arr);

    }
}