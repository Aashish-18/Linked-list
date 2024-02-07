class Node1{
    int data;
    Node next;
    Node1(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node1(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class Linked_list {
    public static void main(String args[]){
        int arr[]={3,5,6,78,9};
        Node y=new Node(arr[2]);
        System.out.println(y.data);

    }
}
