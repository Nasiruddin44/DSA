
/*
 Min Absolute Difference pairs
 A=[4,1,8,7]   B=[2,3,6,5]
A=[1,4,7,8]    B=[2,3,5,6]

|1-2|=1
|4-3|=1
|7-5|=2
|8-6|=2

 
import java.util.*;

public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("min absolute diff of pairs = " + minDiff);

    }
}
*/
import java.util.*;

public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int A[] = { 5, 8, 9, 3 };
        int B[] = { 8, 7, 1, 6 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("min absolute diff of pairs = " + minDiff);
    }
}