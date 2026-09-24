import java.util.Scanner;
public class NumberPattern7 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    int start=1;
    for(int i=1;i<=n;i++){
        if(i%2==0){
           start=0;
        }
        else{
              start=1;
        }
       for(int j=1;j<=n;j++){
           if(i>=j){
             System.out.print(start);
             start=1-start;
           }
              
            
           else
              System.out.print(" ");
       }
       System.out.println();
     }
     in.close();
}
}

/*
NumberPattern7

C:\Users\USER\Desktop\Java\DSA\Patterns>javac NumberPattern7.java
C:\Users\USER\Desktop\Java\DSA\Patterns>java NumberPattern7
Enter N:
5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/
