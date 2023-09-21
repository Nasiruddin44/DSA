/* 
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        int n, i, j, loc, a[], ptr, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to insert:");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i <= n - 1; i++) {
            temp = a[i];
            j = i - 1;
            while (temp < a[j] && j > -1) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

*/
public class Insertion {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSort(arr);
        printArr(arr);
    }

}
