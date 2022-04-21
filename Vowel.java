import java.util.*;
class Oddnumber
  {
    //main method 
    public static void main(String args[])
    {
      //declear a varaible
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Odd number");
      //using for loop
      for(i=1;i<=n;i++)
        {
          if(i%2!=0)
          {
            //print result
            System.out.println(i);
          }
        }
    }

  }