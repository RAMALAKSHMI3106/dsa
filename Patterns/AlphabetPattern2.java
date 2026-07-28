import java.util.Scanner;
public class AlphabetPattern2 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
              if(i%2!=0)
              System.out.print((char)(i+96));
              else
              System.out.print((char)(i+64));
       }
       System.out.println();
     }
}
}

/*
AlphabetPattern2 Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac AlphabetPattern2.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java AlphabetPattern2
Enter N:
5
a a a a a
B B B B B
c c c c c
D D D D D
e e e e e

*/