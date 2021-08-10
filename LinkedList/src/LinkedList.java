import java.sql.Date;
import java.util.spi.CurrencyNameProvider;

public class LinkedList {
    
    private Node first;
    private Node last;
    private int size=0;
    private class Node
    {
        private int data;
        private Node next;

        public Node(int item)
        {
            data=item;
        }
    }

    public void AddLast(int item)
    {
        var node=new Node(item);
        if(first==null)
        {
            first=last=node;
        }
        else
        {
            last.next=node;
             last=node;
        }

        size++;
    }

    public void AddFirst(int item)
    {
        var node = new Node( item);

        if(first==null)
        {
            first=last=node;
        }

        else
        {
            node.next=first;
            first=node;
        }
        size++;

    }

    public void PrintTheList()
    {

        Node current=first;
        System.out.println("Elements in the list ");
        while(current!=null)
        {
            System.out.print(current.data+"--->");
            current=current.next;

        }

    }

     public int IndexOf(int item)
     {
         int index=0;
         int result=0;
         Node current =first;
         while(current!=null)
         {

            if(current.data==item)
               result=index;
           
              index++;
             current=current.next;
         }

         return result;
     }

     public void InsertAt(int nodenumber,int item)
     {

        int nodepostion=0;
        Node current=first;
        while(current!=null)
        { 
            if(nodepostion==nodenumber-1)
            {
                current.data=item;

            }

            nodepostion++;
            current=current.next;


        }

       size++;
       
     }

     public boolean Contains(int item)
     {
         Node current=first;
         boolean result=false;
         while(current!=null)
         {
             if(current.data==item)
              result=true;
            

            current=current.next;

         }
         return result;
     }

     public void RemoveFirst()
     {

         
        first=first.next;
        size--;
     }

     public void RemoveLast()
     {
         var current = first;
         while(current!=null)
         {
             if(current.next.next==null)
             {
                 current.next=null;
                 break;
             }
             
             else{
                 current=current.next;
             }
             size--;
         }
     }

     public int Size()
     {
       
        return size;
     }


     public int[] toArray()
     {
         int array[]=new int[size];
         var current=first;
         var index=0;
         while(current!=null)
         {
             array[index]=current.data;
             index++;
             current=current.next;

         }
         return array;
     }
}
