import java.util.Stack;

public class implemequeueusstack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    void enqueue(int data) {
        stack1.push(data);
    }

    // Dequeue operation
    void dequeue() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(stack2.pop());
    }

    public static void main(String[] args) {

        implemequeueusstack q = new implemequeueusstack();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.dequeue();
        q.dequeue();
        
    }
}