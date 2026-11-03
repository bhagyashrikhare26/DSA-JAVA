// delete head in linkedlist
class Node
{
    int data;
    Node next;
    
    Node(int data1, Node next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1 )
    {
        this.data=data1;
        this.next=null;
    }
}
public class delhead
{
    private static Node ConvertArr2LL (int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node removehead (Node head)
    {
        if(head==null)
        {
            return head;
        }
        head = head.next;
        return head;
    }
    private static Node removetail (Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;   
    }
    public static void main(String args[])
        {
            
            int[] arr = {2,5,6,8};
            Node head =  ConvertArr2LL(arr);
            //head = removehead(head);
            Node temp = head;
            head = removetail(head);
            //System.out.println(head);
            while (temp != null)
            {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
}