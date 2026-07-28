import java.util.Scanner;
public class RightTriangle2 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if(i+j<=n-1)
              System.out.print("*");
           else
              System.out.print(" ");
       }
       System.out.println();
     }
}
}

/*

RightTriangle-2 Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac RightTriangle2.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java RightTriangle2
Enter N:
6
******
*****
****
***
**
*

*/