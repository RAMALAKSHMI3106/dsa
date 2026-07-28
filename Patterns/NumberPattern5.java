import java.util.Scanner;
public class NumberPattern5 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=in.nextInt();
    for(int i=1;i<=n;i++){
      int c=i;
       for(int j=1;j<=n;j++){
           if(i>=j){
              System.out.print(c +" ");
              c=c+n-j;
           }
           else{
               System.out.print(" ");
           }
              
       }
       System.out.println();
     }
}
}

/*
ZOHO Pattern

C:\Users\USER\Desktop\Java\DSA\Patterns>javac NumberPattern5.java

C:\Users\USER\Desktop\Java\DSA\Patterns>java NumberPattern5
Enter N:
5
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/