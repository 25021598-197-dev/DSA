
import java.util.Scanner;

public class Implement2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // Input array elements
        System.out.println("Enter 9 elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(
                    "Enter element at [" + i + "][" + j + "]: "
                );
                arr[i][j] = sc.nextInt();
            }
        }

        // Display array
        System.out.println("\n2D Array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Sum of each row
        System.out.println("\nSum of each row:");

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            System.out.println("Row " + i + " sum = " + sum);
        }

        // Search an element
        System.out.print("\nEnter value to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println(
                        "Value found at [" + i + "][" + j + "]"
                    );
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Value not found.");
        }

        sc.close();
    }
  }
              
