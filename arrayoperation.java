import java.util.Scanner;
public class arrayoperation {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  int[] arr = new int[10];
   int size = 0;
    int choice, value, index;
   do {
             System.out.println("-- ARRAY MENU --");
             System.out.println("1. Add value");
             System.out.println("2. Insert at index");
             System.out.println("3. Fill array");
             System.out.println("4. Delete last element");
             System.out.println("5. Delete by index");
             System.out.println("6. Display");
             System.out.println("7. Search value");
             System.out.println("8. Get value at index");
             System.out.println("9. Replace/Update value");
             System.out.println("10. Size");
             System.out.println("11. Exit");
       System.out.print("Enter your choice: ");
             choice = sc.nextInt();
           //  1. Add value
             if (choice == 1) {
     if (size == 10) {
  System.out.println("Array is full.");
                 } else {
                     System.out.print("Enter value: ");
                     value = sc.nextInt();
   arr[size] = value;
                     size++;
   System.out.println("Value added.");
                 }
             }
          // 2. Insert at index
             else if (choice == 2) {

                 if (size == 10) {
                     System.out.println("Array is full.");
                 } else {
                     System.out.print("Enter index: ");
                     index = sc.nextInt();

                     System.out.print("Enter value: ");
                     value = sc.nextInt();

                     if (index < 0 || index > size) {
                         System.out.println("Invalid index.");
                     } else {

                         for (int i = size; i > index; i--) {
                             arr[i] = arr[i - 1];
                         }
     arr[index] = value;
                         size++;

                         System.out.println("Value inserted.");
                     }
                 }
             }

             // 3. Fill array
             else if (choice == 3) {

                 while (size < 10) {

                     System.out.print("Enter value (-1 to stop): ");
                     value = sc.nextInt();

                     if (value == -1) {
                         break;
                     }

                     arr[size] = value;
                     size++;
                 }

                 System.out.println("Array filled.");
             }

             // 4. Delete last element
             else if (choice == 4) {

                 if (size == 0) {
                     System.out.println("Array is empty.");
                 } else {
                     size--;
                     System.out.println("Last value deleted.");
                 }
             }

             // 5. Delete by index
             else if (choice == 5) {

                 if (size == 0) {
                     System.out.println("Array is empty.");
                 } else {

                     System.out.print("Enter index: ");
                     index = sc.nextInt();

                     if (index < 0 || index >= size) {
                         System.out.println("Invalid index.");
                     } else {

                         for (int i = index; i < size - 1; i++) {
                             arr[i] = arr[i + 1];
                         }

                         size--;

                         System.out.println("Value deleted.");
                     }
                 }
             }

             // 6. Display
             else if (choice == 6) {

                 if (size == 0) {
                     System.out.println("Array is empty.");
                 } else {

                     System.out.print("Array: ");

                     for (int i = 0; i < size; i++) {
                         System.out.print(arr[i] + " ");
                     }

                     System.out.println();
                 }
             }

             // 7. Search
             else if (choice == 7) {

                 System.out.print("Enter value to search: ");
                 value = sc.nextInt();

                 for (int i = 0; i < size; i++) {

                     if (arr[i] == value) {
                         System.out.println("Value found at index " + i);
                     }
                 }
             }

             // 8. Get value
             else if (choice == 8) {

                 System.out.print("Enter index: ");
                 index = sc.nextInt();

                 if (index >= 0 && index < size) {
                     System.out.println("Value = " + arr[index]);
                 } else {
                     System.out.println("Invalid index.");
                 }
             }

             // 9. Update value
             else if (choice == 9) {

                 System.out.print("Enter index: ");
                 index = sc.nextInt();

                 if (index >= 0 && index < size) {

                     System.out.print("Enter new value: ");
                     value = sc.nextInt();

                     arr[index] = value;

                     System.out.println("Value updated.");
                 } else {
                     System.out.println("Invalid index.");
                 }
             }

             // 10. Size
             else if (choice == 10) {

                 System.out.println("Size = " + size);
             }

             // 11. Exit
             else if (choice == 11) {

                 System.out.println("Program ended.");
             }
     else {
                 System.out.println("Invalid choice.");
             }
       } while (choice != 11);
    sc.close();
     }
}
