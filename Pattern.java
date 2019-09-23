/*
1
23
456
78910
*/
public class Pattern 
{
 public static void main(String args[])
 {
     int i,n=1;
     for(i=1;i<=4;i++)
     {
       for(int j=1;j<=i;j++)
       {
           System.out.print(n);
           n++;
       }
      System.out.println(""); 
     }
 }
}
