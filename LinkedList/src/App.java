import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         
        Scanner input=new Scanner(System.in);
        LinkedList uselist=new LinkedList();
        System.out.println("--------------------------");
        System.out.println("Operations on Linked List ");
        System.out.println("--------------------------");
        char userChoice;
        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("Below are the options for the operations on the linked list ");
            System.out.println("1. Add at First");
            System.out.println("2. Add at Last ");
            System.out.println("3. Insert the data at particular node");
            System.out.println("4. Remove the element at First");
            System.out.println("5. Remove the element at Last");
            System.out.println("6. Print the list ");
            System.out.println("7. Size of the linkedList");
            System.out.println("8. Convert the linked list  into Array");
            
            System.out.println("------------------------------------------------------------");
                System.out.println();
            System.out.println("Please choose an option ");
             switch (input.nextInt()) {
                 case 1:
                 {
                     System.out.println("Enter the number to add first ");
                     uselist.AddFirst(input.nextInt());

                 } break;
                 case 2:
                 {
                    System.out.println("Enter the number to add Last ");
                    uselist.AddLast(input.nextInt());

                 } break;
                 case 3:
                 {
                     System.out.println("Check the list to choose a data to change");
                     uselist.PrintTheList();
                     System.out.println("Enter the node position and data position" );
                     uselist.InsertAt(input.nextInt(),input.nextInt());
                     System.out.println("List after modification ")
                     ;
                     uselist.PrintTheList();

                 } break;
                 case 4:
                 {
                     uselist.RemoveFirst();

                 } break;
                 case 5:
                 {

                    uselist.RemoveLast();

                 } break;
                 case 6:
                 {

                    uselist.PrintTheList();
                 } break;
                 case 7:
                 {
                    System.out.println("The size of the linked list is ");
                    System.out.println(uselist.Size());

                 }break;
                 case 8:
                 {
                    var array= uselist.toArray();
                     System.out.println(Arrays.toString(array));

                 }break;

             
                 
             }

             System.out.println("Do you wish to countinue the operations on the list(y/n)");
              userChoice=input.next().charAt(0);
        } while (userChoice=='y');

    }
}
