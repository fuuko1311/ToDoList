class Node {
    String data;
    Node next;

    public Node(String inputData,Node inputNext) {
        data = inputData;
        next = inputNext;
    }
}

class ToDoList {
    private Node head, tail;

    public ToDoList() {
        head = tail = null;
    }

    // Method to add a task to the to-do list
    public void addTask(String task) {
        Node newNode = new Node(task, null);

        //empty linked list
        if(head == null){
            head = tail = newNode;
        }
        else {
            //add to the end of the linked list
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to mark a task as completed
    public void markAsCompleted(String task) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(task)) {
                // Assuming completion is represented by a boolean flag
                // You can modify this part based on your requirements
                // For example, set a 'completed' field in the Node class
                System.out.println("Task '" + task + "' marked as completed.");
                break;
            }
            current = current.next;
        }
    }

    // Method to remove a task from the to-do list
    public void removeTask(String task) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data.equals(task)) {
                if (prev == null) {
                    // If the task is in the head node
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Task '" + task + "' removed.");
                break;
            }
            prev = current;
            current = current.next;
        }
    }
}
