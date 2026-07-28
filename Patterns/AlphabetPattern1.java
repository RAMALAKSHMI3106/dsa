import java.util.Scanner;
public class AlphabetPattern1 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
              System.out.print((char)(j+64));
          
       }
       System.out.println();
     }
}
}

/*
AlphabetPattern1 Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac AlphabetPattern1.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java AlphabetPattern1
Enter N:
5
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE

*/