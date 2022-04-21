import java.util.*;
class Reverse_number
  {
    //main method
    public static void main(String args[])
    {
      //declear a varaible
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter reverse number");
      n=sc.nextInt();
      {
        //using for loop
        for(i=n;i>=1;i--)
          {
            //print result
            System.out.println(i);
          }
      }
    }
  }