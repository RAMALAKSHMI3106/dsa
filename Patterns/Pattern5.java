import java.util.Scanner;
public class Pattern5 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter string:");
   String str=in.nextLine();
   int n=str.length();
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if(i==j|| i+j==n-1)
              System.out.print(str.charAt(j));
           else
              System.out.print(" ");
       }
       System.out.println();
     }
     in.close();
}
}

/*
Pattern 5

C:\Users\USER\Desktop\Java\DSA\Patterns>javac Pattern5.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java Pattern5
Enter string:
ZOHOCORPORATION

Z             N
 O           O
  H         I
   O       T
    C     A
     O   R
      R O
       P
      R O
     O   R
    C     A
   O       T
  H         I
 O           O
Z             N

*/