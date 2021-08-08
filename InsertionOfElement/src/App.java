import java.util.Scanner;

import javax.lang.model.type.ArrayType;

public class App {
    public static void main(String[] args) throws Exception {
        
        int counter=0;
        userinput inputarray=new userinput();
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the array size");
        int arraySize=input.nextInt();
         int array[]=new int[arraySize];
         array= inputarray.EnterArrayElements(array, arraySize);
         for(counter=array.size;counter)
    }
}
