import java.util.Scanner;
public class Anagram{
    public static void main(String args[]){
          Scanner in =new Scanner(System.in);
          System.out.println("Enter the String1:");
          String s1=in.nextLine();
          System.out.println("Enter the String2:");
          String s2=in.nextLine();
          boolean result=isAnagram(s1,s2);
          if(result==true){
             System.out.println("It is valid Anagram");
           }
           else{
             System.out.println("It is not valid Anagram");
            }
            in.close();
            
     }
     private static boolean isAnagram(String s,String t){
         if(s.length()!=t.length()){
             return false;
          }
         int freq[]=new int[26];
         for(int i=0;i<s.length();i++)
         {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
          }
          for(int i:freq){
            if(i!=0){           
               return false;
             }
          }
          return true;
     }
}
