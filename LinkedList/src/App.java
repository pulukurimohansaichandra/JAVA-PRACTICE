import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         
        Scanner input=new Scanner(System.in);
        LinkedList uselist=new LinkedList();
        uselist.AddLast(20);
        uselist.AddLast(30);
        uselist.AddLast(40);
        uselist.AddFirst(10); 
        uselist.AddFirst(50);
        uselist.AddFirst(100);
        uselist.PrintTheList();
        System.out.println();
        System.out.println("The index of the element 100 is "+uselist.IndexOf(100));
        System.out.println("Please enter the node position  and the item ");
        uselist.InsertAt(input.nextInt(), input.nextInt());
        uselist.PrintTheList();

    }
}
