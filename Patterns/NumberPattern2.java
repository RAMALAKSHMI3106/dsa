import java.util.Scanner;
public class NumberPattern2 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
           if(i>=j)
              System.out.print(i);
           else
              System.out.print(" ");
       }
       System.out.println();
     }
}
}

/*
NumberPattern2 Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac NumberPattern2.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java NumberPattern2
Enter N:
5
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/