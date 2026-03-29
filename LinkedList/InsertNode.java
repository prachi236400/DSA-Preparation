package LinkedList;

public class InsertNode {
    static class Node{
        int data;
        Node next;

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node convertArrToNode(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }

        return head;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node addAtHead(Node head,int val){
        return new Node(val,head);
    }
    public static Node addAtTail(Node head,int val){
        if(head==null) return head;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=new Node(val,null);
        return head;

    }
    public static Node addAtPosition(Node head, int val,int k){
        if(head==null) return head;
        Node temp=head;
        int count=0;
        //Node newNode=new Node(val,head);
        while(temp.next!=null){
            count++;
            if(count==k-1){
                temp.next=new Node(val,temp.next);

                
            }
            temp=temp.next;
            
        }
        return head;

    }
    public static Node addAtValue(Node head,int val,int d){
        if(head==null) return head;
        Node temp=head;
        
        //Node newNode=new Node(val,head);
        while(temp.next!=null){
            
            if(temp.next.data==val){
                temp.next=new Node(d,temp.next);
                break;

                
            }
            temp=temp.next;
            
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr={2,4,3,5,6};
        Node head=convertArrToNode(arr);
        //System.out.println(head.data);
        // head=addAtHead(head,12);
        // print(head);
        // head=addAtTail(head, 20);
        // print(head);
        // head=addAtPosition(head,30,5);
        // print(head);
        head=addAtValue(head,5,10);
        print(head);
        
    }

    
}
