// delete the head and tail in doubly linkedlist

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

public class doublydel {
    
    private static void print(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node CnvertArr2Dll (int[] arr)
    {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i], null, prev);

            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    // delete head
    private static Node deletehead(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next= null;
        return head;
    }
    // delete Tail
    private static Node deleteTail(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node tail = head;
        while(tail.next != null)
        {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }
    private static Node removekthelement(Node head, int k)
    {
        if(head == null)
        {
            return null;
        }
        int cnt = 0;
        Node knode = head;
        while(knode != null)
        {
            cnt++;
            if(cnt == k) break;
            knode = knode.next;
        }
        Node prev = knode.back;
        Node front = knode.next;
        
        if(prev == null && front == null )
        {
            return null;
        }
        else if(prev == null)
        {
            return deletehead(head);
        }
        else if(front == null)
        {
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        
        knode.next = null;
        knode.back = null;
        return head;
    }
    private static void deleteNode(Node temp)
    {
        Node prev = temp.back;
        Node front = temp.next;
        
        if(front == null)
        {
            prev.next = null;
            temp.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;
        
        temp.next = temp.back = null;
        
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = CnvertArr2Dll(arr);
        // head = removekthelement(head, 3h);
        deleteNode(head.next); 
        // simply head.next.next keep to travers the delete a node;
        print(head);
        
    }
}
