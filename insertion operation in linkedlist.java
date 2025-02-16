class Ll
{
    Node head;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void insert_at_begining(int data)
    {
        Node newnode= new Node(data);
        if(head==null) {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void insert_at_end(int data)
    {
     Node newnode=new Node(data);
     if(head==null){
         head=newnode;
         return;
     }
     Node temp=head;
     while(temp.next!=null){
         temp=temp.next;
     }
     temp.next=newnode;
    }
    void insert_at_position(int p,int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        for(int i=1;i<3-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    void print()
    {
        Node temp=head;
        System.out.print("congratulations your linkedlist is created successfully = ");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String a[])
    {
        Ll obj=new Ll();
        obj.insert_at_begining(40);
        obj.insert_at_begining(30);
        obj.insert_at_begining(20);
        obj.insert_at_begining(10);
        obj.print();
        obj.insert_at_end(50);
        obj.print();
        obj.insert_at_position(3,60);
        obj.print();
    }
}
