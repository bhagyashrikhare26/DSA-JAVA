/* Reverse a doubly linkedlist O(2n) Bruteforce solution. we use stack external memory.
    Node temp = head;
    while(temp != null)
    {
        st.push(temp.data);
        temp= temp.next;
    }
    temp = head;
    while( temp != null)
    {
        temp.data = st.top();
        st.pop();
        temp = temp.next;
    }
 */
//Reverse a doubly linkedlist O(n) optimize solution.
class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class RevDLL {

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Convert Array to Doubly Linked List
    private static Node ConvertArr2Dll(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    // Reverse Doubly Linked List
    private static Node ReverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node back = null;
        Node current = head;

        while (current != null) {
            back = current.back;
            current.back = current.next;
            current.next = back;
            current = current.back;
        }

        return back.back;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};

        Node head = ConvertArr2Dll(arr);

        System.out.print("Original: ");
        print(head);

        head = ReverseDLL(head);

        System.out.print("\nReversed: ");
        print(head);
    }
}
