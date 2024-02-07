class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
//to convert an array to a linkedlist
public class array_to_linked_list {
    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    //to get the size of linkedlist
    public static int getCount(Node head)
    {
        //Your code goes here
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    //to remove head of the linked list
    public static Node remove_head(Node head)
    {
        if(head==null) return head;
        head=head.next;
        return head;
    }
    // to remove tail of the linked list
    public static Node remove_tail(Node head)
    {
        if(head==null || head.next==null) return head;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next= null;
        return head;
    }
    // to remove kth element of the linked list
    public static Node removek(Node head,int k){
        if(head==null) return head;
        if(k==1){
            Node temp=head;
            head =head.next;
            return head;
        }
        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    //to remove a specific value from linked list if present
    public static Node remove_val(Node head,int k){
        if(head==null) return head;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    // to insert in the front of a linkedlist
    private static Node insert_head(Node head,int val){
        return new Node(val,head);
    }
    //to insert in the tail of linked list
    private static Node insert_tail(Node head,int val){
        if(head==null){
            return new Node(val);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode =new Node(val);
        temp.next=newNode;
        return head;
    }
    // to insert a value at a specific position
    private static Node insert_pos(Node head,int val,int k){
        if(head==null){
            if(k==1){
                return new Node(val);
            }
        }
        if(k==1){
            return new Node(val,head);
        }
        int count=0;
        Node temp=head;
        while(temp!= null){
            count++;
            if(count==k-1){
                Node x =new Node(val,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }return head;
    }
    private static Node insert_before_val(Node head,int val,int ele){
        if(head==null){
           return null;
        }
        if(head.data==val) {
            return new Node(ele, head);
        }
        Node temp=head;
        while(temp.next!= null){
            if(temp.next.data==val){
                Node x =new Node(ele,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }return head;
    }

    //to check if the value is present in the linkedlist
    public static int ispresent(Node head,int val){
        //Your code goes here
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return 1;
            }
            temp=temp.next;
        }
        return -1;
    }
    // to print the linked list
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
    int arr[] ={12,3,45,6};
    Node head=convert(arr);
        Node temp= convert(arr);
        //print whole linkedlist
        while(temp!=null){
            System.out.print(" ->"+temp.data);
            temp=temp.next;
        }
        System.out.println();
        System.out.println(getCount(convert(arr)));
        print(head);
        System.out.println(ispresent(convert(arr),45));
        print(head);
        System.out.println(remove_head(convert(arr)).data);
        print(head);
        System.out.println(remove_tail(convert(arr)).data);
        print(head);
        System.out.println(removek(head,3).data);
        print(head);
        System.out.println(remove_val(head,3).data);
        print(head);
        head=insert_head(head,129);
        print(head);
        head=insert_tail(head,234);
        print(head);
        head=insert_pos(head,24,4);
        print(head);
        head=insert_before_val(head,234,40);
        print(head);

    }
}
