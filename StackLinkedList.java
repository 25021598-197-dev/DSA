
import java.util.Scanner;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;
    int size = 0;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;

        System.out.println("Value pushed successfully.");
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped value: " + top.data);
            top = top.next;
            size--;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top value: " + top.data);
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node temp = top;

        System.out.println("Stack values:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedList stack = new StackLinkedList();

        int choice, value;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
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
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    stack.peek();
                    break;

                case 5:
                    System.out.println("Size = " + stack.getSize());
                    break;

                case 6:
                    System.out.println(
                        stack.isEmpty() ? "Stack is empty."
                                        : "Stack is not empty."
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
      
