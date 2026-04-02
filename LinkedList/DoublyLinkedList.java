package LinkedList;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node back;
        Node(int data,Node next,Node back){
            this.data=data;
            this.next=next;
            this.back=back;

        }
        Node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }
    }
    public static Node convertArrToAll(int[] arr){
        
        Node head=new Node(arr[0]);
        

        Node prev=head;
        
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i], null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            
            head=head.next;
        }
        System.out.println();

    }
    public static Node deleteHead(Node head){
        if(head==null || head.next==null) return null;
            Node prev=head;
            head=head.next;
            head.back=null;
            prev.next=null;
        return head;
    }
    public static Node deleteTail(Node head){
        //Node prev=head;
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.back.next=null;

        temp.back=null;
        
        return head;
    }
    public static Node deleteAtK(Node head,int k){
        if(head==null || head.next==null) return null;
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            if(count==k){
                
                // temp.back=null;
                // temp.next=null;
                temp.back.next=temp.next;
                temp.next.back=temp.back;
                
                

            }
            temp=temp.next;
        }
        return head;
    }
    public static Node deleteNode(Node head, int k){
        if(head==null) return null;
        Node temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        if(temp==null) return null;
        if(temp.next!=null){
            temp.next.back=temp.back;

        }

        if(temp.back!=null){
            temp.back.next=temp.next;
        }
        else{
            head=temp.next;
        }
 
        return head;
    }

    public static void main(String[] args){
        int[] arr={3,5,2,6};
        int k=2;
        Node head=convertArrToAll(arr);
        //Node newNode=new Node(arr[2]);
        print(head);
        // head=deleteHead(head);
        // print(head);
        // head=deleteTail(head);
        // print(head);
        // head=deleteAtK(head,k);
        // print(head);
        head = deleteNode(head,k);
        print(head);


    }
    
}
