public class Ll
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
  public  void insert_at_begining(int data)
    {
        Node newnode= new Node(data);
        if(head==null) {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
public void print()
    {
        Node temp=head;
        System.out.print("congratulations your linkedlist is created successfully = ");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
public void delete_at_begining()
       {
          Node temp=head;
          head=temp.next;
      }
      public void delete_at_end()
     {
    Node temp=head;
    Node ptr=temp.next;
    while(ptr.next!=null)
    {
        temp=ptr;
        ptr=ptr.next;
    }
    temp.next=null;
   }

   public void delete_at_position(int a)
   {
       Node temp=head;
       Node ptr=temp.next;
       for(int i=1;i<(a-1);i++)
       {
           temp=ptr;
           ptr=ptr.next;
       }
       temp.next=ptr.next;
   }
public static void main(String a[])
    {
        Ll obj=new Ll();
        obj.insert_at_begining(40);
        obj.insert_at_begining(30);
        obj.insert_at_begining(20);
        obj.insert_at_begining(10);
        obj.print();
        obj.delete_at_begining();
        obj.delete_at_end();
        obj.delete_at_position(4);
        obj.print();
    }
}
