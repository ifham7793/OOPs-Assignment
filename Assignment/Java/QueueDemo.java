class Queue {
    int[] queue;
    int front, rear, size;

    public Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
