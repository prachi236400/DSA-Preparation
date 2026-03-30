package LinkedList;
public class CreateNode {
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
    public static void traversal(int[] arr,Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
        
    }
    public static int length(int[] arr, Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static int search(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val) return 1;
            temp=temp.next;
        }
        return 0;


    }
    public static void print(int[] arr,Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;


        }System.out.println();
    }
    public static Node deleteHead(int[] arr,Node head){
        if(head==null) return head;
        Node temp=head;
        head=head.next;


        return head;
    }
    public static Node deleteTail(int[] arr,Node head){
        if(head==null || head.next==null) return head;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deleteK(int[] arr,Node head,int k){
        if(head==null) return head;
        Node temp=head;
        if(k==1){
            head=deleteHead(arr,head);
        }
        int count=0;
        while(temp.next!=null){
            //temp=temp.next;
            count++;

        

        if(count==k-1){
            temp.next=temp.next.next;
        }
        temp=temp.next;

    }

        return head; 
    }
    public static Node deleteElement(int[] arr,Node head,int ele){
        if(head==null) return head;
        Node temp=head;
        Node prev=null;
        if(head.data==ele){
            head=deleteHead(arr,head);
        }
        //int count=0;
        while(temp.next!=null){
            //temp=temp.next;
            //count++;

        

        if(temp.data==ele){
            prev.next=prev.next.next;
        }
        prev=temp;
        temp=temp.next;
        

    }

        return head; 
    

    }



    public static void main(String[] args){
        int[] arr={2,4,3,5,6};
        int val=1;
        int k=2;
        int ele=5;
        Node head=convertArrToNode(arr);
        System.out.println(head.data);
        traversal(arr,head);
        System.out.println(length(arr,head));
        System.out.println(search(head,val));
        // head=(deleteHead(arr,head));
        // print(arr,head);
        // head=deleteTail(arr,head);
        // print(arr,head);
        // head= deleteK(arr,head,k);
        // print(arr,head);
        head =deleteElement(arr,head,ele);
        print(arr,head);
    }
    
}

    


    

