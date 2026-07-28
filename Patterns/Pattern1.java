import java.util.Scanner;
public class Pattern1 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           System.out.print("* ");
       }
       System.out.println();
     }
}
}

/*

Pattern 1

C:\Users\USER\Desktop\Java\DSA\Patterns>javac Pattern1.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java Pattern1
Enter N:
3
* * *
* * *
* * *
 
*/