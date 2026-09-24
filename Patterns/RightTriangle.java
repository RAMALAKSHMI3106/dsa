import java.util.Scanner;
public class RightTriangle {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if(i+j>=n-1)
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

RightTriangle Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac RightTriangle.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java RightTriangle
Enter N:
5
    *
   **
  ***
 ****
*****

*/