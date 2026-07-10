import java.util.Scanner;
public class BinarySearch {
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
        
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
        input.close();
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid+1;

            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}

/*
Time Complexity:
Time: O(log n)
Space :O(1)

Output:
Enter the size of the array: 5
Enter the array elements:
1 2 3 5 6
Enter the element to search: 2
Element found at index: 2
*/