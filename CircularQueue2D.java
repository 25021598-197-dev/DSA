
import java.util.Scanner;

public class CircularQueue2D {

    static final int ROWS = 3;
    static final int COLS = 3;
    static final int CAPACITY = ROWS * COLS;

    int[][] queue = new int[ROWS][COLS];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enqueue(int value) {
        if (size == CAPACITY) {
            System.out.println("Queue is full.");
            return;
        }

        rear = (rear + 1) % CAPACITY;

        int row = rear / COLS;
        int col = rear % COLS;

        queue[row][col] = value;
        size++;

        System.out.println("Value inserted.");
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        int row = front / COLS;
        int col = front % COLS;

        System.out.println("Removed value: " + queue[row][col]);

        front = (front + 1) % CAPACITY;
        size--;
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue values:");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % CAPACITY;
            int row = index / COLS;
            int col = index % COLS;

            System.out.print(queue[row][col] + " ");
        }

        System.out.println();
    }

    void display2DArray() {
        System.out.println("2D Array:");

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(queue[i][j] + "\t");
            }
            System.out.println();
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == CAPACITY;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue2D q = new CircularQueue2D();

        int choice, value;

        do {
            System.out.println("\n--- CIRCULAR QUEUE MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Display 2D Array");
            System.out.println("5. Size");
            System.out.println("6. isEmpty");
            System.out.println("7. isFull");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    q.display2DArray();
                    break;

                case 5:
                    System.out.println("Size = " + q.size);
                    break;

                case 6:
                    System.out.println(
                        q.isEmpty() ? "Queue is empty."
                                    : "Queue is not empty."
                    );
                    break;

                case 7:
                    System.out.println(
                        q.isFull() ? "Queue is full."
                                   : "Queue is not full."
                    );
                    break;

                case 8:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }
                             }
              
