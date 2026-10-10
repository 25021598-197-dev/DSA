import java.util.Scanner;

public class queueoperation {
  public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         int queue[] = new int[5];

         int front = 0;
         int rear = -1;
         int size = 0;

         int choice;
         int value;

         do {
             System.out.println(" QUEUE MENU ");
             System.out.println("1. Enqueue");
             System.out.println("2. Dequeue");
             System.out.println("3. Display");
             System.out.println("4. Size");
             System.out.println("5. isEmpty");
             System.out.println("6. isFull");
             System.out.println("7. Exit");

             System.out.print("Enter choice: ");
             choice = sc.nextInt();

             // 1. Enqueue
             if (choice == 1) {

                 if (size == 5) {
                     System.out.println("Queue is full");
                 } else {
                     System.out.print("Enter value: ");
                     value = sc.nextInt();

                     rear = rear + 1;
                     queue[rear] = value;
                     size = size + 1;

                     System.out.println("Value added");
                 }

             // 2. Dequeue
             } else if (choice == 2) {

                 if (size == 0) {
                     System.out.println("Queue is empty");
                 } else {
                     System.out.println("Removed value: " + queue[front]);

                     front = front + 1;
                     size = size - 1;
                 }

             // 3. Display
             } else if (choice == 3) {

                 if (size == 0) {
                     System.out.println("Queue is empty");
                 } else {

                     for (int i = front; i <= rear; i++) {
                         System.out.println(queue[i]);
                     }
                 }

             // 4. Size
             } else if (choice == 4) {

                 System.out.println("Size: " + size);

             // 5. isEmpty
             } else if (choice == 5) {

                 if (size == 0) {
                     System.out.println("Queue is empty");
                 } else {
                     System.out.println("Queue is not empty");
                 }

             // 6. isFull
             } else if (choice == 6) {

                 if (size == 5) {
                     System.out.println("Queue is full");
                 } else {
                     System.out.println("Queue is not full");
                 }

             // 7. Exit
             } else if (choice == 7) {

                 System.out.println("Program ended");

             } else {

                 System.out.println("Wrong choice");
             }

         } while (choice != 7);

         sc.close();
     }
               }
