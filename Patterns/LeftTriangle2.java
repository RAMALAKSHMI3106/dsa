import java.util.Scanner;
public class LeftTriangle2 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if(i<=j)
              System.out.print("*");
           else
              System.out.print(" ");
       }
       System.out.println();
     }
     in.close();
}
}


/*

LeftTriangle-2 Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac LeftTriangle2.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java LeftTriangle2
Enter N:
7
*******
 ******
  *****
   ****
    ***
     **
      *

*/