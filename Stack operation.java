public class Stack
{
    int top;
    int arr[];
    int length;

    public Stack(int size)
    {
        arr=new int [size];
        length=size;
        top=-1;
    }

    void push(int val)
    {
        if(top==(length-1)) System.out.println("stack is overflow");
        arr[++top]=val;
    }

    int pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
        return -1;
    }
        return arr[top--];     // first it will return the value after pointing next element of stack
    }

    int peek()
    {
        if(top==-1) {
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }

    void print()
    {
        System.out.print("stack elements are:"+" ");
      for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args)
    {
        Stack s1=new Stack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        s1.print();
        System.out.println("element popped:"+ " "+s1.pop());
        s1.print();
        System.out.print("element accessed:"+ " "+s1.peek());
    }
}
