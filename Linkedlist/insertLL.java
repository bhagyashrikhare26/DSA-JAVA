// insert head done , insert tail 
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class insertLL {

    private static Node ConvertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static Node Inserthead(int val, Node head) {
        Node temp = new Node(val, head);
        return temp;
    }
    private static Node InsertTail(int val , Node head)
    {
        if(head == null)
        {
            return new Node(val);
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    private static Node InsertPosition(Node head, int ele , int k)
    {
        if(head == null)
        {
            if(k==1)
            {
                return new Node(ele);
            }
            else
            {
                return head;
            }
        }
        if(k==1)
        {
            return new Node(ele, head);
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null)
        {
            cnt++;
            if(cnt == (k-1))
            {
                Node x = new Node(ele, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    private static Node InsertBeforevalue(Node head, int ele , int val)
    {
        if(head == null)
        {
            return null;
        }
        if(head.data == val )
        {
            return new Node(ele, head);
        }
        Node temp = head;
        boolean found = false;
        while(temp.next != null)
        {
            if(temp.next.data == val)
            {
                Node x = new Node(ele, temp.next);
                temp.next = x;
                found = true;
                break;
            }
            temp = temp.next;
        }
        if(found == false) System.out.println("Linkedlist not found");
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8};

        Node head = ConvertArr2LL(arr);

        //head = Inserthead(100, head);
        //head = InsertTail(100, head);
        //Node temp = head;
        //head = InsertPosition(head,100,1); 
        Node temp = head;
        head = InsertBeforevalue(head,100,4);
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
