import java.util.Scanner;
public class NumberPattern4 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
           if(i+j<=n+1)
              System.out.print(j);
           else
              System.out.print(" ");
       }
       System.out.println();
     }
     in.close();
}
}

/*
NumberPattern4 Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac NumberPattern4.java

C:\Users\USER\Desktop\Java\DSA\Patterns>java NumberPattern4
Enter N:
5
12345
1234
123
12
1

*/