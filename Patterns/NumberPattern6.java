import java.util.Scanner;
public class NumberPattern6 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    int val=1;
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
           if(i>=j)
              System.out.print(val++ +" ");
           else
              System.out.print(" ");
       }
       System.out.println();
     }
     in.close();
}
}
/*
NumberPattern6 

C:\Users\USER\Desktop\Java\DSA\Patterns>javac NumberPattern6.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java NumberPattern6
Enter N:
5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
