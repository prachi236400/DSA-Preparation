package LinkedList;
public class InsertionDll {
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
    public static Node addNodeAtHead(Node head,int val){
        if(head==null) return head;

        Node newNode =new Node(val,head,null);
        head.back=newNode;
        return newNode;
    }
    public static Node addAtTail(Node head, int val1){
        if(head==null) return head;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode =new Node(val1,null,temp);
        temp.next=newNode;

        return head;
    }
    public static Node addAtK(Node head,int pos,int val){
        if(head==null) return head;
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;

        }
        Node newNode=new Node(val,temp.next,temp);
        temp.next=newNode;
        temp.next.back=newNode;


        return head;


    }
    public static Node addNode(Node head,int val1){
        if(head==null) return head;
        Node temp=head;
        Node newNode= new Node(val1,temp.next,temp);

    if(temp.next != null){
        temp.next.back = newNode;
    }

    temp.next = newNode;
return head;


    }
    public static Node reverseList(Node head){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp.back;

            temp.back=temp.next;
            temp.next=last;
            temp=temp.back;

        }
        if(last!=null){
            head=last.back;
        }
        return head;
        
    }

    public static void main(String[] args){
        int[] arr={3,5,62,7,8};
        int val=1;
        int val1=10;
        int pos=3;
        Node head=convertArrToAll(arr);
        print(head);
        // head=addNodeAtHead(head,val);
        // print(head);
        // head=addAtTail(head,val1);
        // print(head);
        // head=addAtK(head,pos,val);

        // print(head);
        // head=addNode(head,val1);
        // print(head);
        head=reverseList(head);
        print(head);

    }
    
}
