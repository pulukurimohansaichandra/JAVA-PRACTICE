import java.util.Scanner;

public class SGPA
{
 
    private int counter=0;
     private String Student;
    public double sgpainput()
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the name of the user");
        Student = input.nextLine();
        System.out.println("Enter the nubmer of sems ");
          int sems =input.nextInt();
          double userSgpa[]=new double[sems];
          for(counter=0;counter<sems;counter++)
          {
              System.out.println("Please enter the each sem wise sgpa");
              userSgpa[counter]=input.nextDouble();
          }
        
          return sgpaOut(userSgpa,sems);
    }

    public double sgpaOut(double [] userSgpa,int sems)
    {
       double sum=0;
        for(counter=0;counter<userSgpa.length;counter++)
        {
            sum= sum+ userSgpa[counter]*24;
        }
       
        return (sum)/(sems*24);

    }
    
}
