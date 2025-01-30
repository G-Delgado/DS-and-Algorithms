import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<Integer>();
    
        // Add items to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    
        // Print the list
        System.out.println("Numbers: " + numbers);
    
        // Add an item at the beginning
        numbers.addFirst(5);
    
        // Add an item at the end
        numbers.addLast(40);
    
        // Print the updated list
        System.out.println("Updated numbers: " + numbers);
    
        // Remove the first item
        numbers.removeFirst();
    
        // Print the final list
        System.out.println("Final numbers: " + numbers);


        linkedListTest();
    }

    public static void linkedListTest() {
        DoublyLinkedListManual linkedList = new DoublyLinkedListManual();
        // Insert first 5 nodes into the linkedlist
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        System.out.println(linkedList.printLinkedList());

        // Insert at indexes
        linkedList.insertByIndex(6, 1);
        linkedList.insertByIndex(7, 4);
        linkedList.insertByIndex(8, 0);
        System.out.println(linkedList.printLinkedList());

        // Delete two nodes by val
        linkedList.deleteByVal(3);
        linkedList.deleteByVal(5);
        System.out.println(linkedList.printLinkedList());
    }

}

class Node {
    private Node prev;
    private Node next;
    private int val;

    public Node(int val) {
        this.val = val;
        prev = null;
        next = null;    
    }

    public int getVal() {
        return val;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public void setPrev(Node prevNode) {
        prev = prevNode;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
     
}
    
class DoublyLinkedListManual {
        private Node head;
        private Node tail;
        public DoublyLinkedListManual() {
            head = null;
            tail = null;
        }

        public Node  getHead() {
            return head;
        }

        public Node getTail() {
            return tail;
        }

        public void insert(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
            } else {
                Node last = head;
                while (last.getNext() != null) {
                    last = last.getNext();
                }
                newNode.setPrev(last);
                last.setNext(newNode);
                tail = newNode;

            }
        }

        public void deleteByVal(int val) {
            Node current = head;
            boolean deleted = false;
            if (current.getVal() == val) {
                head = current.getNext();
                head.setPrev(null);
                System.out.println("Successfully deleted the Node with the value: " + val);
            } else {
                while (current.getNext() != null && !deleted) {
                    current = current.getNext();
                    if (current.getVal() == val) {
                        Node prevNode = current.getPrev();
                        Node nextNode = current.getNext();
                        if (prevNode != null) {
                            prevNode.setNext(nextNode);
                        }
                        if (nextNode != null) {
                            nextNode.setPrev(prevNode);
                        }
                        deleted = true;
                        System.out.println("Successfully deleted the Node with the value: " + val);
                    }
                }
            }

            if (!deleted) {
                System.out.println("Didn't find a Node with that value: " + val);
            } 
        }

        public void insertByIndex(int val, int index) {
            Node newNode = new Node(val);
            Node current = head;
            int currentIndex = 0;
            boolean inserted = false;
            if (currentIndex == index) {
                head = newNode;
                newNode.setNext(current);
                current.setPrev(newNode);
                System.out.println("Inserted successfully on index: " + index);
            } else {
                while (current.getNext() != null && !inserted) {
                    current = current.getNext();
                    currentIndex += 1;
                    if (currentIndex == index) {
                        newNode.setNext(current);
                        current.getPrev().setNext(newNode);
                        newNode.setPrev(current.getPrev());
                        current.setPrev(newNode);
                        inserted = true;
                        System.out.println("Inserted successfully on index: " + index);
                    }
                }
            }
        }

        public String printLinkedList() {
            Node current = head;
            String printString = current.getVal()+ "";
            while (current.getNext() != null) {
                current = current.getNext();
                printString += " " + current.getVal();
            }

            return printString;
        }
}
