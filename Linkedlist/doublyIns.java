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

public class doublyIns 
{
    
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
    private static Node InsertBeforehead(Node head , int val)
    {
        Node newNode = new Node (val , head, null);
        head.back = null;
        return newNode;
    }
    private static Node InsertBeforeTail(Node head, int val )
    {
        if(head.next == null)
        {
            return InsertBeforehead(head, val);
        }
        Node tail = head;
        while(tail.next != null)
        {
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node (val, tail, prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }
    private static Node insertBeforeKthElement(Node head , int k, int val)
    {
        if(k==1)
        {
            return InsertBeforehead(head , val);
        }
        Node temp = head;
        int cnt = 0;
        while(temp != null)
        {
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val , temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
    private static void insertBeforeNode(Node node , int val)
    {
        Node prev = node.back;
        Node newNode = new Node (val,node,prev);
        prev.next = newNode;
        node.back = newNode;

    }

    public static void main(String[] args) 
    {
        int[] arr = {12, 5, 6, 8};
        Node head = CnvertArr2Dll(arr);
        //head = InsertBeforehead(head, 10);
        //head = InsertBeforeTail(head, 10);
        //head = insertBeforeKthElement(head,2, 10);
        insertBeforeNode(head.next.next, 100);
        print(head);
        
    }
}
