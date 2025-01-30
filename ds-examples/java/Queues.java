import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {
        QueueManual queue = new QueueManual();
        // Add 5 elements
        queue.queue(0);
        queue.queue(1);
        queue.queue(2);
        queue.queue(3);
        queue.queue(4);
        System.out.println(queue.printQueue());

        // Remove 2 elements
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.printQueue());

        //See the first element
        System.out.println(queue.peek());

    }
}

class QueueManual {
    // It can be done through LinkedList
    // LinkedList -> enqueue (addLast), dequeue (removeFirst)
    // Or Through ArrayList. -> enqueue (add), dequeue (remove(0))
    private LinkedList<Integer> queue;

    public QueueManual() {
        queue = new LinkedList<>();
    }

    public void queue(int item) {
        queue.addLast(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            throw new IllegalStateException("Queue is Empty");
        } else {
            return queue.removeFirst();
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            throw new IllegalStateException("Queue is Empty");
        } else {
            return queue.getFirst();
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public String printQueue() {
        String printString = "";
        for (int i = 0; i < queue.size(); i++) {
            printString += queue.get(i) + " ";
        }
        return printString;
        
    }
}
