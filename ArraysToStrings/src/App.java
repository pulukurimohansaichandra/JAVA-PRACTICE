import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Array useArray=new Array(3);
        Scanner userinput =new Scanner(System.in);
        useArray.insert(20);
        useArray.insert(30);
        useArray.insert(50);
        useArray.insert(100);
        
        //useArray.RemoveAt(1);
        useArray.PrintArray(); 
        useArray.MaxElement();
        System.out.println("Enter the  size of the array ");
        int duparray[]=new int[userinput.nextInt()];
        for(int counter=0;counter<duparray.length;counter++)
        {
            duparray[counter]=userinput.nextInt();
        }
        useArray.CommonElements(duparray);
}
}