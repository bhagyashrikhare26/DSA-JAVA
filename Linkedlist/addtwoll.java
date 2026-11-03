
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

public class addtwoll {

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Convert Array to Doubly Linked List
    private static Node ConvertArr2Dll(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    // Add Two Numbers
    private static Node AddTwoNoLL(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;

        int carry = 0;

        Node dummyNode = new Node(-1);
        Node current = dummyNode;

        while (t1 != null || t2 != null || carry != 0) {
            int sum = carry;

            if (t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            current.next = newNode;
            newNode.back = current;
            current = newNode;
        }

        Node result = dummyNode.next;

        if (result != null) {
            result.back = null;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};

        Node head1 = ConvertArr2Dll(arr1);
        Node head2 = ConvertArr2Dll(arr2);

        System.out.print("List 1: ");
        print(head1);

        System.out.print("\nList 2: ");
        print(head2);

        Node result = AddTwoNoLL(head1, head2);

        System.out.print("\nSum: ");
        print(result);
    }
}
