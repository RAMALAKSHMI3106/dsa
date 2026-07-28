import java.util.Scanner;
public class Pattern4 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if(i==j||i+j==n-1)
              System.out.print("* ");
           else
              System.out.print(" ");
       }
       System.out.println();
     }
}
}
 
/*

Pattern 4

C:\Users\USER\Desktop\Java\DSA\Patterns>javac Pattern4.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java Pattern4
Enter N:
6
*     *
 *   *
  * *
  * *
 *   *
*     *


*/