import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input= new Scanner(System.in);
        int array[]= new int[]{1,2,3,4,5};
        System.out.println("Please enter the number of elements to rotate ");
        int elementsToRotate= input.nextInt();
        System.out.println("Please choose the operation  1 for left rotation and 2 for right rotation");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
            {
                 LeftRotation(array,elementsToRotate);
            }
                
                break;
        
            case 2 : 
            {
             RightRotation(array, elementsToRotate);
            }
            break;
        }

        
    }
    public  static void LeftRotation(int[] array,int userChoice) 
    {
        int temp=array[0];
        for(int counter=0;counter<array.length-1;counter++)
        {
            array[counter]=array[counter+1];
        }

        array[array.length-1]=temp;
         
        System.out.println("Array after Rotation");
        for (int i : array)
         {
             System.out.println(i);
            
        }
        
    }

    public static void RightRotation(int[] array,int userChoice)
    {

        for(int counter=0;counter<userChoice;counter++)
        {
            int temp=array[array.length-1];
            for(int counter1=0;counter1<=array.length;counter1++)
            {
                array[counter1+1]=array[counter1];
            }

            array[0]=temp;
        }

        for (int i : array)
         {
             System.out.println(i);
            
        }
    }
}
