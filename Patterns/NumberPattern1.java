import java.util.Scanner;
public class NumberPattern1 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
           if(i>=j)
              System.out.print(j);
           else
              System.out.print(" ");
       }
       System.out.println();
     }
}
}

/*
NumberPattern1 Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac NumberPattern1.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java NumberPattern1
Enter N:
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/