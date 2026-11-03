// Array to linkedlist 
class Node
{
    int data;
    Node nxt;
    Node(int data1, Node nxt1)
    {
        this.data=data1;
        this.nxt=nxt1;
    }
    Node(int data1)
    {
        this.data=data1;
        this.nxt=null;
    }
    
}
public class link
{
    private static Node ConvertArr2LL (int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.nxt = temp;
            mover = temp;
        }
        return head;
    }
    private static lengthoflink(Node head)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.nxt;
            count++;
        }
        return count;
    }
    public static void main (String args[])
    {
        
        int[] arr ={12,5,6,8};
        Node head =  ConvertArr2LL(arr);
        Node temp = head;
        System.out.println(lengthoflink(head));
        /*while(temp!= null)
        {
            System.out.println(head.data+"");
            temp = temp.next;
        } */
        
        
    }
}