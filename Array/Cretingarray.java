
/* 
//Creating an Array 
// dataType arrayName[] = new dataType[size]
//int marks[] = {1,2,3}
//int moreNumbers[]={4,5,6};
//int numbers[]={1,2,3}
//String fruits[]={"apple","mango","orange"};
import java.util.*;

public class Cretingarray {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 5;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        update(marks);

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        /*
         * int marks[] = new int[100];
         * 
         * Scanner sc = new Scanner(System.in);
         * // int phy;
         * // phy = sc.nextInt();
         * 
         * marks[0] = sc.nextInt();
         * marks[1] = sc.nextInt();
         * marks[2] = sc.nextInt();
         * 
         * System.out.println("phy : " + marks[0]);
         * System.out.println("chem : " + marks[1]);
         * System.out.println("math: " + marks[2]);
         * 
         * int percentage = (marks[0] + marks[1] + marks[2]) / 3;
         * System.out.println("percentage = " + percentage + "%");
         * 
         */
import java.util.*;

public class Cretingarray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("Largest value is : " + getLargest(numbers));

    }
}