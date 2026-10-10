
import java.util.Scanner;

public class QueueLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;
    int size = 0;

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Value inserted successfully.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Removed value: " + front.data);
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front value: " + front.data);
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;

        System.out.println("Queue values:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList queue = new QueueLinkedList();

        int choice, value;

        do {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Size");
            System.out.println("6. isEmpty");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    queue.peek();
                    break;

                case 5:
                    System.out.println("Size = " + queue.getSize());
                    break;

                case 6:
                    System.out.println(
                        queue.isEmpty() ? "Queue is empty."
                                        : "Queue is not empty."
                    );
                    break;

                case 7:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
