import java.util.Scanner;

import jdk.internal.util.xml.impl.Input;

public class userinput {
    
    public int[] EnterArrayElements(int [] array, int arraySize)
    {
        
        Scanner input = new Scanner(System.in);
        int counter=0;
        for(counter=0;counter<arraySize;counter++)
        {
            array[counter]= input.nextInt();
        }

        return array;
    }
}
