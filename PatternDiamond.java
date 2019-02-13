import java.util.Scanner;
class PatternDiamond
 {
 
    public static void main(String[] args)
     {
 
         for(int i=1;i<=6;i++)     //outer loop for upper diamond
            {
                 for(int j=1;j<=6-i;j++)     //for space
 
                     {
                          System.out.print(" ");
                     }
 
                 for(int j=1;j<=i*2-1;j++)    //for star print
 
                     {
                          System.out.print("*");
                     }
                 System.out.println();
 
            } 
         for(int i=6-1;i>0;i--)   //outer loop for lower diamond
            {
                 for(int j=1;j<=6-i;j++)   //space loop
 
                     {
                          System.out.print(" ");
                     }
                 for(int j=1;j<=i*2-1;j++)  //print star
 
                    {
                         System.out.print("*");
                     }
              System.out.println();
            }
 
      }
}