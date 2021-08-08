import java.util.Scanner;

public class Array {
    private int _size;
    private int count;
    private int counter = 0;
   
    int userArray[];

    Array(int arrysize) {

        this._size = arrysize;
        userArray = new int[_size];
    }

    public void insert(int item) {
 
        if (userArray.length == count) {
            int newArray[] = new int[count * 2];
            for (counter = 0; counter < userArray.length; counter++) {
                newArray[counter] = userArray[counter];
            }
            userArray = newArray;

            userArray[count++] = item;

        } else {
            userArray[count] = item;
            count++;
        }

    }

    public void PrintArray() {
        for (counter = 0; counter < count; counter++) 
        {
            
            System.out.println(userArray[counter]);
        }
    }

    public void RemoveAt(int index)
    {
        if(index<=userArray.length)
        {
            userArray[index]=0;
            for(counter=index;counter<userArray.length-1;counter++)
            {
                userArray[counter]=userArray[counter+1];
            }
        }
        else{
            System.out.println("index out of bounds");
        }



    }

    public void MaxElement()
    {
        int max=userArray[0];
        for(counter=0;counter<userArray.length;counter++)
        {
            if(userArray[counter]>max)
            {
                max=userArray[counter];
            }

        }
        System.out.println("The maximum element in the array is  "+max);

    }

    public void CommonElements(int[] inputaray)
    {
        int counter1=0;
        
        System.out.println("the common elements in the array and input array ");
        for(counter=0,counter1=0;counter<userArray.length&counter1<inputaray.length;counter++,counter1++)
        {
            if(userArray[counter]==inputaray[counter1])
            {
                System.out.println(userArray[counter]);
            }

        }

    }

}
