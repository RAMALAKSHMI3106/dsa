import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);
            
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
       
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = input.nextInt();
        
        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
        input.close();
    }

    private static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }

        return -1;
    }
}
/*
Time Complexity:
Time: O(n)
Space :O(1)

Output:
Enter the size of the array: 5
Enter the array elements:
1 6 2 5 3
Enter the element to search: 2
Element found at index: 3
*/