package queue;

class CircularQueue {
    int[] queue;
    int front, rear, size;

    CircularQueue(int n) {
        size = n;
        queue = new int[n];
        front = -1;
        rear = -1;
    }

    void enqueue(int x) {
        // Queue full condition
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = x;
    }

    void dequeue() {
        // Queue empty
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

class Codechef {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();   // 10 20 30 40

        q.dequeue();   // remove 10
        q.display();   // 20 30 40

        q.enqueue(50);
        q.enqueue(60); // circular insert

        q.display();   // 20 30 40 50 60
    }
}