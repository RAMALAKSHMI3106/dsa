import java.util.Scanner;
public class LeftTriangle {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if(i>=j)
              System.out.print("* ");
           else
              System.out.print(" ");
       }
       System.out.println();
     }
     in.close();
}
}

/*

LeftTriangle Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac LeftTriangle.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java LeftTriangle
Enter N:
5
*
* *
* * *
* * * *
* * * * *
*/